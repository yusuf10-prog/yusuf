package SocrativeSoruları;

import java.util.ArrayList;
import java.util.List;

public class day_16_4 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Can");
        list.add("Ayse");
        list.add(0,"Havva");
        list.add(2,"Yusuf");
        list.add(3,"Kuzkaya");
        list.add(6,"Hasan");
        // 0 ıncı index'e "Havva" yi alip yazdırıyor.
        System.out.println(list); //[Havva, Ali, Can, Ayse]
    }
}
