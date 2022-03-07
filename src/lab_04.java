import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/* =====MENU======
 * 1. Add number into ArrayList
 * 2. Print numbers
 * 3. Get maximum number
 * 4. Get minimum number
 * 5. Find a number then print index
 */
public class lab_04 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing){
            // Display menu
            System.out.println("==== MENU ====");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Find a number then print index");

            // Input option
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose option: ");
            int userInput = scanner.nextInt();

            // Trigger base on user's input
            List<Integer> myList = new ArrayList<>();
            switch (userInput){
                case 1:
                    System.out.println("Add number into ArrayList");
                    myList.add(1);
                    myList.add(2);
                    myList.add(3);
                    break;
                case 2:
                    myList.add(1);
                    myList.add(2);
                    myList.add(3);
                    System.out.println("Print number: " +myList);
                    break;
                case 3:
                    myList.add(1);
                    myList.add(2);
                    myList.add(3);
                    int max = 0;
                    for (int i = 0; i < myList.size(); i++) {
                        if(myList.get(i) > max){
                            max = myList.get(i);
                        }
                    }
                    System.out.println("Maximum number is: " + max);
                    break;
                case 4:
                    myList.add(1);
                    myList.add(2);
                    myList.add(3);
                    int min = myList.get(0);
                    for (int i = 1; i < myList.size(); i++) {
                        if(myList.get(i) < min){
                            min = myList.get(i);
                        }
                    }
                    System.out.println("Minimum number is: " + min);
                    break;
                case 5:
                    myList.add(1);
                    myList.add(2);
                    myList.add(3);
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Input number: ");
                    int number = scanner1.nextInt();
                    for (int i = 0; i < myList.size(); i++) {
                        if (myList.get(i) == number) {
                            System.out.println("Index of number: " + i);
                        }
                    }
                    break;
                default:
                    isContinuing = false;
                    System.out.println("Wrong option. Goodbye!!");
            }
        }
    }
}
