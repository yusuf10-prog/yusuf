package SocrativeSoruları;

public class day_17_05 {
    String str= "a";

    day_17_05(){
        str=str + "b";

    }
    day_17_05(String c){
        str=str + c;

    }

    public static void main(String[] args) {
        day_17_05 deneme=new day_17_05("f");
        System.out.println(deneme.str); // af

        day_17_05 deneme1=new day_17_05();
        System.out.println(deneme1.str); //ab

        day_17_05 deneme2=new day_17_05("r");
        day_17_05 deneme3=new day_17_05();

        System.out.println(deneme2.str + deneme3.str); // arab
    }
}
