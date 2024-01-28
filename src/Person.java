public class Person {
    // Private variables to store personal details
    private String firstName;
    private String lastName;
    private int age;

    // Getter methods to retrieve values of private variables
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    // Setter methods to set values of private variables
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        // Check if age is within a valid range (0-100), otherwise set it to 0
        if(age < 0 || age > 100){
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Method to check if the person is a teenager (between 13 and 19 years old)
    public boolean isTeen(){
        return (age > 12 && age < 20);
    }

    // Method to get the person's full name
    public String getFullName(){
        if (firstName.equals("") && lastName.equals("")) {
            return ("");
        } else if (lastName.equals("")) {
            return firstName;
        } else if (firstName.equals("")) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
//To check if s String is empty, use the method isEmpty from the String class. For example, firstName.isEmpty() returns
//true if the String is empty or in other words, when the String does not contain any characters.


