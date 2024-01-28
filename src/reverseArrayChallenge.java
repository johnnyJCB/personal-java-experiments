import java.util.Arrays;

public class reverseArrayChallenge {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 8, 9}; // Define your input array
        // Pass the input array to the reverse method
        int[] result = reverse(inputArray);
        // Print the reversed array
        System.out.println(Arrays.toString(result));
    }
    // Method to reverse an array
    public static int[] reverse(int[] array) {
        int[] newList = new int[array.length]; // Creating a new array to store reversed elements
        // Loop to iterate through the input array in reverse order
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            newList[j] = array[i]; // Assigning elements of the input array in reverse order to the new array
        }
        return newList; // Return the reversed array
    }
//    private static void reverse(int[] array) {
//        int[] newList = new int[array.length]; // Creating a new array to store reversed elements
//        // Loop to iterate through the input array in reverse order
//        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
//            newList[j] = array[i]; // Assigning elements of the input array in reverse order to the new array
//        }
//        System.out.println("Array = " +Arrays.toString(array));
//        System.out.println("Reversed array = " +Arrays.toString(newList));
//    }
}
