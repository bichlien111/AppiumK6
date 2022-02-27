package lab_03;

//Finding maximum value/minimum value from an integer array
public class Lab32 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        int min = intArray[0], max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
            if (intArray[i] > max){
                max = intArray[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
