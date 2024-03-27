class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ShortestDistance {
    public static double calculateDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public static double findShortestDistance(Point[] points) {
        double shortestDistance = Double.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = calculateDistance(points[i], points[j]);
                if (distance < shortestDistance) {
                    shortestDistance = distance;
                }
            }
        }
        return shortestDistance;
    }

    public static void main(String[] args) {
        Point[] points = {new Point(1, 2), new Point(4, 6), new Point(7, 8), new Point(3, 1)};
        double shortestDistance = findShortestDistance(points);
        System.out.println("Shortest distance between the points: " + shortestDistance);
    }
}