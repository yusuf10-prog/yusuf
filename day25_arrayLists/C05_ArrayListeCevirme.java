package day25_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayListeCevirme {
    public static void main(String[] args) {
        Integer [] arr={1,3,4,5,6,6,7,8,8,9,9,7,6,5,44,2};
            // Bu array'i bir list olarak kaydedin
        List<Integer> forList=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            forList.add(arr[i]);

        }

        forList.remove(3);

        System.out.println(forList);  //[1, 3, 4, 5, 6, 6, 7, 8, 8, 9, 9, 7, 6, 5, 44, 2]

        /*
        Arrays class'i bize verilen array'i list'e çeviren hazir bir method sunuyor.

        ANCAK

        bu method'u bize verilen array'i list'e çevirmenin 2 buyuk dezavantaji var.
        1 -  add() ve remove() gibi list 'in uzunluğunu değistiren method'lari desteklemez

       2 -  her ne kadar biz bir list olusturmuş olsak da
            java arka planda hazir method ile olusturulan list ve kaynak arr'yi iliskilendirir
             birinde yapilan değisiklik, digerine de islenir.
         */

        List<Integer> hazirMethodList= Arrays.asList(arr);
        System.out.println(hazirMethodList); //[1, 3, 4, 5, 6, 6, 7, 8, 8, 9, 9, 7, 6, 5, 44, 2]

        forList.remove(3);//
        System.out.println(forList);  //[1, 3, 4, 6, 7, 8, 8, 9, 9, 7, 6, 5, 44, 2]

        //hazirMethodList.remove(3); //UnsupportedOperationException
       // System.out.println(hazirMethodList);

        forList.set(0,10);
        System.out.println(forList); //[10, 3, 4, 6, 7, 8, 8, 9, 9, 7, 6, 5, 44, 2]
        System.out.println(Arrays.toString(arr)); //[1, 3, 4, 5, 6, 6, 7, 8, 8, 9, 9, 7, 6, 5, 44, 2]

        hazirMethodList.set(0,20);
        System.out.println(hazirMethodList);  //[20, 3, 4, 5, 6, 6, 7, 8, 8, 9, 9, 7, 6, 5, 44, 2]

        System.out.println(Arrays.toString(arr)); //[20, 3, 4, 5, 6, 6, 7, 8, 8, 9, 9, 7, 6, 5, 44, 2]

    }
}
