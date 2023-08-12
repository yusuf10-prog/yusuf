package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        // Bir list olusturma
        // List<String> isimler=new List(); List abstract olduğu icin bu şekilde yazilmaz
        // data turu PRIMITIVE data turleri OLAMAZ

        List<String> isimler=new ArrayList<>();
        ArrayList<String> isimler2=new ArrayList<>();

        // ikinci yazim bicimi çok kullanilmaz

        // her list olusturulduğunda bo olarak olusturulur.
        // sonra elementler tek tek eklenir.

        System.out.println(isimler); // []

        isimler.add("Burhan");
        isimler.add("Seref");
        isimler.add("Gulsah");

        System.out.println(isimler);  //[Burhan, Seref, Gulsah]

        // elementler ekleme sirasina gore dizilir.

        // eger en son degil de istediğimiz bir index'e elemenet eklemek istersek

        isimler.add(2,"Nergiz");

        System.out.println(isimler); //[Burhan, Seref, Nergiz, Gulsah]

        isimler.add(1,"Omer");
        System.out.println(isimler); //[Burhan, Omer, Seref, Nergiz, Gulsah]

        isimler.addAll(2,isimler);
        // 2 inci indexten sonra bütün isimleri ekleme işlemi yaptı.

        System.out.println(isimler);
        //[Burhan, Omer, Burhan, Omer, Seref, Nergiz, Gulsah, Seref, Nergiz, Gulsah]

        System.out.println(isimler.add("Eyyup")); //true oldugu icin eyyup ismini ekledi.
        System.out.println(isimler);
        //[Burhan, Omer, Burhan, Omer, Seref, Nergiz, Gulsah, Seref, Nergiz, Gulsah, Eyyup]

    }
}
