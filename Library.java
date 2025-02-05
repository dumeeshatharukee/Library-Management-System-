import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.\n");
        } else {
            for (Book book : books) {
                book.displayBookInfo();
            }
        }
    }

    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("You have borrowed the book: " + book.getIsbn() + "\n");
                    return;
                } else {
                    System.out.println("Sorry, this book is currently unavailable.\n");
                    return;
                }
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.\n");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("You have returned the book: " + book.getIsbn() + "\n");
                    return;
                } else {
                    System.out.println("This book wasn't borrowed.\n");
                    return;
                }
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.\n");
    }
}
