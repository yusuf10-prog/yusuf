package day35_inheritance;

public class FDoktor extends EMuhasebe{

    /*

                                    ÖNCEKİ DERSTEN AKLİMİZDA KALANLAR

        1 - inheritance kullanan bir child class 'dan olusturulan tum objeler, olusturulduklari
            class'daki ozelliklerle birlikte, parent class(lar)'daki ozelliklere de sahip olur.
        2 - Bir obje olusturulduğunda class'daki intance variable'larin birer kopyasini alip, obje
            ile iliskilendiren Constructor'dır.
        3 - Child class'da olusturulan her obje icin parent class'daki constructor'larin da
            calismasi gereklidir ki o class'daki ozelliklere sahip olabilsin.
        4 - Java da extendes keyword kullanilan bir class'da var olan veya olusturulan her
            constructor'ın ilk satirinda constructor call OLMALİDİR.
        5 - Kodu yazan kisi constructor'ın ilk satirina programa uygun bir constructor call
            yazabilir.
        6 - Kodu yazan kisi constructor'ın ilk satirina constructor call koymazsa Java otomatik
            olarak parent class'daki parametresiz constructor'ı calistiran super(); constructor call'ı koyar.
        7 - Bir child class'da local olarak bir variable ismi yazildiğinda, Java bu variable'in
            değerini bulabilmek için sirasiyla A - scope'a B - Class level'a C - parent class(lar)'a bakar.
        8 - eger this.variableIsmi yazilirsa, scope'a bakmadan direk class level 'dan baslar.
        9 - eger super.variable ismi yazilirsa scope ve class level pass gecilir.
        10- Arama yaparken hep yukarı doğru calisilir, bulunamazsa asagi bakilmaz CTE olur.
     */
    FDoktor(){
        super(3);
        System.out.println("Parametresiz Doktor constructor'ı calisti");
    }

    FDoktor(String str){
        System.out.println("String Parametreli Doktor constructor'ı calisti");

    }

    FDoktor(int sayi){
        this();
        System.out.println("İnt Parametreli doktor constructor'i calisti");
    }

    public static void main(String[] args) {
      //  FDoktor doktor1=new FDoktor("Java");

      //  FDoktor doktor2=new FDoktor();


        FDoktor doktor3=new FDoktor(5);

    }
}
