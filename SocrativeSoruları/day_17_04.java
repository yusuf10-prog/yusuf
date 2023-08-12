package SocrativeSoruları;

public class day_17_04 {
    int fiyat=50;
    public day_17_04(int fiyat){
        this.fiyat=fiyat;
    }

    public static void main(String[] args) {
        day_17_04 c1=new day_17_04(50);
        System.out.println(c1.fiyat); //50
/*
        day_17_04 c2=new day_17_04();
        System.out.println(c2.fiyat);

 */

        day_17_04 c3=new day_17_04(50);
        System.out.println("Yazdırdığı değer : " + c3); //SocrativeSoruları.day_17_04@6cd8737
/*
        day_17_04 c4=new day_17_04();
        System.out.println(c4);

 */


    }
}
