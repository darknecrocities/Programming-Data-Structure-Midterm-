import java.util.*;

public class LibraryManagementSystem {

    // Book class to store book details
    static class Book {
        String title;
        String author;
        int bookId;
        
        Book(String title, String author, int bookId) {
            this.title = title;
            this.author = author;
            this.bookId = bookId;
        }
        
        @Override
        public String toString() {
            return "ID: " + bookId + ", Title: " + title + ", Author: " + author;
        }
    }

    // Customer class to store customer details
    static class Customer {
        String name;
        int membershipId;
        String contactInfo;

        Customer(String name, int membershipId, String contactInfo) {
            this.name = name;
            this.membershipId = membershipId;
            this.contactInfo = contactInfo;
        }

        @Override
        public String toString() {
            return "ID: " + membershipId + ", Name: " + name + ", Contact: " + contactInfo;
        }
    }

    // Checkout transaction using a Tuple
    static class CheckoutTransaction {
        int bookId;
        int membershipId;
        String dueDate;

        CheckoutTransaction(int bookId, int membershipId, String dueDate) {
            this.bookId = bookId;
            this.membershipId = membershipId;
            this.dueDate = dueDate;
        }

        @Override
        public String toString() {
            return "Book ID: " + bookId + ", Customer ID: " + membershipId + ", Due Date: " + dueDate;
        }
    }

    // Main library system with a Set for books and a List for customers
    public static void main(String[] args) {
        // Initialize the library
        Set<Book> availableBooks = new HashSet<>();
        List<Customer> customers = new ArrayList<>();
        List<CheckoutTransaction> checkouts = new ArrayList<>();

        // Adding some books to the library (Array for fixed inventory)
        Book[] booksArray = {
            new Book("Harry Potter", "J.K. Rowling", 1),
            new Book("The Hobbit", "J.R.R. Tolkien", 2),
            new Book("1984", "George Orwell", 3)
        };

        // Add books to availableBooks set
        for (Book book : booksArray) {
            availableBooks.add(book);
        }

        // Adding customers
        customers.add(new Customer("Alice", 101, "alice@email.com"));
        customers.add(new Customer("Bob", 102, "bob@email.com"));
        
        // Simulate checkout of a book
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the customer ID to checkout a book:");
        int customerId = scanner.nextInt();
        scanner.nextLine();  // consume newline
        
        System.out.println("Enter the book ID to checkout:");
        int bookId = scanner.nextInt();
        scanner.nextLine();  // consume newline
        
        // Find the book and customer
        Book selectedBook = null;
        for (Book book : availableBooks) {
            if (book.bookId == bookId) {
                selectedBook = book;
                break;
            }
        }
        
        Customer selectedCustomer = null;
        for (Customer customer : customers) {
            if (customer.membershipId == customerId) {
                selectedCustomer = customer;
                break;
            }
        }
        
        // If both book and customer are found, proceed with checkout
        if (selectedBook != null && selectedCustomer != null) {
            System.out.println("Enter the due date for the book (e.g., 12/12/2025):");
            String dueDate = scanner.nextLine();
            
            CheckoutTransaction transaction = new CheckoutTransaction(bookId, customerId, dueDate);
            checkouts.add(transaction);
            
            // Remove book from available books set
            availableBooks.remove(selectedBook);
            
            System.out.println("Checkout successful!");
            System.out.println(transaction);
        } else {
            System.out.println("Error: Invalid customer ID or book ID.");
        }

        // Display available books
        System.out.println("\nAvailable books:");
        for (Book book : availableBooks) {
            System.out.println(book);
        }
        
        // Display all customers
        System.out.println("\nCustomer list:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        
        // Display checkout history
        System.out.println("\nCheckout history:");
        for (CheckoutTransaction transaction : checkouts) {
            System.out.println(transaction);
        }
    }
}
