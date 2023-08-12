package SocrativeSoruları;

import java.util.ArrayList;

public class day_16_9 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        ArrayList<Integer> list=new ArrayList<Integer>();

        for (int i = 1; i <= arr.length ; i++) {
            list.add(i);

        }
        System.out.println(list); //[1, 2, 3, 4, 5]
    }
}
