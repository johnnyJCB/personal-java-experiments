//Part 2: Payment terminal and cash
//The outline of the payment terminal. The comments inside the methods tell the wanted functionality:
public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }
//    Part 3: Card payments
//    Let's extend our payment terminal to also support card payments. We are going to create new methods for the
//    terminal. It receives a payment card as a parameter, and decreases its balance by the price of the meal that
//    was purchased. Here are the outlines for the methods, and instructions for completing them.
    public double eatAffordably(double payment) {
// an affordable meal costs 2.50 euros
// increase the amount of cash by the price of an affordable meal and return the change
// if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
            double price = 2.50;
            if(payment >= price){
                affordableMeals++;
                double change = payment-price;
                double gains = payment-change;
                money+=gains;
                return change;
            } else {
                return payment;
            }
    }
    public double eatHeartily(double payment) {
// a hearty meal costs 4.30 euros
// increase the amount of cash by the price of a hearty meal and return the change
// if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 4.30;
        if(payment < price){
            return payment;
        } else {
            heartyMeals++;
            double change = payment-price;
            double gains = payment-change;
            money+=gains;
            return change;
        }
    }
    public boolean eatAffordably(PaymentCard card) {
// an affordable meal costs 2.50 euros
// if the payment card has enough money, the balance of the card is decreased by the price, and the method
// returns true otherwise false is returned
        double price = 2.50; // Price for an affordable meal
        if (card.balance() >= price) {
            card.takeMoney(price);
            affordableMeals++;
            return true; // Successful transaction
        } else {
            return false; // Insufficient balance
        }
    }

    public boolean eatHeartily(PaymentCard card) {
// a hearty meal costs 4.30 euros
// if the payment card has enough money, the balance of the card is decreased by the price, and the method
// returns true otherwise false is returned
        double price = 4.50;
        if (card.balance() >= price){
            card.takeMoney(price);
            heartyMeals++;
            return true;
        }else{
            return false;
        }
   }
//Part 4: Adding money
//    Let's create a method for the terminal that can be used to add money to a payment card. Recall that the payment
//    that is received when adding money to the card is stored in the register. The basis for the method:
    public void addMoneyToCard(PaymentCard card, double sum) {
        // ...
        if (sum > 0) {
            card.addMoney(sum); // Adds money to the card
            money += sum; // Increases the terminal's register by the added sum
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}