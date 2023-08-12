package SocrativeSoruları;

public class day_11_03 {
    public static void main(String[] args) {
        String str="Ayhan Beyhan";

        System.out.println(str.toLowerCase());  // ayhan beyhan  // hepsini küçük yapıyor.
        System.out.println(str.replace("h", ""));   //Ayan Beyan

        System.out.println(str.replace("han", "ol")); //Ayol Beyol
        // han yazan yerlere ol kelimesini koyuyor

        System.out.println(str.length());  //12
        // karakter uzunluğu 11 olarak görünüyor ancak 0 dan başladığımız için 12 olmaktadır.

    }
}
