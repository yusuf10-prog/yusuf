package day07_ifStatements;

public class C01_BagimsizifCumleleri {
    public static void main(String[] args) {

        /*

            Bagimsiz if cumlaleleri
            isminden de anlaşilacagi uzere
            kodun kalani ile ilgilenmez

            sadece boolean şarta odaklanir
            sartin sonucu true ise if body'si calisir
            bolean şartin sonucu false ise
            if body'si devreye girmez.

            YANII
            birden fazla if cumlesi olan bir kod calistiginda
            kaç tane if body'sinin calisacagi verilen degerlere baglidir.

            tum if body'leri calisabilir
            bazilari calisabilir
            ya da hic bir if body'si calismayabilir


         */

        int a = -201;

        int b=104;

        if (a>0){ // false
            System.out.println("a sayisi pozitif");
        }
        if ((a+b)>100){ // false
            System.out.println("sayilarin toplami 100'den buyuk");
        }
        if (b % 3 ==0){ // false
            System.out.println("b 3 ile tam bolunen bir tamsiyidir");
        }
        if (b<100){ // false
            System.out.println("b 100 ' den kucuk bir tamsiyidir");
        }
    }
}
