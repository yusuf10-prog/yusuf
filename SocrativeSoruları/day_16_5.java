package SocrativeSoruları;

import java.util.ArrayList;
import java.util.List;

public class day_16_5 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Can");
        list.add("Ayse");
        list.set(1,"Havva");
        list.set(0,"Yusuf");

        // set işlemi ile "Can" ismi yerine "Havva" ismini update etti.

        System.out.println(list);  //[Ali, Havva, Ayse]
    }
}
