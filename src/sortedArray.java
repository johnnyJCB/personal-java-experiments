import java.util.Arrays;
import java.util.Scanner;
public class sortedArray {
    public static void main(String[] args) {
        // Calling the getIntegers method to get an array of integers from user input
        // and then calling the printArray method to print the obtained array.
//        printArray(getIntegers(5)); not used
        /*the getIntegers method is called to obtain an array of integers from the user with a
        size of 4. The returned array is then passed to the sortedArray2 method, which sorts the
        array of integers and returns the sorted array. Finally, the printArray method is called to print
        the sorted array.*/
        printArray(sortedArray2(getIntegers(4)));
    }
    // Method to get integers from user input and return an array of Integer objects
    public static Integer[] getIntegers(int size) {
        Scanner scan = new Scanner(System.in);
        Integer[] newArray1 = new Integer[size]; // Creating an Integer array of given size
        for (int i = 0; i < newArray1.length; i++) {
            System.out.println("Enter a number, inputted numbers will be ordered in an array");
            newArray1[i] = scan.nextInt(); // Assigning user input to the array elements
        }
        return newArray1; // Returning the array filled with user input
    }
    // Method to print the contents of an array of Integer objects
    public static void printArray(Integer[] newArray1) {
        for (int i = 0; i < newArray1.length; i++) {
            System.out.println("Element " + i + " contents " + newArray1[i]);
        }
    }
    // Method to sort an array of Integer objects and return the sorted array
    public static Integer[] sortedArray2(Integer[] arrayToSort) {
        Arrays.sort(arrayToSort); // Sorting the array using Arrays.sort() method
        return arrayToSort; // Returning the sorted array
    }
}