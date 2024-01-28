import java.util.Scanner;
public class experimentation { // Class declaration
    public static void main(String[] args) { // Main method where the program starts
        numbersA(); // Calling the numbersA method
    }
    public static void numbersA() { // Definition of the numbersA method
        Scanner scan = new Scanner(System.in); // Creating a Scanner object to read user input
        int positiveNumbers = 0; // Initializing a variable to store the sum of positive numbers
        int countNumbers = 0; // Initializing a variable to count the number of positive numbers
        // Loop that continues until explicitly broken
        while (true) {
            System.out.println("Enter a number not 0, if you enter 0 you will terminate the program"); // Prompting the user for input
            int input = scan.nextInt(); // Reading an integer input from the user
            if (input == 0) { // Checking if the input is 0
                break; // Exiting the loop if the input is 0
            } else if (input > 0) { // Checking if the input is positive
                positiveNumbers += input; // Adding the positive input to the sum
                countNumbers++; // Incrementing the count of positive numbers
            }
        }
        if (countNumbers > 0) { // Checking if at least one positive number was entered
            int average = positiveNumbers / countNumbers; // Calculating the average of positive numbers
            System.out.println("Average: " + average); // Printing the calculated average
        } else { // If no positive numbers were entered
            System.out.println("No positive numbers entered. Cannot calculate average."); // Displaying a message
        }
    }
}
//        Scanner scan = new Scanner(System.in);
//        int num = 0;
//        int sum = 0;
//        int count = 0;
//        while(true){
//            System.out.println("Give me a number");
//            int number = scan.nextInt();
//            if(number !=0){
//                sum+= number;
//                count++;
//                continue;
//            }else{
//                break;
//            }
//        }
//        System.out.println("Number of numbers; " + count + " The total sum is " + sum);

//        String duffel [] = {"pants", "shirts", "jacket"};
//        int len = duffel.length;
//        for(int i=0; i<len; i++){
//            System.out.println(duffel[i]);
//        }
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter you favorite type of trousers \t");
//        duffel [0] = scan.nextLine();
//        System.out.println("The first item on the list now is " + duffel[0]);



