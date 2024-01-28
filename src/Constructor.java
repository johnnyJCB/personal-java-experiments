public class Constructor {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public Constructor(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public Constructor(){
        this("Johnny", "j@gmail.com");
    }
    public Constructor(String name, String emailAddress){
        this(name, 100, emailAddress);

    }

}
