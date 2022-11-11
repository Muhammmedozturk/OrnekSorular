package methods;

import java.util.Scanner;

public class Q01 {
    /*
    metotları ve switch kullanarak basit bir hesap makinesi yapınız
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("birinci sayıyı gir");
        double sayi1= input.nextDouble();
        System.out.println("İkinci sayıyı gir");
        double sayi2= input.nextDouble();

        System.out.println("Toplama için (+) Çıkarma için (-) bölme için (/) çarpma için (*) a basınız");
        char islem=input.next().charAt(0);

        switch (islem){
            case '+':

                System.out.println("İki sayının toplamı :" +toplama(sayi1,sayi2));
                break;
            case '*':
                System.out.println("İki sayının farkı :" +cikarma(sayi1,sayi2));
                break;
            case '/':
                System.out.println("İki sayının çarpımı :" +carpma(sayi1,sayi2));
                break;
            case '-':
                System.out.println("İki birbirine oranı toplamı :" +bolme(sayi1,sayi2));
                break;
            default:
                System.out.println("lütfen geçerli bir işlem giriniz");
        }
    }
    public static double toplama(double a, double b){
        return a+b;

    }
    public static double cikarma(double a, double b) {
        return a - b;
    }
    public static double carpma(double a, double b) {
        return a * b;

    }
    public static double bolme(double a, double b) {
        return a / b;
    }}