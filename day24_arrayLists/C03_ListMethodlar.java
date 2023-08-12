package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListMethodlar {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        System.out.println(sayilar); // []
        System.out.println(sayilar.size());  // 0

        System.out.println(sayilar.isEmpty()); // true
        // sayilar listesi boş mu diye sorduk true olduğu için boş diye döndü

        sayilar.add(3);
        sayilar.add(5);

        System.out.println(sayilar); // [3,5]
        System.out.println(sayilar.size()); //2
        System.out.println(sayilar.isEmpty()); // false

        System.out.println(sayilar.get(1));  // 5
        // verilen index'deki elementi döndürür.
        // sen bana bir index ver ben de sana int getireyim diyor.

        System.out.println(sayilar.contains(3));
        // var ya da yok mu diye dönüş yapar.
        // varsa true yoksa false dönüş yapar.

        List<Integer> tumsayilar=new ArrayList<>();
        tumsayilar.add(1);
        tumsayilar.add(3);
        tumsayilar.add(5);
        tumsayilar.add(7);

        // sayilarda  yukarıdaki sayilari iceriyorsa true döner.

        System.out.println(tumsayilar.containsAll(sayilar)); // true
        //


    }
}
