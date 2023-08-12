package day11_stringManipulatinos;

public class C07_indexOf {
    public static void main(String[] args) {
        String str = "Ali topu at, at ali at";

        // Ali 'nin index 'i nedir?  0


        System.out.println(str.indexOf("Ali"));

        // at'in index'i nedir? 9

        System.out.println(str.indexOf("at"));


        // op'un index'i nedir? 5

        System.out.println(str.indexOf("op"));

        System.out.println(str.indexOf('a')); // 9

        System.out.println(str.indexOf("a", 10)); //13

        System.out.println(str.indexOf("yusuf"));  //-1

        String str1 = "Ali";

        String str2 = "Can";

        System.out.println(str1 + " " + str2);

        System.out.println("Ali " + "Can");

        System.out.println("Ali" + " Can");



        int num1 = 4;

        int num2 = 5;

        String str3 = "Osman";

        System.out.println(str3+num1+num2);

        System.out.println(2+3<5);  // false
        System.out.println(2+3 >= 5); // true
        System.out.println(2+4!=5);  // true

        System.out.println(2+4 != 5 &&  5>6);  // false
                            // true veya false   ikisinden birisi false olduğu için sonuç false oluyor.
        System.out.println(2+4 >= 5 && 'a'<'c');  // true

        System.out.println(2+4 >= 5 || 'a'<'c');  // true

    }
}
