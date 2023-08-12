package day34_inheritance;

public class EHayvanlar {

    // Bir class olusturulurken
    // ilerde child class'lar olabilir diye dusunuyorsaniz
    // sadece child class'larin ulasmasini istediğiniz method'lari
    // procted access modifier ile olusturabilirsiniz.

    protected void hareket(){
        System.out.println("Hareket ederler");
    }
    protected void solunum(){
        System.out.println("Nefes alirlar");
    }
    protected void beslenme(){
        System.out.println("Beslenirler");
    }
    protected void cogalma(){
        System.out.println("Cogalirlar");
    }
    protected void omur(){
        System.out.println("yasar ve olurler");
    }
}
