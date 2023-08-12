package SocrativeSoruları;

import java.util.Arrays;

public class day_15_5 {
    public static void main(String[] args) {
        int arr[]={2,11,0,23,7};
        Arrays.sort(arr);  // kucukten büyüge sıralama yapıyor.
        System.out.println(Arrays.toString(arr)); //[0, 2, 7, 11, 23]


        // kucukten büyüge yazdırma işlemi yapıyor

        for (int i = 4; i >=0 ; i--) {
            System.out.println(arr[i] + " ");

        }
    }
}
