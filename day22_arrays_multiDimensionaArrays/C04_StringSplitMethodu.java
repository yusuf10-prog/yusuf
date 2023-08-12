package day22_arrays_multiDimensionaArrays;

import java.util.Arrays;

public class C04_StringSplitMethodu {
    public static void main(String[] args) {

        String str= "Java candir, Selenium heyecan";

        String [] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        //[Java, candir,, Selenium, heyecan]

        // Array'in yazım şekli
        // sonraki boşluk ve virgül Array'in yazim şekli

        //split : parçalara ayırır.

        String [] yeniArr=str.split(", ");

        System.out.println(Arrays.toString(yeniArr));  //[Java candir, Selenium heyecan]

        String [] karakterler= str.split("");

        System.out.println(Arrays.toString(karakterler));
        //[J, a, v, a,  , c, a, n, d, i, r, ,,  , S, e, l, e, n, i, u, m,  , h, e, y, e, c, a, n]


    }
}
