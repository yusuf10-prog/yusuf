package SocrativeSoruları;

public class day_11_9 {
    public static void main(String[] args) {
        String str="Canan Can";

        System.out.println(str.startsWith("c"));  //false
        System.out.println(str.startsWith("a",3));  // true

        System.out.println(str.endsWith("n"));  //true
        System.out.println(str.endsWith("Can"));  //true
    }
}
