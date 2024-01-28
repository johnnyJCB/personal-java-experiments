import java.util.ArrayList;

public class Stack {

    // Constructor to initialize the stack as an ArrayList of Strings
    public Stack() {
        stacks = new ArrayList<>();
    }

    // Private member variable to hold the elements of the stack
    private ArrayList<String> stacks;

    // Method to check if the stack is empty
    public boolean isEmpty(){
        // Checks if the ArrayList 'stacks' is empty
        if(stacks.isEmpty()){
            return true; // Returns true if the stack is empty
        } else {
            return false; // Returns false if the stack is not empty
        }
    }

    // Method to add a value to the top of the stack
    public void add(String value){
        stacks.add(value); // Adds the 'value' to the end of the ArrayList, representing the top of the stack
    }

    // Method to get a copy of the elements in the stack as an ArrayList
    public ArrayList<String> values(){
        ArrayList tempArray = new ArrayList(); // Creates a new ArrayList 'tempArray'
        for(String a: stacks){ // Iterates through each element in the 'stacks' ArrayList
            tempArray.add(a); // Adds each element to the 'tempArray'
        }
        return tempArray; // Returns the 'tempArray' containing the elements of the stack
    }

    // Method to take (retrieve and remove) the topmost element from the stack
    public String take(){
        String result = stacks.get(0); // Retrieves the first element (topmost) from the stack
        stacks.remove(0); // Removes the topmost element from the ArrayList
        return result; // Returns the removed element
    }
}
