public class Product {
    // Private variables to store product details
    private String name;
    private String location;
    private int weight;

    // Constructor 1: Takes only the name of the product
    public Product(String name) {
        // Calls another constructor with default values for location ("shelf") and weight (1)
        this(name, "shelf", 1);
    }

    // Constructor 2: Takes name and location of the product
    public Product(String name, String location) {
        // Calls another constructor with default weight (1)
        this(name, location, 1);
    }

    // Constructor 3: Takes name and weight of the product
    public Product(String name, int weight) {
        // Calls another constructor with default location ("shelf")
        this(name, "shelf", weight);
    }

    // Constructor 4: Takes name, location, and weight of the product
    public Product(String name, String location, int weight) {
        // Sets the provided values for name, location, and weight
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    // Method to represent the product information as a string
    public String toString() {
        return name + " (" + weight + " kg) can be found from the " + location;
    }

    // Test the Product class
    public static void main(String[] args) {
        // Creating instances of Product using different constructors
        Product tapeMeasure = new Product("Tape measure"); // Uses Constructor 1
        Product plaster = new Product("Plaster", "home improvement section"); // Uses Constructor 2
        Product tyre = new Product("Tyre", 5); // Uses Constructor 3

        // Printing product information using toString method
        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}

