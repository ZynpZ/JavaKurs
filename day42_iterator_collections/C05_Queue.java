package day42_iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_Queue {
    public static void main(String[] args) {
        Queue<String> yemekSirasi=new LinkedList<>();
        yemekSirasi.add("ali");
        yemekSirasi.add("veli");
        yemekSirasi.add("ayşe");
        yemekSirasi.add("kemal");
        System.out.println(yemekSirasi);

        //bunda araya -şu indexe element ekleyemezsin

        System.out.println(yemekSirasi.element()); //element getirir. ama silmeyecek. liste aynı kalır.
        System.out.println(yemekSirasi); //

        System.out.println(yemekSirasi.peek()); //element getirir. ama silmeyecek. liste aynı kalır.element'den
        System.out.println(yemekSirasi);
        Queue<String> deneme=new LinkedList<>();
        //System.out.println(deneme.element()); // exception. peekle farkı bu boş listede exception fırlatır. peek null yazar.
        System.out.println(deneme.peek()); // null.

        yemekSirasi.offer("fatma");
        System.out.println(yemekSirasi); //[ali, veli, ayşe, kemal, fatma]

        System.out.println(yemekSirasi.poll()); //ali- listenin başındaki elemanı bize döndürür. ve listeden siler.Remove'dan farkı
        //list boşsa exception fırlatır. bu ise null döndürür.
        System.out.println(yemekSirasi);//[veli, ayşe, kemal, fatma]
        System.out.println(yemekSirasi.remove()); //veli ilkini sildi ve getirdi. lisre aşağıdaki gibi oldu.
        System.out.println(yemekSirasi); //[ayşe, kemal, fatma]



    }

}
