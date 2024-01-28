import java.sql.SQLOutput;
import java.util.Scanner;

public class minMaxChallenge {
    public static void main(String[] args) {
        minMax(8);
    }

    public static void minMax(int number) {
        int min = Integer.MAX_VALUE; // Initialize min to maximum possible integer value
        int max = Integer.MIN_VALUE; // Initialize max to minimum possible integer value
        Scanner scan = new Scanner(System.in);
        // Start an infinite loop
        do {
            System.out.println("Enter a number, or any character to quit");
            // Check if the next input is an integer
            if (scan.hasNextInt()) {
                number = scan.nextInt(); // Read the next integer input
                // Check if the entered number is smaller than the current 'min'
                if (number < min) {
                    min = number; // Update 'min' if the entered number is smaller
                }
                // Check if the entered number is larger than the current 'max'
                if (number > max) {
                    max = number; // Update 'max' if the entered number is larger
                }
            }else {
                // Display a message for non-numeric input and exit the loop
                System.out.println("You have entered a character, not a number.\nGOOODBYE!!");
                break; // Exit the loop
            }
        } while (true); // Continue the loop indefinitely unless 'break' is encountered
        // Display the minimum and maximum numbers entered after exiting the loop
        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
    }
}




