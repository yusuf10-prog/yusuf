package SocrativeSoruları;

public class day_17_06 {
    day_17_06(int x){
        this();
        //Bu class da olup parametresiz consturtor'a git demek oluyor.
        // parametresiz constructor da aşağıda yer alan
        // System.out.println("Parametresiz constructor"); buraya gidiyor ve
        // Parametresiz constructor'ı yazdırıyor.
        System.out.println("Parametreli constructor");
    }
    day_17_06(){
        System.out.println("Parametresiz constructor");
    }

    public static void main(String[] args) {
        day_17_06 obj=new day_17_06(7);
    }
}
