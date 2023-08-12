package day26_forEachLoop_Constructor;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {
        // Soru 4 - Kullanicidan bir cumle ve bir harf alin,
        //          harf cumlede kullanilmissa kaç kere kullanildiğini yazdirin
        //          kullanilmadiysa "harf cumlede kullanilmamis" yazdirin.

        String cumle="Java her gecen gun daha zevkli hale geliyor";
        String harf="a";

        String [] cumleArr=cumle.split("");

        //System.out.println(Arrays.toString(cumleArr));

        int sayac=0;

        for (String each:cumleArr
             ) {
            if (each.equals(harf)){
                sayac++;

            }
        }
        if (sayac==0){
            System.out.println("Aradığınız harf cumlede kullanilmamis");
        }else {
            System.out.println("Aradiğiniz  "+ harf + " harf cumlede " + sayac + " kere kullanilmis");
        }
    }
}
