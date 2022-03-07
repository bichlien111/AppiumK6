package lab_03;

//Merge 2 SORTED integer array into one SORTED array
public class Lab34 {
    public static void main(String[] args) {
        int [] array1 = {1, 28, 34};
        int [] array2 = {1, 13, 16, 27, 99};
        int [] merged = new int [array1.length+ array2.length];
        int a1Index = 0, a2Index = 0, mIndex = 0;

        while(a1Index < array1.length && a2Index < array2.length){
            if (array1[a1Index] < array2[a2Index]){
                merged[mIndex++] = array1[a1Index++];
            } else {
                merged[mIndex++] = array2[a2Index++];
            }
        }
        if (a1Index < array1.length){
            merged[mIndex++] = array1[a1Index++];
        }
        if (a2Index < array2.length){
            merged[mIndex++] = array2[a2Index++];
        }
        for (int value : merged) {
            System.out.print(value + " ");
        }
    }
}
