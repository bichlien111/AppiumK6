package lab_12;

import java.util.*;

/* The main purpose of this lab is to explore Comparable and Comparator interfaces.
- Model:
Please create a standard class for Book with below class fields: ISBN, year, title, author
- Controller:
Please create one (or more) methods to sort a List for below fields (ASC or DESC): ISBN, year, title, author
- Example method signature:
public void printSortedBooksByISBN(List<Book> bookList){}
OR:
public void printSortedBooks(List<Book> bookList, SortingType sortingType){}
// And other support methods to make sure we use best practice for Single Reposibility
* */
public class TestSortBook {
    public static void main(String[] args) {

        Book book1 = new Book("1237", "Book1", "Author3", 1901);
        Book book2 = new Book("1233", "Book5", "Author1", 1905);
        Book book3 = new Book("1235", "Book3", "Author5", 1907);

        List<Book> bookList = Arrays.asList(book1, book2, book3);
        System.out.println("-----BEFORE SORTING-----");
        printSortedBooks(bookList);

        boolean isContinuing = true;
        while (isContinuing) {
            // Display menu
            System.out.println("==== MENU ====");
            System.out.println("1. Sort by ISBN");
            System.out.println("2. Sort by Title");
            System.out.println("3. Sort by Author");
            System.out.println("4. Sort by Year");

            // Input option
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose option: ");
            int userInput = scanner.nextInt();

            // Trigger base on user's input
            switch (userInput) {
                case 1:
                    Collections.sort(bookList, new ISBNComparator());
                    System.out.println("-----SORT ISBN | ASC-----");
                    printSortedBooks(bookList);
                    break;
                case 2:
                    Collections.sort(bookList, new TitleComparator());
                    System.out.println("-----SORT TITLE | DESC-----");
                    printSortedBooks(bookList);
                    break;
                case 3:
                    Collections.sort(bookList, new AuthorComparator());
                    System.out.println("-----SORT AUTHOR | ASC-----");
                    printSortedBooks(bookList);
                    break;
                case 4:
                    Collections.sort(bookList, new YearComparator());
                    System.out.println("-----SORT YEAR | DESC-----");
                    printSortedBooks(bookList);
                    break;
                default:
                    isContinuing = false;
                    System.out.println("Wrong option. Exit!");
            }
        }
    }

    private static void printSortedBooks(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
