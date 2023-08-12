package YoutbeAhmetBulutoz;

public class karsilastirmaOrnek {
    public static void main(String[] args) {
        int a=10;
        int b=15;

        System.out.println(a == b); // false
        System.out.println(a==b-5); // true

        boolean c;

        System.out.println(c=15==b); // true

        c=15*a==10*b;

        System.out.println(c); // true
    }
}
