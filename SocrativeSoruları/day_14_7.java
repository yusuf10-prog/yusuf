package SocrativeSoruları;

public class day_14_7 {
    public static void main(String[] args) {
        int carpim=1;
        int sayi=1;
        while (sayi<5){
            carpim=carpim*sayi;
            carpim++;
        }
        System.out.println(carpim + " neler oluyor");  // sonsuz dongu oluşur
    }
}
