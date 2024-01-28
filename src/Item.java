// Define a class named Item
public class Item {

    // Declare private instance variables to store the name and weight of the item
    private String name;
    private int weight;

    // Default constructor with no parameters (not utilized in this case)
    public Item(){
    }

    // Constructor with parameters to set the name and weight of the item
    public Item(String name, int weight){
        this.name = name;   // Set the name of the item
        this.weight = weight; // Set the weight of the item
    }

    // Getter method to retrieve the name of the item
    public String getName(){
        return name;
    }

    // Getter method to retrieve the weight of the item
    public int getWeight(){
        return weight;
    }

    // toString() method override to represent the Item object as a String
    public String toString(){
        // Return a formatted string representing the item's name and weight
        return getName() + " (" + getWeight() + " kg)";
    }
}


