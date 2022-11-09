package day34_inheritance_dataTypeKullanımı;

public class EXC90 extends DVolvo {
    void yakit () {

        System.out.println("XC90 benzin kullanır");
    }

    void motor () {
        System.out.println("XC90 2000 motor kullanır");
    }

    void kasa () {
        System.out.println("XC90 suv kasa kullanır");
    }

    public static void main(String[] args) {
        EXC90 arb1=new EXC90();
        arb1.yakit(); //E classı
        arb1.motor(); //E
        arb1.kasa(); //E
        arb1.guvenlik(); //D E'de olmadığı için D'den aldı

    }
}
