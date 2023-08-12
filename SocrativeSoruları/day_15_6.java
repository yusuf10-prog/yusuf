package SocrativeSoruları;

import java.util.Arrays;

public class day_15_6 {
    public static void main(String[] args) {
        int arr[]={1,23,12,2,3};
        System.out.println(Arrays.binarySearch(arr,12));  //2
        // arr'in içindeki sayılardan kaçıncı indexte oldugunu gösterir.

        //Arrays.sort(arr);
        // önce sayiları kendi icerisinde saralama yapar.
        //System.out.println(Arrays.toString(arr)); //[1, 2, 3, 12, 23]
        // sıralama yaptıktan sonra 12 degerinin 3 üncü indexte olduğunu verir.
        System.out.println(Arrays.binarySearch(arr,12)); // 3
       // System.out.println(Arrays.binarySearch(12)); kod hata verdi.
        Arrays.sort(arr); //
        System.out.println(Arrays.binarySearch(arr,12)); // 3


    }
}
