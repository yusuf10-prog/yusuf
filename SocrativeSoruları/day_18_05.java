package SocrativeSoruları;

import javax.imageio.stream.ImageInputStream;

public class day_18_05 {
    static String ad = "Ali Can";
    static int kilo = 33;
    public static void arttirma() {
        kilo++;
        System.out.println(kilo);
    }
    public class Static03{
        int num1=12;
        int num2=22;
    }
    public static void main(String[] args) {
            day_18_05.arttirma();
            day_18_05 obj=new day_18_05();
            obj.arttirma();
            obj.arttirma();
        }
    }
