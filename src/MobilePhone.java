import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {    //check if contact in list
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {   //update existing contact
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            return false;
        }
        myContacts.set(foundPosition, newContact);
        return true;
    }
    public boolean removeContact(Contact contact) {       //removes contact if in list
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            return false;
        }
        myContacts.remove(foundPosition);
        return true;
    }

    private int findContact(Contact contact) {           //find contact index in list
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {        //find index of contact by name
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {   //search for contact, return Contact object
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");                  //print contact list
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}