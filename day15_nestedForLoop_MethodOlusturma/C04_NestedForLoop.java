package day15_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*

        Kullanicidan satir sayisi olarak bir rakam alin
        ve asagidaki gibi bir sekil çizdirin
        *
        *   *
        *   *  *
        *   *  *  *
        *   *  *   *


         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir=scanner.nextInt();


        for (int i = 1; i <=satir ; i++) { // satir sayisini
            for (int j = 0; j <=i ; j++) { // sütün sayisini

                System.out.print("*  ");

            }
            System.out.println("");

        }
    }
}
