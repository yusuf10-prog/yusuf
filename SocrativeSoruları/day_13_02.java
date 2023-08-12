package SocrativeSoruları;

public class day_13_02 {
    public static void main(String[] args) {

        toplam(3,5); //10
        toplam(3.1,5.2);  //11.3
        toplam(3.1,5); //11.1

    }
    public static void toplam(int sayi1, int sayi2){
        System.out.println(2+sayi1+sayi2);

    }
    public static void toplam(double sayi1, double sayi2){
        System.out.println(3+sayi1+sayi2);
    }
}
