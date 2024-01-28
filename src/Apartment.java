//In the estate agent's information system, an apartment that is on sale is represented by an object
//that is instantiated from the following class:
public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
//    Part 1; Comparing sizes
//    Create a method public boolean largerThan(Apartment compared) that returns true if the apartment
//    object whose method is called has a larger total area than the apartment object that is being compared.
    public boolean largerThan(Apartment compared) {
        // Calculate total area of the apartment (rooms * squares)
        // Compare total areas and return true if the calling apartment has a larger total area
        if(this.rooms*this.squares > compared.rooms * compared.squares){
            return true;
        }else{
            return false;
        }
    }
//    Part 2: Price difference
//    Create a method public int priceDifference(Apartment compared) that returns the price difference of
//    the apartment object whose method was called and the apartment object received as the parameter.
//    The price difference is the absolute value of the difference of the prices (price can be calculated
//    by multiplying the price per square by the number of squares).
    public int priceDifference(Apartment compared){
        int Difference = (this.squares*this.pricePerSquare)-(compared.squares* compared.pricePerSquare);
        return Math.abs(Difference);
    }
//    Part 3: More expensive?
//    Write a method public boolean moreExpensiveThan(Apartment compared) that returns true if the
//    apartment object whose method is called is more expensive than the apartment object being compared.
    public boolean moreExpensiveThan(Apartment compared){
        if(this.squares*this.pricePerSquare > compared.squares* compared.pricePerSquare){
            return true;
        }else{
            return false;
        }
    }
}


