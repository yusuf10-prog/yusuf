package day35_inheritance;

public class BToyota extends Araba {
    BToyota(){
        System.out.println("Toyota parametresiz constructor calisti");
    }
    // toyota class'ı Araba class'ına uzanır

    // parent calss'daki bazi ozellikleri update edebiliriz.
    String marka="Toyota";
    String uretimYeri="Toyota araçlar japonya ve Turkiye 'de uretilir";

    // parent class'da olmayan yeni ozellikler ekleyebiliriz.

    String lastik="Tüm toyota araclar pirelli lastik kullanir";
    String guvenlik="Tum toyota araçlar extra guvenlik icerir";
    String fren = "Toyota araçlar abs fren sistemi kullanir";
}
