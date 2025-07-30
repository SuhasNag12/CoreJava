public class Library {
    String library;
    int year;
    Book books[];

    Library(String library, int year, Book books[]) {
        this.library = library;
        this.year = year;
        this.books = books;
    }

    String libraryDetails() {
        return "The labrary of " + this.library + " was established in the year " + this.year;
    }

    void displayInfo() {
        for (Book book : books) {
            System.out.println(book.showDetails());
        }
    }

}
