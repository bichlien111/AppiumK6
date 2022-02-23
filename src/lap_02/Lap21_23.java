package lap_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lap21_23 {
    public static void main(String[] args) {
        // Get input from user about height(m) and weight(kg) then calculate BMI
        // Underweight = <18.5
        // Normal weight = 18.5 - 24.9
        // Overweight = 25 - 29.9
        // Obesity = BMI of 30 or greater
        // BMI = weight / (height * height)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao (m): ");
        float height = scanner.nextFloat();
        System.out.println("Nhập cân nặng (kg): ");
        float weight = scanner.nextFloat();
        float BMI = weight/(height*height);
        float newWeight = 0;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("BMI = " + decimalFormat.format(BMI)); //làm tròn BMI
        if(BMI < 18.5){
            System.out.println("=> Thiếu cân");
            newWeight = 18.5f * height * height - weight; //tính cân chạm mốc bình thường
            System.out.println("=> Cần tăng ít nhất: " + decimalFormat.format(newWeight) + " cân");
        }else if (BMI <= 24.9){
            System.out.println("=> Bình thường");
        }else if (BMI <= 29.9){
            System.out.println("=> Thừa cân");
            newWeight = weight - 24.9f * height * height;
            System.out.println("=> Cần giảm ít nhất: " + decimalFormat.format(newWeight) + " cân");
        }else {
            System.out.println("=> Béo phì");
            newWeight = weight - 24.9f * height * height;
            System.out.println("=> Cần giảm ít nhất: " + decimalFormat.format(newWeight) + " cân");
        }
    }
}
