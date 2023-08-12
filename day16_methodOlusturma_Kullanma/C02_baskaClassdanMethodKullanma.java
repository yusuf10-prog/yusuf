package day16_methodOlusturma_Kullanma;

public class C02_baskaClassdanMethodKullanma {
    public static void main(String[] args) {
        C01_MethodOlusturma.altString("Bu iş çok güzel", 3,10);

        //C01_MethodOlusturma.main('m',"Ali",true);

        /*

        Bir method call sirasinda yazdigimiz degerlere ARGUMENT
        method deklarasyonundaki parante içindeki variable'lara PARAMETRE denir

        public static void altString(String metin, int basIndex, int bitIndex) // parametre

          //C01_MethodOlusturma.main('m',"Ali",true); // argument

          String metin='m';
          int basIndex="ali";
          int bitIndex=true;

          argument'ler ile parametreler uyumlu olmazsa java CTE (altini kirmizi çiter) verir.
          CTE= Compile time error verir.

         */
    }
}
