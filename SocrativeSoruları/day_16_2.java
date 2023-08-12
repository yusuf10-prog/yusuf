package SocrativeSoruları;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class day_16_2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        System.out.println(list.isEmpty()); //true

        List<Integer> list1=new ArrayList<>();
        list1.add(123);

        System.out.println(list1.contains("123")); // false

        // aşağıdaki şekilde yazarsak true oluyor.
       // System.out.println(list1.contains(123)); //

        List<Integer> list2=new ArrayList<>();
        list2.add(321);
        list2.add(123);
        Collections.sort(list2);
        // ters yazilan sayiları tersinden düzüne çeviriyor.
        System.out.println(list2); //[123, 321]

        List<Integer> list3=new ArrayList<>();
        list3.add(321);
        list2.add(123);
        list3.clear();
        System.out.println(list3);  //[]

        List<String> list4=new ArrayList<>();
        list4.add("Yusuf");
        list4.add("Fusuy");
        Collections.sort(list4);
        // düz olan yaziyi tersine çeviriyor.tersine olan yazıyı da düzüne çevirme işlemi yapıyor
        System.out.println(list4);
    }
}
