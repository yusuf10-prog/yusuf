package SocrativeSoruları;

import java.util.Arrays;

public class day_15_4 {
    public static void main(String[] args) {
        int arr[]={11,12,13,14};

        System.out.println(Arrays.toString(arr)); //[11, 12, 13, 14]
        // köseli parantezin icindeki degerleri yazdırır

        System.out.println(arr[arr.length-2]); //13

        System.out.println(arr[1]); //12

        for (int i = 0; i <4 ; i++) {
            System.out.print(arr[i] + " "); //11 12 13 14

        }
    }
}
