package day35_Overriding;

public class MParent {
    void method1() {
        System.out.println("parent method1");
    }

    int method2() {
        System.out.println("parent method2");
        return 3;
    }

    Object method3() {
        System.out.println("parent method3");
        return "Java";
    }
}
