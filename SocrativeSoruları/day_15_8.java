package SocrativeSoruları;

public class day_15_8 {
    public static void main(String[] args) {
        int arr[]={3,2,3,4,4,5};
        int count=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==3){// arr 3 e eşit olduğu sürece bir attırarak kontrol ediyor.
                // iki defa count işlemi çıktığı için
                count++;
            }
        }
        System.out.println(count); // count 2 olarak çıkıyor.
    }
}
