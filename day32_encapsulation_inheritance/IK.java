package day32_encapsulation_inheritance;

public class IK {
    /*
    tüm perosnel için ortak olan variable ve methodlar bu class'da tutulur. böylece alt class'ların her birinde
    bu kadar variable'ı yeniden oluşturmak zorunda kalmayız
     */


    protected String isim="Değer Atanmamış";
    protected String soyisim="Değer Atanmamış";

    protected void maas() {
        System.out.println("personel maasş alır");
    }

    protected void izin() {
        System.out.println("personelin izin hakkı vardır");
    }

    protected void ozelSigorta() {
        System.out.println("personele özel sigorta desteği yapılır");
    }

}
