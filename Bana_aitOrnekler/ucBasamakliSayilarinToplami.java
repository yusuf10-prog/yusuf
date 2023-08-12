package Bana_aitOrnekler;

import java.util.Scanner;

public class ucBasamakliSayilarinToplami {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayi giriniz");

        int girilenSayi=scanner.nextInt();

        int rakamlarToplami=0;
        int birlerBasamagi=0;

        // ilk sayi için birler basamağını bulalım.
        // birler basamagini bulmak için modunu alıyoruz yani majilis işlemi yapılıyor.

        birlerBasamagi=girilenSayi%10;

        // birler basamağını bulmak için mecburen majılıs yapmamız gerekiyor.

        // Birler basamağının toplama işlemini yapıyoruz. Birler basamağının değerini bulmak için
        // aşağıdaki şekilde işlem yapıyoruz.
        // rakamlar toplamı zaten sıfır. rakamlarToplami = 0 + 7 ==> yapıyoruz.
        // Rakamlar toplamı =7 olmuş oluyor.

        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        // rakamlarToplami=0+7 ==>7

        // birler basamaginin 7 olduğunu bulduk bu sayıdan kurtulalım.

        girilenSayi=girilenSayi/10;

       // 257/10 = 25,7 gibi bir oran çıkar ancak integer olması sebebiyle 25 olarak verir.

        // bu satira geldiğimizde girilen sayiyi 2 basamaklı hale donusturduk. artık sayimiz 25

        // 25 in birler basamağını alıyoruz.

        birlerBasamagi= girilenSayi%10;

        // 25 majilis degeri 25 i 10 a bolunce  degeri 5 oluyor.

        // burda 25 in birler basamagini bulmaya çalışacağız.
        // yani 5 'i aldık ve 5 ' rakamlar toplamina ekleyeceğiz.

        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        // rakamlarToplami = 7+5 = 12 olur

        // 25 in birler basamagindan yani 5 'ten kurtulmak için asagidaki işlemi yapmamız gerekiyor.

        girilenSayi=girilenSayi/10;

        // 25 bolu 10 ise geriye kalan 2 dir.
        // buraya geldiğimizde artık sayimiz tek basamakli

        birlerBasamagi=girilenSayi%10;

        // 2 nin majilis değeri yine 2 olur.

        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        // rakamlarToplami = 2+12 =14 olur.

        girilenSayi=girilenSayi/10;

        // 2/10 olur. bölümden 0.5 olur ve 0 değerini alır.

        System.out.println("3 basamakli sayilarin toplami : " + rakamlarToplami);


    }
}
