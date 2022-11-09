package day39_exceptions;

public class C02_Final {
    public static void main(String[] args) {
        /*
        final keyword variable, method ve class için kullanılabilir:
        -variable final olarak tanımlanırsa o variable'a sonradan değer atanmaz
        -method final olarak tanımlanırsa override edilemez
        -class final olarak tanımlanırsa parent ilan edilemez

        finally bloğu: try bloğu ile kullanılır, exception oluşsa da oluşmasa da çalışır.

        finalize (): garbage collectorun çalışması için ön hazırlık yaparak kullanılmayan objeleri toplar.
         */

        final int sayi=10;
        System.out.println(sayi);
        System.out.println(Integer.MAX_VALUE);
    }
}
