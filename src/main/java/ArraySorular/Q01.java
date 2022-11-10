package ArraySorular;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
      kullanicidan bir string aliniz. String'de var olan her karakterin sayisini
      ekrana yazdiriniz.
      Ornek: abaa ==>a=3,  c=1
       */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = scan.nextLine();

        System.out.println("kontrol etmek istediginiz kelimeyi girin");
        String kelime = scan.next();

        int kelimesayisi=cumle.indexOf(kelime);
        if (kelimesayisi<0){
            System.out.println("Kelime cümlede kullanılmamıs..");
            System.out.println("kelime cümlede " +kelimesayisi + "defa kullanılmış");
        } else if (cumle.indexOf(kelime, kelimesayisi+1)==(-1)) {
            System.out.println("kelime cümlede 1 defa kullanılmamış");

        }else
            System.out.println("kelime cümlede birden fazla kullanılmış");

    }
}