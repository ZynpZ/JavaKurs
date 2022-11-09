package day42_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //tüm elementleri Iterator ile 5 artıralım
        ListIterator lit= sayilar.listIterator();

        while (lit.hasNext()){

            lit.set((Integer)lit.next()+5); //burda Integer olmazsa hata verir. onun için integer olduğunu bildiğimizden
            // objeyi cast ediyoruz. diğer türlü java objeyi nasıl sayı olarak kullanacağını bilemez
        }
        System.out.println(sayilar);

        //list elementlerini sondan başa yazdır.
        //sondan başa yazdırmak için önce sona gitmeliyiz. ancak üstteki looptan dolayı iterator zaten sonda.

        while (lit.hasPrevious()){
            System.out.print(lit.previous()+ " ");
        }
        // değeri 2-40 arasında olanları sil.iterator şu an başta.

        while (lit.hasNext()) {
            int yukluSayi=(Integer)lit.next();
            if (yukluSayi>20 && yukluSayi<40) {
                lit.remove();
            }
        }
        System.out.println(" ");
        System.out.print(sayilar);



    }
}
