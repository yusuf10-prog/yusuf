package day32_stringBuilder_accesModifier;

public class C06_Runner {
    public static void main(String[] args) {
        C05_ obj=new C05_();
        //System.out.println(obj.privateSayi);
        // private calss uyelerine class disindan hic bir şekilde ulaşilmaz

        System.out.println(obj.defaultSayi); // 0
        obj.defaultSayi=20;
        System.out.println(obj.defaultSayi);  //20
        System.out.println(obj.proctedSayi);  // 0
        obj.proctedSayi=30;
        System.out.println(obj.proctedSayi); //30

        System.out.println(obj.publicSayi); //0
        obj.publicSayi=50;
        System.out.println(obj.publicSayi);  //50
    }
}
