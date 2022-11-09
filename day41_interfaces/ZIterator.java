package day41_interfaces;

import java.util.ArrayList;
import java.util.List;

public class ZIterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        System.out.println(sayilar);

        //list ve array index yapısını desteklediği için elementleri kalıcı olarak değiştirebiliriz
        // listenin tüm elementlerini 5 artıran bir kod yazdır.
        for (int i = 0; i < sayilar.size() ; i++) {
            sayilar.set(i, sayilar.get(i)+5);
        }
        System.out.println(sayilar);

    }
    // bu soruyu index kullanmadan yapın C01_Iterator
}
