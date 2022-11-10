package ArraySorular;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    /* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.
	 */

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("kaçtane eleman girişi yapacaksınız:");
        int elemansayisi= input.nextInt();
        int arr[]=new int[elemansayisi];

        for (int i=0; i<elemansayisi;i++){
            System.out.println(i+1+". elemanı giriniz");
            arr[i]= input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Arrayin en büyük elemanı ile en küçük elemanı arasındaki fark"+(arr[arr.length-1-arr[0]]));
    }
}
