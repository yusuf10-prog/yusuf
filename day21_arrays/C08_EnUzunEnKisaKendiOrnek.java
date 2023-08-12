package day21_arrays;

import java.util.Arrays;

public class C08_EnUzunEnKisaKendiOrnek {
    public static void main(String[] args) {

        String [] adlar={"Yusuf","osman","Ali","Hüseyin", "Kamber"};


        EnUzunEnKisaYazdir(adlar);

    }
    public static void EnUzunEnKisaYazdir(String [] adlar){
        String enUzunAd=adlar[0];
        String enKisaAd=adlar[0];

        for (int i = 0; i < adlar.length ; i++) {
            if (adlar[i].length() > enUzunAd.length()){
                enUzunAd=adlar[i];
            }
            if (adlar[i].length()<enKisaAd.length()){
                enKisaAd=adlar[i];
            }

        }
        System.out.println("En uzun ad :" + enUzunAd);
        System.out.println("En kısa ad : " + enKisaAd);

    }
}
