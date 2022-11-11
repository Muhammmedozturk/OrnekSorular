package methods;

public class Q02 {
    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {
        tekrarsız("abcdabcd");
}
   public static void tekrarsız(String a){
    String d="";
        for (int i=0; i<a.length();i++){
        String b=a.substring(i,i+1);
        if (a.indexOf(b)!=a.lastIndexOf(b)){
            if (!d.contains(b)){
                d=d+b;

            }
        }
    }System.out.println(d);
   }
}
