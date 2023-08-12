package SocrativeSoruları;

public class day_13_4 {
    public static void main(String[] args) {
        go(); // bad
        go(12); // Good
        go(5>=5); // The best

    }
    public static void go(){
        System.out.println("Bad");
    }
    public static void go(double i){
        System.out.println("Good");
    }
    public static void go(boolean b){
        if (b){
            System.out.println("The best");
        }else {
            System.out.println("The worst");
        }
    }
}

