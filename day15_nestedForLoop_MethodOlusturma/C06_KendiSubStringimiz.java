package day15_nestedForLoop_MethodOlusturma;

public class C06_KendiSubStringimiz {
    public static void main(String[] args) {
        String str="Java Candir";
        int baslangic=3;
        int bitis=7;

        /*
        Verilen String ve baslangic, bitis degerlerini dikkate alarak
        1- bitis degeri baslangic degerinden kucukse hata mesaji yazdirin
        2- baslangic veya bitis degerleri index degerleri ile uyusmuyorsa hata mesaji
        4- degerler uygunsa baslanic index'inden(dahil), bitis index'ine kadar
            karakterleri yazdirin
         */

        if (baslangic > bitis){
            System.out.println("baslanic degeri bitis degerinden buyuk olamaz");
        }else if (baslangic <0 || bitis <0 || baslangic>=str.length() || bitis>=str.length()){

        }else{
            for (int i = baslangic; i < bitis; i++) {
                System.out.println(str.charAt(i));

            }
        }
        System.out.println(str.substring(baslangic,bitis));

        str.substring(5);

        /*
            Bu method bize "Candir" döndürür
            ancak
            yazdirmazsak veya bir variable 'a atamazsak
            bu method'un döndürdüğü sonuç bir ise yaramaz

         */

        String strIstenenBolumu=str.substring(5); // kaydeder ama yazdirmaz

        System.out.println(str.substring(5)); // yazdirir ama kaydetmez
    }
}
