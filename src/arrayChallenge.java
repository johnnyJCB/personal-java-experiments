import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class arrayChallenge {
    public static void main(String[] args) {
        array1(); // Call the array1() method from the main method
    }
    public static void array1() {
        Random random = new Random(); // Create a Random object to generate random numbers
        Integer[] myArray = new Integer[10]; // Create an array of Integers (wrapper class) with a length of 10
        // Loop to fill the array with random integers between 0 (inclusive) and 999 (exclusive)
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1000);
        }
        // Print the original contents of the array as a string
        System.out.println(Arrays.toString(myArray));
        // Sort the array elements in reverse order (from highest to lowest)
        Arrays.sort(myArray, Collections.reverseOrder());
        // Print the sorted contents of the array as a string
        System.out.println(Arrays.toString(myArray));
    }
}
