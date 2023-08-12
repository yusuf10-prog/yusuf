package day18_whileLoop_DoWhileLoop;

public class C03_StringiTerseCevirme {
    public static void main(String[] args) {
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        // bu halini bize donduren bir method olusturun.

        System.out.println(metninTerseCevir("Bu is bu kadar")); //

        System.out.println(metninTerseCevir("ey edip adanada pide ye"));

    }

    public static String metninTerseCevir(String metin){
        String tersMetin="";

        int index=metin.length()-1;

        while (index>=0){
         tersMetin+= metin.charAt(index);
         index--;
        }
        return tersMetin;
    }
}
