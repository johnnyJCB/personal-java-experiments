import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    private ArrayList<String> meals; // Declares an ArrayList to store meal names

    public Menu() { // Constructor initializing the ArrayList
        this.meals = new ArrayList<>();
    }

    // Adds a meal to the menu. If the meal is already on the list, it should not be added again.
    public void addMeal(String meal){
        if(meals.contains(meal)){ // Checks if the meal already exists in the list

        } else {
            meals.add(meal); // If the meal is not in the list, adds it to the list
        }
    }

    public void printMeals() { // Prints the meals in the menu
        for (int i = 0; i < meals.size(); i++) { // Iterates through the list of meals
            System.out.println(meals.get(i)); // Prints each meal on a new line
        }
    }
    public void clearMenu(){ // Clears all meals from the menu
        meals.removeAll(meals); // Removes all elements from the meals ArrayList
    }
}