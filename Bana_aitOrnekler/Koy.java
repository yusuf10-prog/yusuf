package Bana_aitOrnekler;

public class Koy extends Ilceler{
    String Babakoy="Bigadic'in köyü";
    String avcilar="Edremit köyü";
    String kadikoy="Altınoluk köyü";
    String dedecinar="Sindirgi köyü";

    public static void main(String[] args) {
        Koy koy=new Koy();
        System.out.println(koy.avcilar);
        System.out.println(koy.mevsim);
        System.out.println(koy.dedecinar);
        System.out.println(koy.karesi);
    }
}
