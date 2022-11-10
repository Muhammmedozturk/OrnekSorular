package ForLoop;

public class Q01 {
    /*
        Kullanıcıdan satır ve sütun sayısını alın.
        Bir dikdörtgen oluşturun.
        rows = 3 and column = 5 ==> * * * * *
                                    * * * * *
                                    * * * * *
     */

    public static void main(String[] args) {
        for (int i=0; i<3; i++){
            for (int k=0; k<5;k++){
                System.out.print("* ");
            }System.out.println();
        }

    }
}
