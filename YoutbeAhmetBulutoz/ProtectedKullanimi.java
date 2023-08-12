package YoutbeAhmetBulutoz;

public class ProtectedKullanimi {
    protected int protectedDegisken;

    protected void protectedMetot(){

    }
    protected class InnerProctedSinif{

    }
}
class G extends ProtectedKullanimi{
    @Override
    protected void protectedMetot() {
        super.protectedMetot();
        System.out.println(protectedDegisken);
    }
}
