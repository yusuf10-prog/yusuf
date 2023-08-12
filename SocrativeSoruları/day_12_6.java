package SocrativeSoruları;

public class day_12_6 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i=i+1) {
            if (i%3==0){
                System.out.println(i + " SORU");
            }
        }

        for (int i = 1; i <=9 ; i=i+3) {
            if (i%3==0){
                System.out.println(i + " A ŞIKKI");
            }
        }
        for (int i = 3; i <=9 ; i=i+3) {
            if (i % 3 ==0){
                System.out.println(i + " B ŞIKKI");
            }
        }
        for (int i = 1; i < 11; i++) {
            if (i%3==0){
                System.out.println(i + " C ŞIKKI");
            }
        }

        for (int i = 1; i >=9 ; i--) {
            if (i%3==0){
                System.out.println(i + " D ŞIKKI");
            }
        }
    }
}
