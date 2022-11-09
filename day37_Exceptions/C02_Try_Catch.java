package day37_Exceptions;

import java.util.Scanner;

public class C02_Try_Catch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bölünecek tamsayıyı giriniz");
        int a= scan.nextInt();
        System.out.println("lütfen bölecek tamsayıyı giriniz");
        int b= scan.nextInt();
        /*
          yazdigimiz kodda exception olusma ihtimali ongordugumuzde o kod blogunu try- catch ile sarmalariz

         try/ catch blogunda 3 bolum vardir
         1- try blogu : yapmak istedigimiz, sorun cikarma potansiyeline sahip code parcacigi
         2- catch keyword ve () bolumu: catch keyword ve () sabittir
            parantez icine yazilacak exception turu kodumuza gore degisecektir
            e yakalanan exception'i koyacagimiz obje'dir
         3- catch {} blogu : exception yakalandiginda calisacak kodlar

         try catch blogu ile hem sorunu kullaniciya bildirip
         hem de kodun calismaya devam etmesini saglayabiliriz.

         Buna handle exception denir
         boylece kodumuz calismasina devam etmis olur.
         */

        try {
            System.out.println("sonuç " + a/b);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("bölecek sayı sıfır olmaz");
        }

        System.out.println("iyi günler");

    }
}
