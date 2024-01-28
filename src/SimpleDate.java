public class SimpleDate {
    private int day;
    private int month;
    private int year;

    // Constructor to initialize the date
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    // Override toString method to represent the date as a string
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    // Method to check if the current date is before the compared date
    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // If the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // If the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }
//    Part 1: Next day
//    Implement the method public void advance() that moves the date by one day.
//    In this exercise we assume that each month has 30 day. NB! In certain
//    situations you need to change the values of month and year.
    public void advance(){
        if(this.day < 30) {
            this.day++;
        }else if(this.day == 30 && this.month < 12){
            this.day = 1;
            this.month++;
        }else{            // When the day is 30 and the month is 12, reset to the first day of the next year
            this.day = 1;
            this.month = 1;
            this.year+=1;
        }
    }
//    Part 2: Advance specific number of days
//    Implement the method public void advance(int howManyDays) that
//    moves the date by the number of days that is given. Use the method advance()
//    that you implemented in the previous section to help you in this.
    public void advance(int howManyDays){
        while(howManyDays>0){
            advance();  // Call the advance() method to move by one day
            howManyDays--;
        }
    }
//Part 3: Passing of time
//Let's add the possibility to advance time to the SimpleDate class. Create the method public SimpleDate
//afterNumberOfDays(int days) for the class. It creates a new SimpleDate object whose date is the specified
//number of days greater than the object that the method was called on. You may still assume that each month
//has 30 days. Notice that the old date object must remain unchanged!
//
//Since the method must create a new object, the structure of the code should be somewhat similar to this:
public SimpleDate afterNumberOfDays(int days) {
    SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);   // Create a new object with the same date
    while(days>0){
        newDate.advance();  // Advance the new date by one day
        days--;
    }
    return newDate; // Return the new date object
}
}
