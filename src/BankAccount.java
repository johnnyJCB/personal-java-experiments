public class BankAccount {

    public static void main() {
        Bank bank = new Bank();
        bank.setAccountNumber("123456");
        bank.setAccountBalance(1000.00);
        bank.setCustomerName("Bob Brown");
        bank.setCustomerEmail("myemail@bob.com");
        bank.setPhoneNumber("(254) 787-5252");

        bank.withdrawFunds(100.0);
        bank.depositFunds(250);
        bank.withdrawFunds(50);
        bank.withdrawFunds(200);

        bank.depositFunds(100);
        bank.withdrawFunds(45.55);
        bank.withdrawFunds(54.46);
        bank.withdrawFunds(54.45);

    }

}
