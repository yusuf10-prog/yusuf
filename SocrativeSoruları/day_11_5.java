package SocrativeSoruları;

public class day_11_5 {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";

        System.out.println(str1.equals(str2));              //false
        System.out.println(str1.equalsIgnoreCase(str2));    //true

        System.out.println(str2.equals(str1));              //false
        System.out.println(str2.equalsIgnoreCase(str1));     //true

        System.out.println(!(2>3)); //true
        System.out.println(!(!true));  //true
        System.out.println(!(false));  //true
    }
}
