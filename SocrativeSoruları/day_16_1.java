package SocrativeSoruları;

import java.util.ArrayList;
import java.util.List;

public class day_16_1 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Ali");
        System.out.println(list); //[Ali]


        List<String> list1=new ArrayList<>();
        list1.add("Ali");
        list1.add("Ayse");
        System.out.println(list1); //[Ali, Ayse]

        List<String> list3=new ArrayList<>();
        list3.add("Ali");
        list3.add(0,"Ayse");
        // 0 index'e ayşe'yi taşıma işlemi yapıyor.
        System.out.println(list3+ " gör"); //[Ayse, Ali]

        List<String> list4=new ArrayList<>();
        list4.add("Ali");
        list4.add("Ayse");
        System.out.println(list4.toArray().length);
    }
}
