import javax.imageio.stream.MemoryCacheImageInputStream;
import java.awt.*;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
//    Part 1: Plus
//    First create the method public Money plus(Money addition) that returns a new money object
//    that is worth the total amount of the object whose method was called and the object that is
//    received as the parameter.
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros, this.cents); // create a new Money object that has the correct worth
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();
        if(newCents>=100){
            newEuros++;
            newCents-=100;
        }
        // return the new Money object
        return newMoney;
    }
//Part 2: Less
//    Create the method public boolean lessThan(Money compared) that returns true if the money-object on
//    which the method is called on has a lesser value than the money object given as a parameter.
    public boolean lessThan(Money compared){
        if(euros<compared.euros) {
            return true;
        }else if(euros==compared.euros && cents< compared.cents){
            return true;
        }else if(euros>compared.euros){
            return false;
        }return false;
    }
//Part3: Minus
//    Write the method public Money minus(Money decreaser) that returns a new money object
//    worth the difference of the object whose method was called and the object received as
//    the parameter. If the difference would be negative, the worth of the created money
//    object is set to 0.
public Money minus(Money decreaser) {
    int newEuros = this.euros - decreaser.euros;
    int newCents = this.cents - decreaser.cents;
    if (newCents < 0) {
        newEuros--; // Adjust euros if cents become negative
        newCents += 100; // Convert negative cents to positive
    }
    if (newEuros < 0) {
        newEuros = 0; // Ensure euros cannot be negative
        newCents = 0; // Ensure cents cannot be negative
    }
    return new Money(newEuros, newCents);
}
    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}