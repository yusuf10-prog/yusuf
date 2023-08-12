package YoutbeAhmetBulutoz;

public class Relational {
    public static void main(String[] args) {
        // ! true ==> false,
        // !(5==5) ==> false,
        // 5!=5   ==> false

        int a=10;
        int b=15;

        System.out.println(a!=b); // true
        // a eşit değildir b ye yani 10 eşit değildir 15 e o yüzden true,
        System.out.println(a !=b-5); // false
        // a eşit değildir b' eksi 5 'e  sonuc 10 eşittir 15-5 = 10
        // 10 !=10 olduğu için false

        boolean c;

        System.out.println(c=15!=b); // false


    }
}
