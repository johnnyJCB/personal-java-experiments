import java.util.ArrayList;

// Define a class named Suitcase which extends Item
public class Suitcase extends Item {
    // Declare private instance variables to store items, maximum weight, and current weight of the suitcase
    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight; // Track the total weight

    // Default constructor (not utilized in this case)
    public Suitcase(){
    }
    // Constructor that takes the maximum weight parameter
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight; // Set the maximum weight of the suitcase
        this.items = new ArrayList<>(); // Initialize an ArrayList to store items
        this.currentWeight = 0; // Initialize total weight to zero
    }
    // Method to add an item to the suitcase
    public void addItem(Item item) {
        int newWeight = currentWeight + item.getWeight(); // Calculate total weight if the new item is added

        // Check if adding the new item will exceed the maximum weight limit
        if (newWeight <= maxWeight) {
            items.add(item); // Add the item to the suitcase
            currentWeight = newWeight; // Update the total weight
        } else {
            System.out.println("Cannot add " + item.getName() + ". Exceeds maximum weight limit.");
        }
    }

    // toString() method override to represent the Suitcase object as a String
    public String toString() {
        int itemCount = items.size(); // Get the count of items in the suitcase
        if (itemCount == 0) {
            return "no items (" + currentWeight + " kg)"; // Return a message if the suitcase is empty
        } else if (itemCount == 1) {
            return itemCount + " item (" + currentWeight + " kg)"; // Return message for a single item
        }
        return itemCount + " items (" + currentWeight + " kg)"; // Return message for multiple items
    }

    // Method to print all items in the suitcase
    public void printItems(){
        for(Item i : items){ // Iterate over each item in ArrayList items and print each element
            System.out.println(i);
        }
    }
    // Method to calculate the total weight of all items in the suitcase
    public int totalWeight(){
        int totalWeight = 0;
        for(Item i : items){ // Iterate over each item in ArrayList items and sum up weight of each item
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
    // Method to find and return the heaviest item in the suitcase
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null; // Return null if the suitcase is empty
        } else {
            Item heavyItem = items.get(0); // Assume the first item is the heaviest initially
            for(Item i : items){
                if(i.getWeight() > heavyItem.getWeight()){
                    heavyItem = i; // Update heavyItem if a heavier item is found
                }
            }
            return heavyItem; // Return the heaviest item
        }
    }
    // Getter method to retrieve the items in the suitcase
    public ArrayList<Item> getItems() {
        return items;
    }
}

