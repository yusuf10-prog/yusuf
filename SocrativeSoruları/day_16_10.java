package SocrativeSoruları;

import java.util.ArrayList;

public class day_16_10 {
    public static void main(String[] args) {
        ArrayList<Character> list =new ArrayList<>();
        for (char i = 'a'; i <='e' ; i++) {  // a, b, c, d, e
            list.clear();
            list.add(i);
        }
        System.out.println(list);
    }
}
