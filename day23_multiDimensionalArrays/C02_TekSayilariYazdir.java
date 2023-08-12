package day23_multiDimensionalArrays;

public class C02_TekSayilariYazdir {
    public static void main(String[] args) {
        int [][] arr={{3,6,8},{2,5,9}, {1,3},{12,23,34}};
        
        // verilen array'deki sayilari
        // aralarinda bir bosluk birakarak yanyana yazdirin
        // en sona da "toplam .. sayi yazdirildi" şeklinde aciklama yazdirin
        
        int toplam=0;
        int sayac=0;

        for (int i = 0; i < arr.length ; i++) { // outer array'i kontrol eder
            for (int j = 0; j <arr[i].length ; j++) {// inner array'leri kontrol eder.
                // arr[i][j] tum elementleri sirasiyla bana getirir
                if (arr[i][j] % 2==1){
                    System.out.println(arr[i][j] + " ");
                    sayac++;
                }
            }
        }
        System.out.println("\nToplam " + sayac + " adet sayi yazdirildi.");
    }
}
