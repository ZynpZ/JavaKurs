package day42_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        System.out.println(sayilar);

        for (Integer each : sayilar) {
            each = each + 5;
            System.out.print(each + " ");// bu şekilde kalıcı olarak değişmez

        }

        System.out.println(sayilar);
        /*
        Iterator interface'dir. cons. yoktur ve obje oluşturulamaz.
        conrete classlardan iterator'un özelliklerini kullanmak isteyenler
        iterator interface'indeki methodları kendilerine uyarlamış olmalıdır. biz de o uyarlanan methodları kullanacağız
         */


        Iterator itr = sayilar.iterator();

        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        //iterator en son bıraktığımız yerde durur. yeniden baştana başlamak için yeni bir iterator oluşturulmalıdır.

        Iterator itr2 = sayilar.iterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next() + " ");
        }
        System.out.println(" "); // alt satıra geçsin diye yazıldı

        // iterator kullanarak listenin tüm elementlerini silin. bunun için baştan itertor oluşturmalıyız

        Iterator itr3 = sayilar.iterator();
        while (itr3.hasNext()) {
            itr3.next();
            itr3.remove(); //removeAll yok bunda
        }
        System.out.print(sayilar);

        //listede 20'den büyük elementleri sil. bunun için sayıları yeniden ekleyelim.
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        // iterator ile çalışırken next() methodunu nerede görürse görsün hemen bir sonraki elemente geçer

        Iterator itr4 = sayilar.iterator();

        while (itr4.hasNext()) {
            if ((Integer) itr4.next() > 20) {
                itr4.remove();
            }
            System.out.println(sayilar);
        }
    }
}
