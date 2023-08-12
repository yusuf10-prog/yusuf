package day33_encapsulation_inherictance;

public class C05_Runner {
    public static void main(String[] args) {
        C04_Okul okul=new C04_Okul();

        // okul adi private yapip encapsule ettiğimiz variable

        System.out.println(okul.getOkulAdi()); //Yildiz Koleji

        // okul adresi public variable

        okul.setOkulAdi("Java Koleji");

        System.out.println(okul.getOkulAdi()); // Java Koleji

        System.out.println(okul.okulAdresi); // Ankara
        okul.okulAdresi="Ankara / Cankaya";
        System.out.println(okul.okulAdresi); // Ankara / Cankaya
    }
}
