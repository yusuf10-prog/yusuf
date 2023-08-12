package day13_stringManipulations_forLoop;

public class C06_ForLoopDikkatEdilecekler {
    public static void main(String[] args) {

        // verdiğimiz başlangic değeri, bitiş şartini sağlamazsa

        // for loop çalişir ANCAK for loop body'si DEVREYE GIRMEZ

        for (int i = 1; i>10 ; i++) {
            System.out.print(i + " ");

        }

        // baslangic degeri ve degisim şekli, hiç bir zaman bitiş degerine ulaşmazsa

        /*

        for (int i = 0; i >=0 ; i++) {
            System.out.println(i + " ");

         */
        // kullanicinin verdiği baslangic ve bitis değerleri dahil olarak
        // bu sayilarin arasinda aranan sayiya tam bolunebilen bir sayi varsa
        // "aranan sayi ile tam bölunebilen bir sayi var" yazdirin

        int baslangic=201;
        int bitis=237;

        int arananSayi=43;

        for (int i = baslangic; i <=bitis ; i++) {
            if (i%arananSayi==0){
                System.out.println("aranan sayi ile tam bolunebilen bir sayi var");
                break;

        }
        }
    }
}
