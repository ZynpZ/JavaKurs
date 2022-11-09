package day42_iterator_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList {
    public static void main(String[] args) {

        /*
        linkedList'in temel özelliği linked olması yani elementlerin birbirine bağlı şekilde sıralanmasıdır.
        LinkedList üç interface'i implement etmiştir:
        - List
        -Deque
        - Queue
        data türünü hangisinden seçersek onun özelliklerini taşı.
         */

        LinkedList<Integer> ll1=new LinkedList<>();// list,Deque,Queue özelliklerinin hepsini taşır
        List<Integer> ll2=new LinkedList<>();
        Deque<Integer> ll3=new LinkedList<>();
        Queue<Integer> ll4=new LinkedList<>();

        ll2.add(10);
        ll2.add(20);
        System.out.println(ll2); //[10, 20]
        ll2.add(0,30);
        System.out.println(ll2); //[30, 10, 20]

        System.out.println(ll2.subList(0, 2)); //[30, 10]

        // elemen 30'u silmek istersek, index olarak algılanmaması için önce bir variable'a atamalıyız.
        Integer silinecek=30;
        ll2.remove(silinecek);
        System.out.println(ll2); //[10, 20]

        System.out.println(ll2.hashCode()); //1291
        ll2.add(40);
        System.out.println(ll2.hashCode());// 40061 -eleman ekledikten sonra hashCode değişti.
        ll2.remove(1);
        System.out.println(ll2.hashCode()); //1311

        System.out.println(ll2);
        List<Integer> ll5=new LinkedList<>();
        ll5.add(10);
        ll5.add(20);
        ll5.add(30);
        System.out.println(ll5);

        ll2.retainAll(ll5);
        System.out.println(ll2); // birinci ve ikinci listede ortak elementleri getirir. diğerlerini siler.
        // burada işlem yapılan ll2. ll5deki ile ortak olanı yazdırdı. // [10]
        System.out.println(ll5); //[10, 20, 30]
        ll5.retainAll(ll2);
        System.out.println(ll2);//[10]
        System.out.println(ll5); //[10]

    }
}
