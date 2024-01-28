// A class to represent a Book entity
class Book {
    private String title;
    private int pages;
    private int publicationYear;

    // Constructor to initialize the Book object with title, pages, and publication year
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    // Getter method to retrieve the title of the book
    public String getTitle() {
        return title;
    }

    // Getter method to retrieve the number of pages of the book
    public int getPages() {
        return pages;
    }

    // Getter method to retrieve the publication year of the book
    public int getPublicationYear() {
        return publicationYear;
    }
}
