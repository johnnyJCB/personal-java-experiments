// Import necessary classes from the java.util package
import java.util.ArrayList;
import java.util.Scanner;

// Define a class named TelevisionProgram to represent a TV program
class TelevisionProgram {
    private String name; // Private variable to store the name of the TV program
    private int duration; // Private variable to store the duration of the TV program in minutes

    // Constructor for TelevisionProgram class to initialize name and duration
    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    // Getter method to retrieve the name of the TV program
    public String getName() {
        return name;
    }

    // Getter method to retrieve the duration of the TV program
    public int getDuration() {
        return duration;
    }
}

// Main class ProgramFilter where the program execution begins
public class ProgramFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        ArrayList<TelevisionProgram> programs = new ArrayList<>(); // Create an ArrayList to store TelevisionProgram objects

        // Reading television programs from the user until an empty string is entered
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine(); // Read the name of the TV program

            // Break the loop if an empty string is entered as the name
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine()); // Read the duration of the TV program

            // Create a TelevisionProgram object with the provided name and duration, then add it to the ArrayList
            TelevisionProgram program = new TelevisionProgram(name, duration);
            programs.add(program);
        }

        // Querying maximum duration from the user
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine()); // Read the maximum duration

        // Listing programs whose duration is smaller or equal to the specified maximum duration
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) { // Check if the program's duration is less than or equal to the maximum duration
                System.out.println(program.getName() + ", " + program.getDuration() + " minutes"); // Print the program's name and duration
            }
        }
    }
}
