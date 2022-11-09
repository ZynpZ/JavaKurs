package day32_encapsulation_inheritance;

public class Hemsire extends Muhasebe{
    public static void main(String[] args) {
        /*
        extends keyword ile parent edindiğimizde parentclass'daki access modifier'i public ve protected olanları inherit edebiliriz.
        access modifier default ise sadece aynı package'da isek inherit edebiliriz.
        access modifier private ise inherit edilemez.
        (encapsule edilmişse getter setter ile kullanılabilir.)
         */

        Hemsire hmsr1=new Hemsire();
        hmsr1.isim="Ayse";
        hmsr1.soyisim="Yılmaz";

    }
}
