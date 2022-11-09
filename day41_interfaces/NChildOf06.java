package day41_interfaces;

public class NChildOf06 implements I06_Interface {
    @Override
    public void method1() {

    }

    public static void main(String[] args) {
        I06_Interface.method3(); // bu static olmadığı için bu şekilde methoda ulaşabiliriz
        NChildOf06 obj=new NChildOf06();
        obj.method2();
    }
}
