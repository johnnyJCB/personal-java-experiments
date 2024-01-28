import java.util.Arrays;
import java.util.Scanner;
public class minimumElementChallenge {
    public static void main(String[] args) {
        // Invoking the readIntegers method to populate an array with 4 integers
        int[] result = readIntegers(4);
        System.out.println(Arrays.toString(result)); // Printing the array of integers

        // Finding the minimum value in the array using the findMin method
        int minValue = findMin(result);
        System.out.println("Minimum value in the array: " + minValue); // Printing the minimum value
    }
    // Method to read integers from the user input and store them in an array
    public static int[] readIntegers(int size) {
        Scanner scan = new Scanner(System.in);
        int[] arrayList = new int[size]; // Creating an array of specified size
        System.out.println("Enter " + size + " integers:");
        // Loop to read 'size' number of integers and store them in the array
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = scan.nextInt(); // Reading an integer from user input
        }
        return arrayList; // Returning the array containing the entered integers
    }
    // Method to find the minimum value in an array of integers
    public static int findMin(int[] array) {
        int minimumValue = array[0]; // Assuming the first element as the initial minimum value
        // Loop through the array to compare each element with the current minimumValue
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimumValue) {
                minimumValue = array[i]; // Update minimumValue if a smaller value is found
            }
        }
        return minimumValue; // Returning the minimum value found in the array
    }
}