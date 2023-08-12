package SocrativeSoruları;

public class day_11_6 {
    public static void main(String[] args) {
        String str="seyhan yavuz";

        System.out.println(str.replace("s", "S").replace("y", "Y"));
        System.out.println(str.replaceAll("s", "S").replaceAll("y", "Y"));

        System.out.println(str.replace('s', 'S').replace('y', 'Y'));
        //System.out.println(str.replaceAll('s', 'S').replaceAll('y', 'Y'));
        //System.out.println(str.replaceAll('s', 'S').replaceAll('y', 'Y'));
    }
}
