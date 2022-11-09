package day37_Exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bölünecek tamsayıyı giriniz");
        int a= scan.nextInt();
        System.out.println("lütfen bölecek tamsayıyı giriniz");
        int b= scan.nextInt();

        if (b==0) { //if kullanarak çıkabilecek sonuç handle edilebilir ancak
            // bunu görecek kişiler burdan bir hata çıkabileceğini anlamaz. öylesine bir if bloğu sanar.
            // bu yüzden başka bir yöntem kullanılır
            System.out.println("bölecek sayı sıfır olamaz");
        } else {
            System.out.println("sonuç " + a/b);
        }

        System.out.println("iyi günler");

        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at day37_Exceptions.C01_Exceptions.main(C01_Exceptions.java:13)

	    java sizin öngörmediğiniz bir sorunla karşılaşırsa hatanın türünü, kaynağını ve hangi satırda
	    oluştuğunu hata mesajı olarak verir ve çalışmayı durdurur.
         */
    }
}
