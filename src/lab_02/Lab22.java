package lab_02;

import java.util.Scanner;

public class Lab22 {
    public static void main(String[] args) {
        // Allow user to input a number, print out it's an odd or even number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bất kỳ: ");
        int myNum = scanner.nextInt();
        if(myNum%2==0){
            System.out.println("Đây là số chẵn");
        }else{
            System.out.println("Đây là số lẻ");
        }
    }
}
