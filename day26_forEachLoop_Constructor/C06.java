package day26_forEachLoop_Constructor;

public class C06 {
    public static void main(String[] args) {


    }


    C06(){
        // bu constructor default constructor'in ozelliklerine sahiptir.
        // ama bu constructor gorunur oldugundan, buna default constructor diyemeyiz.
        // bu constructor'i eklediğimiz icin default constructor silinir.
    }

    void C06(){
        // bu bir constructor degildir.
        // ama return type'i oldugundan method'dur.
        // return type dedigi ise "void" dir.
    }
    // c06(){
    // Invalid method declaration; return type required
    // class adi ile ayni olmadigindan constructor olamaz
    // return type'i olmadigi icin method da olmaz
    // bunun icin java altini kirmizi cizer

    /*
        Constructor bazi kaynaklarda ozel bir method diye gecer.
        Ama cogunlugun kabuluyle
        Constructor baska yapilardan farkli, kendisine ozgü bir yapidir.

        Constructor, constructor'dir.


        Bir kod blogunun constructor olabilmesi için
        2 şarti gerçekleştirmesi gerekir.

        1- ismi class ismi ile ayni olmalidir.
        2- return type'i olmaz.


     */

}
