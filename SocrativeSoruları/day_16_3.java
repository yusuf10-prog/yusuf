package SocrativeSoruları;

import java.util.ArrayList;
import java.util.List;

public class day_16_3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        list.remove(9);
        System.out.println(list);  //IndexOutOfBoundsException
    }
}
