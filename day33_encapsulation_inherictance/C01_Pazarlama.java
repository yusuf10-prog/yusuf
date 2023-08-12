package day33_encapsulation_inherictance;

public class C01_Pazarlama {
    /*
        satis degeri giricekler
        satiş girebilsin ama baskalarinin girdiği satislari göremesin

        toplam satis degerini görmesi gerekenler görsün ama
        toplam satis değeri gören kişiler tarafindan degistirilemesin

     */
    private int toplamSatis; // read only // sadece okunabilir
    private  int satis; // write only // sadece yazilabilir

    /*
        yetki ayirimi yapacağımız class'larda
        istediğimiz islemi bizim adimiza yapacak
        public method'lar olusturacagiz

        getter method'lari baska class'lar icin
        private variable 'lara ulasir.
        ve degerini o class'lara döndürür.


     */

    public int getToplamSatis() {
        return toplamSatis;
    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatis+=satis;
    }
}
