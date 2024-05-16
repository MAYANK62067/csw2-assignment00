package assignment3;
import java.util.HashMap;
import java.util.Map;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Author: " + author + ", Quantity: " + quantity;
    }
}

class Library {
    private Map<Integer, Book> bookMap;

    public Library() {
        bookMap = new HashMap<>();
    }

    public void addBook(Book book) {
        bookMap.put(book.getId(), book);
    }

    public boolean isBookPresent(String bookName) {
        for (Book book : bookMap.values()) {
            if (book.getName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    public void removeBook(int id) {
        bookMap.remove(id);
    }

    public void displayBooks() {
        System.out.println("Book Collection:");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Library library = new Library();

	        Book book1 = new Book(1, "Java Programming", "John Doe", 10);
	        Book book2 = new Book(2, "Python Programming", "Jane Smith", 5);

	        library.addBook(book1);
	        library.addBook(book2);

	        library.displayBooks();

	        System.out.println("Is book 'Java Programming' present in the library? " + library.isBookPresent("Java Programming"));

	        library.removeBook(1);
	        library.displayBooks();

	}

}
