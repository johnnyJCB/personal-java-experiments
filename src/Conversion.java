public class Conversion {
    public static void main(String[] args) {
        double method1 = convertToCentimeters(68);
        System.out.println(method1);
        double method2 = convertToCentimeters(5, 8);
        System.out.println(method2);

//        double method3 = convertToCentimeters(convertToCentimeters(5,8));
//        System.out.println(method3);
    }
    public static double convertToCentimeters(int heightinches) {
        double heightinches1 = heightinches;
               return heightinches1 * 2.54;

    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        int feetToInches = (heightInFeet * 12);
        int totalInches = (int)(feetToInches + heightInInches);
        double totalCentimeters = convertToCentimeters(totalInches);
            return totalCentimeters;
//           short way: return convertToCentimeters((heightInFeet * 12) + heightInInches);

    }
}
