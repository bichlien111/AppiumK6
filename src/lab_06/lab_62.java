package lab_06;

import java.util.Scanner;

public class lab_62 {
    /* String myPassword = "password123";
     * Allow user to input maximum 3 times
     * */
    public static void main(String[] args) {
        String myPassword = "password123";
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (count < 3){
            System.out.println("Input your password: ");
            String inputPassword = scanner.nextLine();
            if(inputPassword.equals(myPassword)){
                System.out.println("Your password is correct!");
                break;
            }
            else {
                count++;
            }
        }
        if (count == 3) {
            System.out.println("Maximum input password is 3 times");
        }
    }
}
