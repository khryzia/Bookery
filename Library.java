//GROUP Library System - Bookery!~
import java.time.LocalDate;
import java.util.Scanner;
public class Library {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println("\nHello! welcome to Bookery!");//landing page aaaaaaaaaaaaaaaa
        System.out.println("Do you want to borrow a book?\n note: 3 books limit only!");
        System.out.println("Enter Space to view all the books you want to borrow or any key to exit: ");
        String input = scanner.nextLine();
        clearScreen();
        if (!input.trim().isEmpty()) {
            System.out.println("~~~~BOOKERY~~~");
            System.out.println("Thank you for visiting Bookery!" +
                    "\nHave a great day!");
            System.out.println("~~~~BOOKERY~~~~");
            return; // endpage! poga aaaaaaaaaaa
        }
        //next is borrow book na
        clearScreen();//book to borrow
        bookview.printAvailableBooks();
        System.out.println("Enter the 1st ID book you want to borrow: ");
        int book1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the 2nd ID book you want to borrow: ");
        int book2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the 3rd ID book you want to borrow: ");
        int book3 = scanner.nextInt();
        scanner.nextLine();
        clearScreen();//transaction name
        System.out.println("~~~~BOOKERY INFORMATION BORROW BOOK~~~");
        System.out.println("Name: ");
        String accname = scanner.nextLine();
        System.out.println("Student Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Contact Number: ");
        String contact = scanner.nextLine(); 
        System.out.println("Return Date: ");
        String returnDate = scanner.next();
        clearScreen();//summary na mag hihiram
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tBORROW BOOK SUMMARY");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(bookview.getBookInfoById(book1));
        System.out.println(bookview.getBookInfoById(book2));
        System.out.println(bookview.getBookInfoById(book3));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tSTUDENT INFORMATION");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + accname);
        System.out.println("Student Number: " + num);
        System.out.println("Contact Number: " + contact);
        System.out.println("Borrow Date: " + myObj);
        System.out.println("Return Date: " + returnDate);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\nPlease confirm your information before proceeding.");
        System.out.println("Is this information correct? (yes/no)");
        String confirmation = scanner.next();
        if (!confirmation.equalsIgnoreCase("yes")) {
            System.out.println("Please restart the program to re-enter your information.");
            return; // back to view books dapat!
        }
        clearScreen();//nahiram na kshks
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tBOOKERY BORROWED BOOKS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(bookview.getBookInfoById(book1));
        System.out.println(bookview.getBookInfoById(book2));
        System.out.println(bookview.getBookInfoById(book3));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tSTUDENT INFORMATION");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + accname);
        System.out.println("Student Number: " + num);
        System.out.println("Borrow Date: " + myObj);
        System.out.println("Contact Number: " + contact);
        System.out.println("Return Date: " + returnDate);
        System.out.println("\n\nThank you for borrowing a book from us!");
        System.out.println("~~~~Bookery~~~~");
    }//pls dont sira our code, its really hard for me to code this kaya, like duh~ -krisanelkyutsy_2025
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();//ayaw ko na~
    }
}//screaming but daddy i love him!~ by Taylor Swift