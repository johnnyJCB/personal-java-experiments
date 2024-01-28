import java.util.ArrayList;

// Define a class named Hold to manage a collection of suitcases
public class Hold {
    // Declare private instance variables to store maximum weight and suitcases
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    // Constructor to initialize Hold with a maximum weight
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight; // Set the maximum weight for the hold
        this.suitcases = new ArrayList<>(); // Initialize an ArrayList to store suitcases
    }
    // Method to add a suitcase to the hold if it doesn't exceed the maximum weight
    public void addSuitcase(Suitcase suitcase) {
        // Check if adding the new suitcase will exceed the maximum weight limit
        if ((totalWeight() + suitcase.totalWeight()) <= maxWeight) {
            suitcases.add(suitcase); // Add the suitcase to the hold
        } else {
            System.out.println("Cannot add suitcase. Exceeds maximum weight limit for the hold.");
        }
    }
    // toString() method override to represent the Hold object as a String
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)"; // Return a message representing the hold
    }
    // Method to calculate the total weight of all suitcases in the hold
    private int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight(); // Sum up the total weight of suitcases
        }
        return total;
    }
    // Method to print all items in all suitcases in the hold
    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase : suitcases) {
            ArrayList<Item> items = suitcase.getItems(); // Retrieve items from each suitcase
            for (Item item : items) {
                System.out.println(item); // Print each item (assuming the Item class has a proper toString() method)
            }
        }
    }
}

