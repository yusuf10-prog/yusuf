package day18_whileLoop_DoWhileLoop;

public class C07_DoWhileLoop {
    public static void main(String[] args) {

        /*
        3 cesit loop gorduk
        hepsinin avantajlari ve devavantajlari var

        1- for loop baslangic ve sonucu belirli sayi olan durumlarda
            veya kac kere tekrar edecegimizi bildigimiz durumlarda avantajli

        2- while loop; kac kere tekrar edeceğini bilmedigimiz
            islemleri yapmak icin avantjli

        3 - do-while loop kullanicidan deger alarak yaptigimiz işlemlerde
            ilk deger atamasini kod yazan kisinin degil de
            kullanicinin yapmasi acisindan avantajli
            
         */

        int bas=10;
        int bit=20;
        int toplam=0;



        // while loop ile baslangic degeri ile bitis degeri arasındaki
        // sayilari toplayip yazdirin(sinirlar dahil)
        // baslangic degeri bitis'ten büyükse, toplama olmamali

        while (bas < bit){
            toplam+=bas;
            bas++;
        }
        System.out.println(" while loop ile aradaki sayilarin toplami :" +toplam);

        // simdi de do while loop ile yapalim
        bas=10;
        bit=20;
        toplam=0;

        do {
            toplam+=bas;
            bas++;

        }while (bas<=bit);
        System.out.println(" while loop ile aradaki sayilarin toplami :" +toplam);
    }
}
