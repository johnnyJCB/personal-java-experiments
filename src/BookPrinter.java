import java.util.ArrayList;
import java.util.Scanner;

// Main class BookPrinter where the program execution begins
public class BookPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to read user input
        ArrayList<Book> books = new ArrayList<>(); // ArrayList to store Book objects

        // Reading book information from the user until an empty string is entered for the title
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            // Break the loop if an empty string is entered as the title
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine()); // Read the number of pages

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine()); // Read the publication year

            // Create a Book object with the provided title, pages, and publication year, then add it to the ArrayList
            Book book = new Book(title, pages, publicationYear);
            books.add(book);
        }

        // Asking the user for what information to print
        System.out.print("What information will be printed? ");
        String infoToPrint = scanner.nextLine();

        // Printing the requested information based on user input
        if (infoToPrint.equals("everything")) {
            // Print details of each book: title, pages, and publication year
            for (Book book : books) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            }
        } else if (infoToPrint.equals("name")) {
            // Print only the titles of the books
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
