package SocrativeSoruları;

public class day_11_8 {
    public static void main(String[] args) {
        String b="Ali  12  ?_";

        System.out.println(b.replaceAll("\\d", "*"));  //Ali  **  ?_
        //Sadece sayıların olduğu kısmı yıldızlama yapıyor

        System.out.println(b.replaceAll("\\D", "*"));  //*****12****
        //sayı haricinde gördüğü bütün karakterleri yıldız işlemi yapıyor


        System.out.println(b.replaceAll("\\S", "*") );  //***  **  **
        // Bütün karakterleri yıldızlıyor. Boşluğu yıldızlama yapmıyor.

        System.out.println(b.replaceAll("\\w","*"));  //***  **  ?*
        // soru işareti ve boşlukları yıldızlama işlemi yapmıyor.
    }
}
