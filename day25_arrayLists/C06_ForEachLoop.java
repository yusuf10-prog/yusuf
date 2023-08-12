package day25_arrayLists;

public class C06_ForEachLoop {
    public static void main(String[] args) {
        int arr[]={20,30,5,45};

        // array'in tum elementlerini toplayin
        // array'in tum elementlerini yazdirin
        // array'in elementlerinden çift sayi olanlari yazdirin.
        // array'in elementlerinden en buyuk olani bulun

        /*
            array'in tum elementlerini gozden geçirmemiz gereken sorularda
            for loop kullaniriz

            for loop'un en önemli özelliği index sayesinde
            tum elementleri 0.index'den sonuncu index'e kadar sirali olarak getirmesindir.

            ama bu sorularda elementi sirasiyla getirmesini hiç bir önemi yok

            index'in yani sirali getirmenin önemli olmadığı durumlarda
            for loop yerine for-each loop kullaniriz.

            for-each : array'e git her bir elementi al bana getir demek

         */

        // sıralamanın önemi olmadığı

        // array'in tum elementlerini yazdirin
        for (int each:arr  // arr ye git her bir elemenı git bana getir der.
             ) {
            System.out.print(each + " ");  //20 30 5 45

        }
    }
}
