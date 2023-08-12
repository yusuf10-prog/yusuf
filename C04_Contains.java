public class C04_Contains {
    public static void main(String[] args) {
        String str= "Java gun gectikce guzellesiyor";

        // str Java iceriyor mu?

        System.out.println(str.contains("Java")); // true

        // str java içerir mi?

        System.out.println(str.contains("java"));  //false

        // str a içerir mi?

        System.out.println(str.contains("a"));  // true

        // ** contain method'u aranan metnin sayisiyla ilgilenmez
        // sadece VAR veya YOK sonucu dondurur. yani TRUE ya da FALSE

    }
}
