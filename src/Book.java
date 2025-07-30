public class Book {
    String bookName;
    int bookPages;

    Book(String bookName, int bookPages) {
        this.bookName = bookName;
        this.bookPages = bookPages;
    }

    String showDetails() {
        return this.bookName + " has (" + this.bookPages + " pages)";
    }

}
