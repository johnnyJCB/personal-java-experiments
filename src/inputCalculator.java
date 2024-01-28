import java.util.Scanner;

public class inputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in); // Initialize a scanner to read input
        int sum = 0; // Variable to store the sum of integers
        long avg = 0; // Variable to store the average
        int count = 0; // Variable to count the number of inputs
        while (true) { // Start an indefinite loop
            // Check if the next input is an integer
            if (scan.hasNextInt()) {
                int number = scan.nextInt(); // Read the next integer input
                sum += number; // Add the input to the running sum
                count++; // Increment the count of inputs
            } else {
                break; // If non-integer input is encountered, exit the loop
            }
        }
        if (count > 0) {
            // Calculate the average using floating-point arithmetic for precision
            /*Sometimes, when you do division with integers (whole numbers), you might lose some precision
            in the result. Imagine dividing 7 by 2. The result is 3.5, but if you use integers, it would give you 3
            because it doesn't consider the decimal part. To avoid this loss of precision, the code temporarily
            converts the sum to a double (a type of number that includes decimals) before dividing.
             Rounding using Math.round(): Once the division is done and you've got a decimal number as the average
             (which might not be a whole number), you can use rounding to make it a whole number. */
            avg = Math.round((double) sum / count);
        }
        // Display the sum and average after the loop ends or non-integer input is encountered
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scan.close(); // Close the scanner to release resources
    }
    }


