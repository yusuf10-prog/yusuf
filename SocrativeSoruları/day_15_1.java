package SocrativeSoruları;

public class day_15_1 {
    public static void main(String[] args) {
        short arr[]=new short[4];
        arr[0]=10;
        arr[1]=11;
        arr[3]=13;
        System.out.println(arr);  //[S@58ceff1

        System.out.println(arr[2]);  // 0
        System.out.println(arr[1]+arr[3]);//24


        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];


        }
        System.out.println(sum);

    }

}
