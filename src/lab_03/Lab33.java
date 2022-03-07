package lab_03;

//Sort an integer array from min to max
public class Lab33 {
    public static void main(String[] args) {
        int [] intArray = {12, 45, 34, 1, 16, 28};
        int temp;
        int usp = intArray.length-1; // usp = unsorted position
        while (usp > 0){ // moving usp backward
            for (int i = 0; i < usp; i++) { // moving index forward
                if (intArray[i] > intArray[i+1]){
                    temp = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = temp;
                }
            }
            usp--;
        }
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i: intArray) {
            System.out.print(i + " ");
        }
    }
}
