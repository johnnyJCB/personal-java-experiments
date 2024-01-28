import java.util.Scanner;
public class readingUserInputChallenge {
    public static void main(String[] args) {
        userInputChallenge();
    }

    public static void userInputChallenge() {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console
        int counter = 1; // Initialize a counter variable to keep track of the number of inputs
        int sum = 0; // Initialize a variable to hold the sum of the numbers entered

        while(counter <= 5){ // Start a loop that continues until 5 numbers are entered
            System.out.println("Enter number #" + counter + ":"); // Prompt the user to enter a number
            String nextNumber = scanner.nextLine(); // Read the next line of input as a string
            try{ // Start a try block to handle potential exceptions
                int number = Integer.parseInt(nextNumber); // Convert the input string to an integer
                counter++; // Increment the counter to track the number of inputs
                sum += number; // Add the entered number to the total sum
            } catch (NumberFormatException nfe){ // Catch a NumberFormatException if the input cannot be converted to an integer
                System.out.println("Invalid Number"); // Print an error message for invalid input
            }
        } // End of the while loop
        System.out.println("The sum of the 5 numbers is " + sum); // Print the total sum of the entered numbers
    } // End of the method definition
}