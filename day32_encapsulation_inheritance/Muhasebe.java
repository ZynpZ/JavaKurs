package day32_encapsulation_inheritance;

public class Muhasebe extends IK{
    /*
    bu class'da da personelin kişisel bilgilerine ihtiyaç vardır.
    bu bilgilere ulaşmak için 2 ihtimal vardır:

    1- IK Classından obje oluşturabiliriz
    2- daha kolay ve sağlıklısı Muhasebe Classı'ndan IK class'ını inherit ederiz yani parent ediniriz
     */

    protected String sgkNo="Değer atanmamış";
    protected boolean raporluMu;
    protected int minSaatUcreti=12;

    protected int fazlaMesai(int fazlaMesaiSüresi) {
        return fazlaMesaiSüresi*minSaatUcreti*2;

    }

    protected int standarMaas() {
        return 30*8*minSaatUcreti;
    }

}
