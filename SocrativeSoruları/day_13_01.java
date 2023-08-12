package SocrativeSoruları;

public class day_13_01 {
    public static void main(String[] args) {

        carpim(3,5);  //13
        carpim(5); //25
       // carpim(2.5);// çalişmadi
        carpim(2.0, 2.5);  //
    }

    public  static void  carpim(int sayi1, int sayi2){
        System.out.println(sayi1*sayi2);

    }
    public static void carpim(int sayi1){
        System.out.println(sayi1*sayi1);

    }
    public static void carpim(double sayi1, double sayi2){
        System.out.println(sayi1*sayi2);
    }
}
