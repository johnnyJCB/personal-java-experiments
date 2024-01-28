
import java.util.ArrayList;

public class Package extends Gift {
    private ArrayList<Gift> gifts;

    // Constructor to initialize the ArrayList of gifts
    public Package(){
        this.gifts = new ArrayList<>();
    }
    // Method to add a gift to the package
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    // Method to calculate the total weight of all gifts in the package
    public int totalWeight(){
        int totalWeight = 0;
        // Iterating through each gift in the 'gifts' ArrayList
        for(Gift gift: gifts){
            totalWeight += gift.getWeight(); // Accumulate the weight of each gift
        }
        return totalWeight; // Return the total weight of all gifts in the package
    }
}

