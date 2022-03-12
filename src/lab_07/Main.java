package lab_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /* Create a simple menu
     * 1. Input book
     * 2. Find book by ISBN
     * 0. Exit!
     * Book object
     * String ISBN
     * String title
     * String authorName
     * String/int year
     * Please override toString method to print out the found book.
     * If there is no matched book, please print out book not found
     * */
    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing) {
            // Display menu
            System.out.println("==== MENU ====");
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
            System.out.println("0. Exit!");

            // Input option
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose option: ");
            int userInput = scanner.nextInt();

            // Trigger base on user's input
            List<Book> bookList = new ArrayList<>();
            Book book1 = new Book("0-9752298-0-X", "Book 1", "Test 1", 1990);
            Book book2 = new Book("0-9752298-0-Y", "Book 2", "Test 2", 1991);
            Book book3 = new Book("0-9752298-0-Z", "Book 3", "Test 3", 1992);
            switch (userInput) {
                case 1:
                    System.out.println("Input book: ");
                    bookList.add(book1);
                    bookList.add(book2);
                    bookList.add(book3);
                    for (Book book : bookList) {
                        System.out.println(book);
                    }
                    break;
                case 2:
                    bookList.add(book1);
                    bookList.add(book2);
                    bookList.add(book3);

                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Please input ISBN: ");
                    String inputISBN = scanner2.nextLine();

                    int count = 0;
                    for (Book book : bookList) {
                        if (inputISBN.equals(book.getISBN())) {
                            System.out.println("Found book: " + book);
                        } else {
                            count++;
                        }
                    }
                    if (count == bookList.size()){
                            System.out.println("Book not found");
                        }
                    break;
                case 0:
                    System.out.println("Exit!");
                    break;
                default:
                    isContinuing = false;
                    System.out.println("Wrong option. Goodbye!");
            }
        }
    }
}
