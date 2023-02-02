package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C09_IntergerRemove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(15);
        sayilar.add(20);
        sayilar.add(2);

        System.out.println(sayilar);//[10, 15, 20, 2]

        //eğer listemiz integer ise java remove methodunda obje ve index seçme karışabilir
        //java sayı yazdığımızda direkt index olarak kabul eder

        sayilar.remove(2);
        System.out.println(sayilar); //[10, 15, 2] 2.indexi sildi

        // eğer silmek için 10 girersekbexception olusur
        // sayilar.remove(10);

        // illa da objeyi vererek remove yapamak istersek once bir variable oluşturup o değeri atamalı
        // sonra variable ile remove kullanmalıyız

        Integer silinecek=10;
        sayilar.remove(silinecek);
        System.out.println(sayilar);//[15, 2]

        sayilar.clear(); //tüm listeyi temizler
        System.out.println(sayilar);

    }
}
