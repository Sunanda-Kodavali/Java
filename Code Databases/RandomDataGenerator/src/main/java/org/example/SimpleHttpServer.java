package org.example;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.*;
import java.util.Map;
import java.util.HashMap;

public class SimpleHttpServer {

    public static void main(String[] args) throws IOException {
        // Create an HTTP server listening on port 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Define a simple handler that returns a response based on the "number" parameter
        server.createContext("/", new MyHandler());

        // Start the server
        server.start();
        System.out.println("Server started on port 8080");
    }

    // Handler to manage incoming requests
    static class MyHandler implements HttpHandler {
        private final HashMap<Integer, String> cache = new HashMap<>();
        @Override
        public void handle(HttpExchange exchange) throws IOException {

            long tsStart = System.currentTimeMillis();
            // Parse query parameters
            Map<String, String> queryParams = parseQueryParams(exchange.getRequestURI().getQuery());

            // Get the "number" parameter from the query string
            String numberParam = queryParams.get("number");
            String response = "";

            if (numberParam != null) {
                try {
                    int number = Integer.parseInt(numberParam);
                    // Fetch results from the database
                    if (this.cache.containsKey(number)) {
                        response +=  this.cache.get(number);
                        System.out.println("reading from cache for number " + number);
                    } else {
                        response = fetchDataFromDB(number);
                        this.cache.put(number, response);
                    }
                    // Send the response back to the browser
                    long tsDiff = System.currentTimeMillis() - tsStart;
                    response += " ( duration=" + tsDiff + " ms )";
                    exchange.sendResponseHeaders(200, response.length());
                    OutputStream os = exchange.getResponseBody();
                    os.write(response.getBytes());
                    os.close();
                } catch (NumberFormatException e) {
                    response = "Invalid number format.";
                }
            } else {
                response = "Please provide a 'number' parameter.";
            }

            // Send response back to client
            exchange.sendResponseHeaders(200, response.length()); // HTTP 200 OK
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

        private String fetchDataFromDB(int number) {
            StringBuilder result = new StringBuilder();


            try {
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/random_data_db",
                        "root",
                        "sunanda123"
                );


                // Prepare and execute SQL query
                String query = "SELECT color, COUNT(*) as count FROM random_entries WHERE number = ? GROUP BY color";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, number);
                ResultSet resultSet = preparedStatement.executeQuery();

                boolean hasResults = false;
                while (resultSet.next()) {
                    hasResults = true;
                    String color = resultSet.getString("color");
                    int count = resultSet.getInt("count");
                    result.append(color).append(": ").append(count).append(", ");
                }

                // Remove the trailing comma and space
                if (result.length() > 2) {
                    result.setLength(result.length() - 2);
                }

                if (!hasResults) {
                    result.append("No results found for number ").append(number);
                }

            } catch (SQLException e) {
                e.printStackTrace();
                result.append("Error fetching data from database!");
            }
            return result.toString();
        }

        // Utility method to parse query parameters
        private Map<String, String> parseQueryParams(String query) {
            Map<String, String> queryParams = new HashMap<>();
            if (query != null) {
                String[] pairs = query.split("&");
                for (String pair : pairs) {
                    String[] keyValue = pair.split("=");
                    if (keyValue.length > 1) {
                        queryParams.put(keyValue[0], keyValue[1]);
                    }
                }
            }
            return queryParams;
        }
    }
}
