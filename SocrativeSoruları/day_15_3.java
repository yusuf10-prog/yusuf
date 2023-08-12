package SocrativeSoruları;

public class day_15_3 {
    public static void main(String[] args) {
        short arr[] =new short[4];

        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        arr[3]=13;

       // System.out.print(arr[4]); //hata verir
        System.out.println(arr[3]); //13
        System.out.println(arr[arr.length-1]); //uzunluğundan bir eksi 3 olur, yani 4-3 sonucu 13
        //System.out.println(arr[arr.length+1]); //hata verir
    }
}
