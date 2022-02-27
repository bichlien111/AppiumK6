package lab_03;

//Count how many odd, even number(s) in an integer array
public class Lab31 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        int chan =0, le = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                chan++;
            } else {
                le++;
            }
        }
        System.out.println("Số chẵn trong mảng: " + chan);
        System.out.println("Số lẻ trong mảng: " + le);
    }
}
