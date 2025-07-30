public class App {
    public static void main(String[] args) {

        Book book1 = new Book("To Kill a Mockingbird", 336);
        Book book2 = new Book("1984", 328);
        Book book3 = new Book("The Alchemist", 208);
        Book book4 = new Book("Sapiens: A Brief History of Humankind", 498);
        Book book5 = new Book("The Great Gatsby\" by F. Scott Fitzgerald", 180);
        Book books[] = { book1, book2, book3, book4, book5 };
        for (Book book : books) {
            System.out.println(book.showDetails());
        }

        Library library = new Library("Bengaluru Central Library", 1998, books);
        System.out.println("*****************************");
        System.out.println(library.libraryDetails());
        library.displayInfo();
        System.out.println("*****************************");

    }
}