package day35_inheritance;

public class EMuhasebe extends DHastane{
    EMuhasebe(){
        System.out.println("Parametresiz Emuhasebe constructor'ı calisti");
    }
    EMuhasebe(String a ){
        System.out.println("String parametreli Emuhasebe constructor'ı calisti");
    }
    EMuhasebe(int sayi){
        this("Yusuf");
        System.out.println("int paramatreli Emuhasebe constructor'ı calisti");
    }

}
