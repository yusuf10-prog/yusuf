package day22_arrays_multiDimensionaArrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        String [] harfler={"l", "a", "P", "d", "T", "t"};

        System.out.println(Arrays.toString(harfler)); //[l, a, P, d, T, t]

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));  //[P, T, a, d, l, t]

        /*
            Arrays.sort() array'deki elementleri
            Natural Order'a gore siralar

            Array'lerde ve bundan sonra goreceğimiz ArrayList'lerde
            method kullanildiğinda array/ArrayList Kalici olaark degisir.
         */

        String [] isimler={"Ayşe", "Yusuf", "Bugra", "Burak", "Nergiz", "Neslihan", "Abdullah"};

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        //[Abdullah, Ayşe, Bugra, Burak, Nergiz, Neslihan, Yusuf]

        int [] sayilar={4, 78, 4, 2, 98, 3, 7, 1};

       Arrays.sort(sayilar,3,6);
        System.out.println(Arrays.toString(sayilar));  //[4, 78, 4, 2, 3, 98, 7, 1]
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));  //[1, 2, 3, 4, 4, 7, 78, 98]
    }
}
