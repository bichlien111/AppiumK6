package lab_03;

//Merge 2 SORTED integer array into one SORTED array
public class Lab34 {
    public static void main(String[] args) {
        int [] a = {1, 12, 16, 28, 34};
        int [] b = {1, 13, 16, 27, 99};
        // merge a & b = c
        int a1 = a.length, b1 = b.length;
        int c1 = a1 + b1;
        int [] c = new int [c1];
        for (int i = 0; i < a1; i++){
            c[i] = a[i];
        }
        for (int j = 0; j<b1; j++) {
            c[a1+j] = b[j];
        }
        // sort c
        int temp;
        for (int k = 0; k < c1; k++) {
            for (int l = k+1; l < c1; l++) {
                if(c[k] > c[l]) {
                    temp = c[k];
                    c[k] = c[l];
                    c[l] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi merge: ");
        for (int m: c){
            System.out.print(m+ " ");
        }
    }
}
