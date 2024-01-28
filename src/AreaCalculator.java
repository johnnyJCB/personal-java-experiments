public class AreaCalculator {
    public static void main(String[] args) {

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return (radius * 3.14);
    }

    public static double areOfRectangle(double x, double y) {
        if ((x < 0) ||(y < 0)){
            return -1.0;
        }
        return (x * y);
    }
    }

