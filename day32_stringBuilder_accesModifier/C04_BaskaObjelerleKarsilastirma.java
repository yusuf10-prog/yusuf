package day32_stringBuilder_accesModifier;

public class C04_BaskaObjelerleKarsilastirma {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1==sb2); // false
        System.out.println(sb1.equals(sb2)); // false

        // StringBuilder equals method'u yerine comparTo() kullanilir.
        System.out.println(sb1.compareTo(sb2)); //0

        //System.out.println(sb1 == str);

        System.out.println(sb1.equals(str)); // itiraz etmez ama false doner

        // equals sadece objenin kendisi ile karsilastirildiği durumda true döner

        System.out.println(sb1.equals(sb1)); // true

    }
}
