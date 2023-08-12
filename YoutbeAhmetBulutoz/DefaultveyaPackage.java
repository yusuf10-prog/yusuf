package YoutbeAhmetBulutoz;

public class DefaultveyaPackage {
    int sayi=5;
    void metot(){

    }
    class InnerClass{
    }
}

class Y extends DefaultveyaPackage{
    @Override
    void metot() {
        super.metot();
        System.out.println(sayi);
    }
}
