public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {

        Contact contact1 = new Contact("John Cheng", "123-456-7890");
        Contact contact2 = new Contact("Chuck Norris", "123-654-4444");

        System.out.println("Contact 1: " + contact1.getName() + " -> " + contact1.getPhoneNumber());
        System.out.println("Contact 2: " + contact2.getName() + " -> " + contact2.getPhoneNumber());
    }
}
