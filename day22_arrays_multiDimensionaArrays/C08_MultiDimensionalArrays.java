package day22_arrays_multiDimensionaArrays;

public class C08_MultiDimensionalArrays {
    public static void main(String[] args) {
        /*
            Array'ler sayesinde
            birden fazla element barindirabilen yapıilara giriş yaptik

            bir okul dusunsek
            tum ogrenicileri tek bir array'e koymak mantikli olmaz

            ogrencileri sinif ve subelere gore ayirmaliyiz

            Okul={{5.siniflar}, {6.siniflar}, {8.siniflar}}

            Okul={{{5-A sinifi}, {5-B sinifi}}, {{5.siniflar}, {6.siniflar}, {8.siniflar}}

            böylece 5-A sinifindaki bir ogrenciyi
            tum okulda aratmak yerine
            once 5.siniflar array'ine gier
            onun icinde de 5-A array'ine bakarim
         */

        /*
        1-Array : Array'ler aynı data türünden bir den fazla element barindiran java yapilarındandır.
        2- Birden fazla element barindirdiği için elementlerine direk ulaşabilmemiz için index
        kullanmamiz gerekir. Bir elemente ulaşmak veya yeni deger atamak istersek arr[index]
        seklinde array ismi ve o index'ini yazabiliriz.
        3-sout(arr[3]) ==> bize bir element yazdiracaği icin direk yazdirabiliriz, ancak tum array'i
        yazdirmak istersek sout(Arrays.toString(arr)) şeklinde yazdirabiliriz. Eger toString() kullanmazsak
        array'i degil array'in referansini yazdirir.
        4-Bir array'in tum elementlerine erismek, kontrol etmek, update etmek veya yazdirmak
        istersek bir forLoop kullanabiliriz. For-Loop icerisindeki arr[i] bize sirasiyla tum elementleri getirir,
        biz de bu elementler uzerinde istediğimiz islemi yapariz.
        5- İki array'in esit olabilmesi icin hem aynı elementlere sahip olmali, hem de ayni
        indexdeki elementler esit olmali. Bundan dolayi 2 array'in esitliğini kontrol etmeden once
        sort() kullanmakta fayda vardir.
        6-Bir array'de istenen bir elementin var olup olmadigini Arrays.binarySearch(arr, element) ile kontrol
        edebiliriz. Ancak binaryTree yapisindan dolayi binarySearch() calistirilmadan once MUTLAKA
        sort() calistirilmalidir. Sort() calistirilmadan yapılacak binarySearch()'un sonucu ONGURULEMEZ. binarySeorc()
        element varsa indexni, element yoksa - isareti ile birlikte olsaydi hangi SIRADA olacagini dondurur.

         */
    }
}
