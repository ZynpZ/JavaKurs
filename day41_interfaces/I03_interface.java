package day41_interfaces;

public interface I03_interface {
    public abstract void method1(); //public abstract kısmı gridir. çünkü yazılmasına gerek yok kendiliğinden öyledir.
    public void method2(); //public ve abstracttır
    abstract String method3(); //public ve abstracttır

    int method4(); //public ve abstracttır

    public static final int sayi=10; // public static final kısmı gri oluyor çünkü bu belirtilmese de öyledir. yazmaya gerek yok
    int sayi2=20; //public static final'dir. burada verilen değer sonradan değiştirilemez. final çünkü

    //int sayi3; bunu değer atamadan öyle bırakamazsın çünkü final. normalde classlarda bırakılabiliyordu.

}
