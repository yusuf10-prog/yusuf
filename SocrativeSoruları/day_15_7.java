package SocrativeSoruları;

import java.util.Arrays;

public class day_15_7 {
    public static void main(String[] args) {
        int arr[]={12,23,12,2,3};
        Arrays.sort(arr); // [2,3,12,12,23]
        System.out.println(Arrays.toString(arr)); //[2, 3, 12, 12, 23]
        System.out.println(Arrays.binarySearch(arr,5));//
        // degerlerin içerisinde 5 olup olmadıgına bakıyor.
        //  [2, 3, 12, 12, 23] sıralama yaptıktan sonra bes degeri 3 ten sonra olduğu için
        // 5 te 3 indexte olduğu için deger olarak -3 döndürür

    }
}
