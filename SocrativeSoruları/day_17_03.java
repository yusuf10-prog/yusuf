package SocrativeSoruları;

public class day_17_03 {
    private int sayi;
    boolean bl;
    public day_17_03(){
        this.sayi=11;
        bl=false;
    }
    public day_17_03(int sayi){
        this.sayi=sayi;
        this.bl=true;

    }

    public static void main(String[] args) {
        day_17_03 deneme=new day_17_03();
        System.out.println(deneme.sayi);  //11

        day_17_03 deneme1=new day_17_03();
        System.out.println(deneme1.bl); // false

        day_17_03 deneme2=new day_17_03(7);
        System.out.println(deneme2.sayi);  // 7

        day_17_03 deneme3=new day_17_03(7);
        System.out.println(deneme3.bl);  //true
    }
}
