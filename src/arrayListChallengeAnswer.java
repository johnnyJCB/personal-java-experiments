import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class arrayListChallengeAnswer {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printActions(); // Display available actions to the user
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries); // Perform action to add items
                case 2 -> removeItems(groceries); // Perform action to remove items
                default -> flag = false; // Shutdown the program
            }
            groceries.sort(Comparator.naturalOrder()); // Sort the groceries list alphabetically
            System.out.println(groceries); // Print the current state of the groceries list
        }
    }
    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        // Loop through each entered item, trim it, and add it to the list if it's not already present
        for (String i: items) {
            String trimmed = i.trim(); // Remove leading/trailing spaces
            if (groceries.indexOf(trimmed) < 0) { // Check if the item already exists in the list
                groceries.add(trimmed); // Add the item to the groceries list
            }
        }
    }
    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        // Loop through each entered item, trim it, and remove it from the list if present
        for (String i: items) {
            String trimmed = i.trim(); // Remove leading/trailing spaces
            groceries.remove(trimmed); // Remove the item from the groceries list
        }
    }
    private static void printActions() {
        // Display available actions to the user
        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.print(textBlock + " "); // Print the action menu
    }
}