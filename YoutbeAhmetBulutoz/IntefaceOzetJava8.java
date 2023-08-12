package YoutbeAhmetBulutoz;

public class IntefaceOzetJava8 {
    public static void main(String[] args) {
        SinifA a=new SinifA();
        a.metotA();
        boolean sonuc=InterfaceA.emailKontrol("emrea@asa.com");
        System.out.println(sonuc);

    }
}

 interface InterfaceA{
    abstract public void metotA();
    default void defaultMetot(){
        System.out.println("Ben default metotum");
    }
    static final int sayi=10;

    static boolean emailKontrol(String mail){
        if (mail.contains("@")){
            return true;
        }else return false;

    }
    static void staticMetot(){
        System.out.println("Ben statit metotum");
    }
    interface InterfaceB extends InterfaceA{
        void metotB();
    }

}


class SinifA implements InterfaceA{


    @Override
    public void metotA() {
        defaultMetot();

    }

    @Override
    public void defaultMetot() {
        System.out.println("Ben a sinif icindeki default metotutm");
    }
}
