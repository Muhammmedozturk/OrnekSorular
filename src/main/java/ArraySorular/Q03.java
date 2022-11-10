package ArraySorular;

import java.util.Arrays;

public class Q03 {
    /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

     */
    public static void main(String[] args) {
        int arr[][]={{10,20,30},{4},{6,7,20}};
        int abb[]=new int[arr.length];

        int toplam=0;
        for (int i=0; i<arr.length;i++){
            for (int k=0; k<arr[i].length;k++){

                abb[i]+=arr[i][k];

            }
        }
        System.out.println(Arrays.toString(abb));

    }
}
