package YoutbeAhmetBulutoz;

public class String_Manipulations {
    public static void main(String[] args) {

        /*
        Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        input1 : “15.30 €”,
         input2 : “11.40 €”
         output : 26.70 €

         */

        String input1="15.30";
        String input2="11.40";

        System.out.println(Double.parseDouble(input1) + Double.parseDouble(input2));

        String a="19";
        String b="20";

        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));

        String k="a";
        String m="c";
        System.out.println(String.valueOf(k) + String.valueOf(m));
    }
}
