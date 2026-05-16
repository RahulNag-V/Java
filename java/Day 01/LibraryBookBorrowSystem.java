import java.util.Scanner;

public class LibraryBookBorrowSystem {

    int availableBooks = 3;

    void availableBook() {
        System.out.println("Available Books:" + availableBooks);
    }

    void borrowBook() {
        if (availableBooks > 0) {
            availableBooks--;
            System.out.println("Book Borrowed Successfully");
        } else {
            System.out.println("No Books Available");
        }
    }

    void returnBook() {
       
        if (availableBooks < 3) {
             availableBooks++;
            System.out.println("Book Returned Successfully");
        } else {
            System.out.println("Library Already Full");
        }
    }

    void exit() {
        System.out.println("System Closed \n Thank You");
    }

    void main() {
        int choice;
        boolean running = true;
        Scanner input = new Scanner(System.in);
        while (running) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Available Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                availableBook();
            } else if (choice == 2) {
                borrowBook();
            } else if (choice == 3) {
                returnBook();
            } else if (choice == 4) {
                exit();
                running = false;
            } else {
                System.out.println("Invalid Option");
            }
        }
        input.close();
    }

    public static void main(String[] args) {

        String name = "User";
        int password = 1234;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String enteredName = input.nextLine();

        System.out.print("Enter Password: ");
        int enteredPassword = input.nextInt();

        if (name.equals(enteredName) && password == enteredPassword) {
            System.out.println("Login Successful");
            LibraryBookBorrowSystem library = new LibraryBookBorrowSystem();
            library.main();
        } else {
            System.out.println("Invalid Username or Password");
        }
        input.close();
    }
}

// Avoid multiple Scanner objects for System.in.
// Do not use confusing method names like main().
// Use clean and meaningful method names.
// Reduce repeated code whenever possible.
// Always validate user input properly.
// Think about scalability before hardcoding values.