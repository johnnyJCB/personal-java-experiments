public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }


    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }
//    Part 1: "Dumb" payment card
//    Complete the method public boolean takeMoney(double amount) in the class
//    below (and found in the exercise template), using the following as a guide:
    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        if (this.balance >= amount) {
            this.balance -= amount; // Deduct the amount from the balance
            return true; // Transaction successful
        } else {
            return false; // Insufficient balance, transaction failed
        }
    }
}
//Test main program:


