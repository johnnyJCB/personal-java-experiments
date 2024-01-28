import java.util.Arrays;
import java.util.Scanner;
public class minimumElement {
    public static void main(String[] args) {
        // Reading the number of elements from the user
        int count = readInteger();
        // Reading elements and storing them in an array
        int[] result = readElements(count);
        // Printing the array of elements
        System.out.println(Arrays.toString(result));
        // Finding the minimum value in the array
        int minValue = findMin(result);
        // Printing the minimum value found in the array
        System.out.println("Minimum value in the array: " + minValue);
    }
    // Method to read the number of elements from the user
    public static int readInteger() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        return scan.nextInt();
    }
    // Method to read elements based on the count provided and store them in an array
    public static int[] readElements(int count) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[count]; // Creating an array of the specified size
        for (int i = 0; i < count; i++) {
            int input = scan.nextInt(); // Reading elements from the user
            array[i] = input; // Storing elements in the array
        }
        return array; // Returning the array containing the entered elements
    }
    // Method to find the minimum value in the provided array
    public static int findMin(int[] array) {
        int minimumValue = array[0]; // Assuming the first element as the initial minimum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimumValue) {
                minimumValue = array[i]; // Updating minimumValue if a smaller value is found
            }
        }
        return minimumValue; // Returning the minimum value found in the array
    }
    public static int [] reverse(int[] array){
        int [] list = {1,2,3,8,9};
        int [] newList = new int[5];
        for(int i = 4; i<list.length; i--){
            newList[i] = i;
        }return newList;
    }
}
