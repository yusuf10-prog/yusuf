package YoutbeAhmetBulutoz;

import java.util.Arrays;

public class ComparableKullanimi {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci(1,"emre");
        Ogrenci ogr2=new Ogrenci(2,"hasan");
        Ogrenci ogr3=new Ogrenci(3,"ayşe");

        Ogrenci [] ogreciler={ogr1,ogr2,ogr3};
        String [] isimler={"ayşe", "fatma", "hayriye", "aliye"};

        System.out.println("Dizi sıralamadan önceki hali : ");
        for (Ogrenci gecici:ogreciler){
            System.out.println(gecici);
        }
        //Arrays.sort(ogreciler);

        System.out.println("Dizi sıralamadan sonraki hali : ");
        for (Ogrenci gecici:ogreciler) {
            System.out.println(gecici);
        }
        Arrays.sort(isimler);
        for (String i : isimler)
            System.out.println(i);
    }
}



 class Ogrenci implements Comparable<Ogrenci>{
    int id;
    String ad;

    public Ogrenci(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "ad : " + ad + " id : " +id;
    }

    @Override
    public int compareTo(Ogrenci o) {
       /* if (this.id < o.id){
            return -1;
        }else if (this.id > o.id){
            return 1;
        }else return 0;

        */
        if (this.ad.compareTo(o.ad) < 0){
            return -1;
        }else if (this.ad.compareTo(o.ad) > 0){
            return 1;
        }else return 0;
    }
}
