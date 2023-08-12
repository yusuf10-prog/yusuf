package SocrativeSoruları;

public class day_17_01 {
    int fiyat=20000;
    int yil=2020;
    String marka ="Honda";

    public static void main(String[] args) {
        day_17_01 hondaAraba=new day_17_01();
        System.out.println(hondaAraba.fiyat);
        System.out.println(hondaAraba.yil-3);
        System.out.println(hondaAraba.marka.replace("H", "K"));
        // Honda kelimesinde yer alan H yi K yapar.
    }
}
