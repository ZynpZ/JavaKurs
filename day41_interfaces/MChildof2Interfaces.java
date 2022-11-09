package day41_interfaces;

public class MChildof2Interfaces implements I04_Parent1,I05_Parent2{
    public static void main(String[] args) {
        System.out.println(sayi); //10
        System.out.println(I04_Parent1.sayi2);
    }

    @Override
    public void method1() { //burada iki parent'da da olan bodysi olmayanaynı isimde
        // method override edildi. hangisinin olduğu önemli değil.

    }

    @Override
    public int method2() {
        return 0;
    }


}
