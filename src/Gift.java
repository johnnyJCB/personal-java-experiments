public class Gift {
    private String name;
    private int weight;

    // Default constructor (Parameterless)
    public Gift(){

    }
    // Constructor with parameters to set the name and weight of the gift
    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    // Getter method to retrieve the name of the gift
    public String getName(){
        return name;
    }

    // Getter method to retrieve the weight of the gift
    public int getWeight(){
        return weight;
    }

    // toString() method override to provide a string representation of the gift
    public String toString(){
        return name + " (" + weight + " kg)";
    }
}
