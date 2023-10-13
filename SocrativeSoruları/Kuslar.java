package SocrativeSoruları;

public class day_20_1 {
    public day_20_1(){
        System.out.println("Kuslar constructor");
    }
    public class AvciKuslar extends day_20_1 {
        public AvciKuslar() {
            System.out.println("AvciKuslar constructor");
        }
    }

    public static void main(String[] args) {
        AvciKuslar avc1=new AvciKuslar();
        System.out.println(avc1);
    }
}


