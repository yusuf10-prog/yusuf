package day34_inheritance;

public class DRunner {
    public static void main(String[] args) {
        //Corolla class'indaki ozellikler
        Corolla corolla=new Corolla();
        System.out.println(corolla.uretimYeri); // Corolla class'indan aldı Sakarya / Türkiye
        System.out.println(corolla.model); // Coralla class'indan Corolla
        System.out.println(corolla.aku); // Corolla class'indan aku
        System.out.println(corolla.sanziman); // Corolla class'indan aldı Cvt

        // Toyota class'indaki ozellikler
        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.lastik); // Tüm toyota araclar pirelli lastik kullanir
        System.out.println(corolla.guvenlik); //Tum toyota araçlar extra guvenlik icerir
        System.out.println(corolla.fren); //Toyota araçlar abs fren sistemi kullanir

        // Araba class'indan aldiği özellikler
        System.out.println(corolla.yakit); //yakit turu belirtilmedi
        corolla.yakit="Benzin";
        System.out.println(corolla.yakit); // Benzin
        System.out.println(corolla.yil); // 1900
        System.out.println(corolla.renk); // Renk belirtilmedi



    }
}





