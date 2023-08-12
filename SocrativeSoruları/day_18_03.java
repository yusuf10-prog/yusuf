package SocrativeSoruları;

public class day_18_03 {
    int x=1;
    static int y;
    day_18_03(int i){
        x=x+i;
        y=y+i;

    }

    public static void main(String[] args) {
        day_18_03 obj1=new day_18_03(5);
        System.out.println(obj1.x +","+obj1.y);


        day_18_03 obj2=new day_18_03(7);
        System.out.println(obj2.x + ","+ obj2.y);
    }
}
