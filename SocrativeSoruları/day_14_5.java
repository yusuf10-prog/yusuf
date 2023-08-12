package SocrativeSoruları;

public class day_14_5 {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i+=1) {
            if (i%3==0){
                System.out.println(i + " SORU");
            }

        }
        int num=3;
        while (num<10){
            System.out.println(num+" a şıkkı");
            num=num+3;
        }
        int b =1;
        while (b<10){
            if (b%3==0){
                System.out.println(b+ " b şıkkı");
            }
            b=b+1;
        }
        int c=9;
        while (c>1){
            System.out.println(c+" c şıkkı");
            c=c-3;
        }


    }
}
