package lab_03;

//Sort an integer array from min to max
public class Lab33 {
    public static void main(String[] args) {
        int [] intArray = {12, 34, 1, 16, 28};
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if(intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i: intArray) {
            System.out.print(i + " ");
        }
    }
}
