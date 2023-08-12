package day27_parametreliConstructor_constructorCall;

public class C02_HastaneRunner {
    public static void main(String[] args) {
        C01_Hastane personel1=new C01_Hastane();
        System.out.println(personel1.personelIsmi); // isim atanmadi
        System.out.println(personel1.personelTelefonu); // telefon atanmadi
        System.out.println(personel1.hastaneAdi); // Yildiz Hastanesi
        System.out.println(personel1.hastaneTelefonu); // 031224567254

        personel1.personelTelefonu="55564564645";
        personel1.personelIsmi="Mertkan";

        C01_Hastane personel2=new C01_Hastane();
        System.out.println(personel2.personelIsmi); //Isim atanmadi
        System.out.println(personel2.personelTelefonu); //Telefon atanmadi

    }
}
