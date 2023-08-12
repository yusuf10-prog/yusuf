package day19_Scope;

public class C04_Scope_Ozet {
    static String str;
    String tel="03123454354";

    public static void main(String[] args) {
        C04_Scope_Ozet obj=new C04_Scope_Ozet();
      //  System.out.println(tel); // static olmayanlar buraya giremez der.
        System.out.println(str);
        obj.str="Java ne guzel";
        int sayi=15;
        method2(sayi);
      //  method1(); //static methodun içinden static olmayan method çağrılmaz

    }
    public void method1(){
        tel="03124324343";
        String isim="John Doe";
        boolean dogruMu;
        int sayi;
    }
    public static void method2(int sayi){
        str=str +".";
       // tel=tel.substring(1); // üstün ırktan olmayanlara izin vermez kullanılmaz
        //int sayi=10;
    }
}
