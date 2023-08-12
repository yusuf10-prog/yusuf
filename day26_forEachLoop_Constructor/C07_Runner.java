package day26_forEachLoop_Constructor;

public class C07_Runner {
    public static void main(String[] args) {


        C04 obj;
        // deklarasyon vardir ama ete kemige urunmus bir obje yoktur

        new C04();
        // objeyi olusturduk ama sonraki satirlarda kullanmayiz.
        // cunku bir objeye atamadik

        System.out.println(new C04().sayi); // 10

        C04 obj2=new C04();
        //  tam bir obje olusturmadır.
        // objeye kaydettiğim icin obj2 üzerinden kullanabiliyorum.


    }
}
