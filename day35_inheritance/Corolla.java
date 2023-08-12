package day35_inheritance;

public class Corolla extends BToyota {
    Corolla(){ // görünür olarak constructor call yok
        // o zaman görünmeyen super(); vardir.
        System.out.println("Corolla parametresiz constructor calisti");
    }
    Corolla(String str){
        // gorunmeyen super(); var.
        // Java'nın koyduğu ve görünür olmayan
        // constructor call HER ZAMAN parametresiz olan
        // super();
        // kodu yazan kisiler isterlerse ilk satira
        // baska constructor call yazabilirler.
        // eger ilk satirda görünür bir constructor call varsa
        // Java default olarak koyduğu super();'u siler


    }
    String uretimYeri="Sakarya / Türkiye";
    String model="Corolla";
    String aku="İnci aku";
    String sanziman="Cvt";

    public static void main(String[] args) {
        Corolla corolla=new Corolla();
        Corolla corolla1=new Corolla("Kirmizi");





        // Bir objenin bir class'da olusturulan özelliklere ulasmasi
        // ve o class da atama ilk degerlere sahip olmasi icin
        // o class'larin constructor'lari calismak ZORUNDADİR.

        // extends keyword kullanilan bir class'da
        // olusturulan HER CONSTURTOR'in ilk satirinda
        // biz görsek de görmesek de
        // CONSTRUCTOR CALL vadir.
        // Eger ilk satirda görünür bir constructor call yoksa
        // Java'nin koyduğu görünmeyen super(); constructor call vardir.


    }
}





