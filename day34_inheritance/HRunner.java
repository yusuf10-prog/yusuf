package day34_inheritance;

public class HRunner {
    public static void main(String[] args) {
        GAvciKuslar avciKusKartal=new GAvciKuslar();
        // Avci kuslar class'ından aldığı özellikler
        avciKusKartal.hareket(); // ucarlar
        avciKusKartal.beslenme(); // et yerler
        avciKusKartal.pence(); // pencelidir
        avciKusKartal.gaga(); // sivri gagali

        // Kuslar class'ından aldığı özellikler

        avciKusKartal.kanat(); // kanatlidirlar
        avciKusKartal.solunum(); //Akcigerle nefes alirlar
        avciKusKartal.cogalma(); //Yumurtayla cogalirlar

        // hayvanlar class'indan aldiği ozellikler

        avciKusKartal.omur(); // yasar ve olurler

        avciKusKartal.toString();
    }
}
