import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class arrayListChallenge {
    public static void main(String[] args) {
        challenge();
    }
    public static void challenge(){
        // Prompt the user to enter a choice: 0 for shutdown, 1 to add items, 2 to remove items
        System.out.println("Enter 0 to shut down, Enter 1 to add items to the list, or enter 2 to remove any items");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt(); // Read user input
        ArrayList<String> groceries = new ArrayList<>(); // Create an ArrayList to store grocery items
        if(input==0){
            System.out.println("System shutting down"); // If input is 0, display shutdown message
        } else if(input==1) {  // If input is 1, add items to the list
            System.out.println("Insert the items you wish to add to your groceries list");
            // Loop to add items until the user enters "done"
            for(int i = 0; ;i++) {
                String userInput = scan.next(); // Read user input

                if (userInput.equalsIgnoreCase("done")) { // Check if user input is "done" to exit the loop
                    break; // Exit the loop if input is "done"
                } else {
                    groceries.add(userInput); // Add the user input to the groceries list
                    Collections.sort(groceries); // Arrange list in order
                    System.out.println(groceries); // Print the current contents of the groceries list
                }
            }
        } else { // If input is 2 or any other value, attempt to remove items from the list
            System.out.println("Insert the items you wish to remove from your groceries list");
            // Loop to remove items until the user enters "done"
            for(int i = 0; ;i++) {
                String userInput = scan.next(); // Read user input
                if (userInput.equalsIgnoreCase("done")) { // Check if user input is "done" to exit the loop
                    break; // Exit the loop if input is "done"
                } else {
                    if (groceries.contains(userInput)) { // Check if the groceries list contains the input item
                        groceries.remove(userInput); // Remove the user input from the groceries list
                        Collections.sort(groceries); // Arrange list in order
                        System.out.println(groceries); // Print the current contents of the groceries list
                    } else {
                        System.out.println("Item not found in the groceries list."); // Inform user if the item is not found
                    }
                }
            }
        }
        Collections.sort(groceries); // Arrange list in order
        System.out.println(groceries); // Print the final contents of the groceries list
    }
}