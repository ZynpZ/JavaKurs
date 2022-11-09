package day32_encapsulation_inheritance;

public class Doktor extends Muhasebe{
    public static void main(String[] args) {
        /*
        insanlar aleminde parentlar child edinir. bundan farklı olarak java'da
        bir class oluşturulduğunda kendi child classlarını seçemez

        Ancak Child Class'lar olursa onlarla neleri paylaşabileceğini seçebilir.
        çünkü java'da parentler child edinmez, child class'lar parent edinir.

        herhangi bir class'da özelliklerini (varolan variable ve methodları) otomatik olarak
        sahiplenmek istediğimiz bir class varsa o class'ı extends keyword ile parent edinirsiniz.
         */

        Doktor dr=new Doktor();
        dr.isim="Recep";
        dr.soyisim="Yılmaz";
        dr.raporluMu=false;
        dr.sgkNo="342567456";
        dr.minSaatUcreti=25;

        System.out.println(dr.standarMaas());//30*25*8=6000


    }
}
