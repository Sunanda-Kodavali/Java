package org.example;

import org.example.Game.GameState;
import org.example.commands.Command;
import org.example.commands.CreateRandomDirectionsCommand;
import org.example.commands.MoveCommand;
import org.example.types.Direction;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Let's start with a very simple version of a turn based text adventure
        System.out.println("Welcome to the Text Adventure!");
        System.out.println("-----------------------------");

        System.out.println("Enter \"quit\" to quit");


        boolean gameRunning = true;
        Game_info gameInfo = null;

        String sql = "SELECT * FROM game_info";

        try (Statement statement = DBUtils.getConnection().createStatement()) {

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {

                byte[] dataBytes = resultSet.getBytes("data");
                GameState data = SerializationUtils.deserialize(dataBytes);
                gameInfo = new Game_info(resultSet.getInt("id"),
                        resultSet.getString("save_name"),
                        data);
            }
        } catch (ClassNotFoundException | IOException | SQLException e) {
            throw new RuntimeException(e);
        }


        // We need an input scanner


        GameState gs;
        if (gameInfo != null) {
            gs = gameInfo.data();
        } else {
            gs = new GameState();
        }
        new CreateRandomDirectionsCommand().execute(gs);
        Scanner scanner = new Scanner(System.in);
        // Then we start a loop
        while (gameRunning) {
            System.out.println("Where do you want to swim? (You have " + gs.getStepsRemaining() + " step left)");
            System.out.println("[left] for " + gs.getNextLeft() + " | [right] for " + gs.getNextRight());
            System.out.print("> ");
            // Read from  input
            String input = scanner.nextLine();

            // execute some command
            try {
                switch (input) {
                    case "left":
                        Command moveLeft = new MoveCommand(Direction.LEFT);
                        moveLeft.execute(gs);
                        new CreateRandomDirectionsCommand().execute(gs);
                        System.out.println("You swam into the " + gs.getCurrentArea());
                        System.out.println("You have " + gs.getScalesCollected() + " Scales now.");
                        break;
                    case "right":
                        Command moveRight = new MoveCommand(Direction.RIGHT);
                        moveRight.execute(gs);
                        new CreateRandomDirectionsCommand().execute(gs);
                        System.out.println("You swam into the " + gs.getCurrentArea());
                        System.out.println("You have " + gs.getScalesCollected() + " Scales now.");
                        break;
                    case "quit":
                        // quit the loop when "quit" was entered or then the game is over
                        gameRunning = false;
                        break;
                    case null, default:
                        System.out.println("Wrong input!");
                }
                if (gs.getEatenBy() != null) {
                    gameRunning = false;
                    System.out.println("You got eaten by a " + gs.getEatenBy() + "!");
                } else if (gs.getScalesCollected() >= 10) {
                    gameRunning = false;
                    System.out.println("You have Found Nemo. You swim off together happily!");
                } else if (gs.stepsRemaining < 1) {
                    gameRunning = false;
                    System.out.println("You have exhausted yourself. Try to find Nemo tomorrow. Game Over!");
                }

                // if gameRunning == false -> remove from db
                // saving game here
                
                
                if(gameRunning){
                    
                    String sqlinsert = "INSERT INTO game_info (?, ?)";

                    try (PreparedStatement preparedStatement = DBUtils.getConnection().prepareStatement(sqlinsert)) {
                        preparedStatement.setString(1,"auto");
                        preparedStatement.setBytes(2,SerializationUtils.serialize(gs));

                        int affected = preparedStatement.executeUpdate();
                        if (affected > 0) {
                            System.out.println("You have successfully saved your game. ");
                        }
                        
                    } catch (IOException | SQLException e) {
                        throw new RuntimeException(e);
                    }
                }else{
                    String sqldelete = "DELETE FROM game_info";

                    try (PreparedStatement preparedStatement = DBUtils.getConnection().prepareStatement(sqldelete)) {
                        
                        int affected = preparedStatement.executeUpdate();
                        if (affected > 0) {
                            System.out.println("You have successfully deleted your game. ");
                        }

                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
               
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Goodbye, see you next time!");
    }
}