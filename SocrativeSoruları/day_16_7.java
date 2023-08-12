package SocrativeSoruları;

import java.util.ArrayList;

public class day_16_7 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list.remove(2));
        System.out.println(list.remove("C"));
    }
}
