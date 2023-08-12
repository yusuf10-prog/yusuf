package day19_Scope;

public class C03_baskaClassdanCalssLevelVariablelaraErisim {
    public static void main(String[] args) {
        System.out.println(C02_ClassLevelVariabelar.bls);  // false
        System.out.println(C02_ClassLevelVariabelar.strs); //Java
        System.out.println(C02_ClassLevelVariabelar.sayis); // 0
        System.out.println(C02_ClassLevelVariabelar.chrs); // a

        C02_ClassLevelVariabelar obj=new C02_ClassLevelVariabelar();

        System.out.println(obj.bli); // false
        System.out.println(obj.stri); // null
        System.out.println(obj.sayii); // 23
        System.out.println(obj.chri); //''

        System.out.println(obj.bls);
        System.out.println(obj.strs);
    }
}
