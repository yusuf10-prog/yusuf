package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullanicidanDegerAlarakListOlusturma {
    // soru - 2 Kullanicidan istediği kadar isim alip,
    //        Q 'a bastiğinda girdiği isimleri bize liste olarak dondurecek
    //         bir method olusturun

    public static void main(String[] args) {
        System.out.println(ListOlustur());

    }
    public static List<String> ListOlustur(){

        String girilenIsim;

        List<String> isimList=new ArrayList<>();



        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Listeye eklemek icin isim giriniz,\nBitirmek icin Q'ya basiniz");
            girilenIsim=scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")){
                // girilen isim q eşit değil ise isim listesini yazılan isimleri yaz
                isimList.add(girilenIsim);
            }

        }while (!girilenIsim.equalsIgnoreCase("q"));
        // girilen isim q 'ya eşit olmadığı sürece devam etsin
        return isimList;
    }
}
