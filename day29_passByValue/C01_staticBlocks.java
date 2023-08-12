package day29_passByValue;

import day28_ConstructorCall.C01_CostructorCall;
import org.w3c.dom.ls.LSOutput;

public class C01_staticBlocks {
    C01_staticBlocks(){
        System.out.println("parametresiz constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        C01_staticBlocks obj=new C01_staticBlocks();
        System.out.println("obje olusturuldu");
    }
    static {
        System.out.println("Static blok calisti");
        // static bloklar main methodundan önce çalışır
        // ilk önce bu calişir sonra ikinci calişir.
    }
    static {
        System.out.println("static blok 2 calistir");
        System.out.println("static olduğum icin önce ben çalışırım");
    }
    {
        System.out.println("static olmayan blok calisti");
        // obje olusturulduğunda calisir.

    }
}
