package SocrativeSoruları;

public class day_17_02 {
    String isim="Ali Can";
    int yas=33;
    int kilo=85;
    day_17_02(){
    }
    day_17_02(String isim, int yas){
        this.isim=isim;
        this.yas=yas;

    }

    day_17_02(String isim){
        this.isim=isim;
    }

    public static void main(String[] args) {
        day_17_02 insan01=new day_17_02();
        System.out.println(insan01.isim);

        day_17_02 insan02=new day_17_02("Veli Han");
        System.out.println(insan02.isim);
        System.out.println(insan02.yas);
        System.out.println(insan02.kilo);
/*
        day_17_02 insan03=new day_17_02(44,"Ayse Tan");
        System.out.println(insan03.isim);
        System.out.println(insan03.yas);
        System.out.println(insan03.kilo);

 */
    }

}
