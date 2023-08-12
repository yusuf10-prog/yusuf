package SocrativeSoruları;

public class day_11_7 {
    public static void main(String[] args) {
        String str="Java kolaydir";

        System.out.println(str.endsWith("r"));  //true
        System.out.println(str.endsWith("dir"));  //true

        System.out.println(str.endsWith(""));  //true
        System.out.println(str.endsWith("Java kolaydir"));  //true
    }
}
