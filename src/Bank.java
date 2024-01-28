public class Bank {
    // Private variables for storing account details
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public void depositFunds(double depositAmount){

        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. Your new balance is $ " + accountBalance);
    }
    public void withdrawFunds(double withdrawalAmount) {
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds. You only have $" + accountBalance + " in your account");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " made. Your new balance is $ " + accountBalance);
        }
    }
        public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
