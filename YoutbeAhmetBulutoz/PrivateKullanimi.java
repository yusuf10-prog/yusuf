package YoutbeAhmetBulutoz;

public class PrivateKullanimi {
    // Private sinif tanımlarinde kullinlmaz.
    // private degisken ve metotlar
    // private yapılan kurucu metot o sınıftan nesne üretilmesini engeller.
    // O sınıftan kalıtım ile yeni sınıf olusturulamaz.
    // private ile inner sınıf tanımlanabilir.

    private int a;

    private void metot(){

    }
    private PrivateKullanimi(){

    }
    private class InnerClass{

    }
}
/*
class YeniSinif extends PrivateKullanimi{

}

 */
