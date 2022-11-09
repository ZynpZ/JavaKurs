package day33_inheritance;

public class EXC90 extends DVolvo {

    String model="XC90";
    EXC90 (String renk) {
        //super() parametresiz cons. çalışır ilk
        System.out.println(renk + "bir XC90");
    }

    public static void main(String[] args) {

        EXC90 arb1=new EXC90("Kırmızı");
    }
}
/*
java'nın classlara otomatik koyduğu default constructorlerın parametresiz olduğu gibi
extends keyword kullanılan classlarda oluşturulan her cons.un ilk satırına konulan super()'de parametresizdir.
 */
