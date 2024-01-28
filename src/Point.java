public class Point {
    private int x;
    private int y;
    // Default constructor setting x and y to 0
    public Point() {
    }

    // Constructor with parameters for x and y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter method for x
    public int getX() {
        return x;
    }

    // Getter method for y
    public int getY() {
        return y;
    }

    // Setter method for x
    public void setX(int x) {
        this.x = x;
    }

    // Setter method for y
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate distance from the origin (0,0)
    public double distance() {
        return distance(0, 0);
    }

    // Method to calculate distance from another Point object
    public double distance(Point a) {
        return distance(a.x, a.y);
    }

    // Method to calculate distance from coordinates (x, y)
    public double distance(int x, int y) {
        int xDiff = this.x - x; // Calculate x difference
        int yDiff = this.y - y; // Calculate y difference
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff); // Calculate distance using the distance formula
    }
}

