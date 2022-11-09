package day42_iterator_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_deque {
    public static void main(String[] args) {
        Deque<String >stokList=new LinkedList<>();
        //deque: çift taraflı queue demektir.
        // yani iki taraftan da eklenebilir ve silinebilir

        stokList.addLast("malz1");
        stokList.addFirst("malz2");
        System.out.println(stokList);

        System.out.println(stokList.pop()); //ilk elemanı siler.ve bize döndürür.
        stokList.push("malz3"); //ilk sıraya ekler
        System.out.println(stokList); //[malz3, malz1]


    }
}
