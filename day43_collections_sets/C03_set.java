package day43_collections_sets;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_set {
    public static void main(String[] args) {
        /*
        Integer'lardan oluşan bir hashSet ve treeSet oluşturun. birloop ile bu setlere
        rastegele sayıları element olarak ekleyip sürelerini karşılaştırın.
         */

        Set<Integer> hashSet=new HashSet<>();
        Set<Integer>treeSet=new TreeSet<>();

        Random rnd=new Random();
        int temp;

        Long hashSetBaslangic=System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) { //10000 tane sayı üretsin
            temp=rnd.nextInt(1000); //1000'den küçük sayılar üretsin
            hashSet.add(temp);

        }
        Long hashSetBitis=System.currentTimeMillis();
        System.out.println(hashSetBitis-hashSetBaslangic);

        Long treeSetBaslangic=System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) { //10000 tane sayı üretsin
            temp=rnd.nextInt(1000); //1000'den küçük sayılar üretsin
            hashSet.add(temp);

        }
        Long treeSetBitis=System.currentTimeMillis();
        System.out.println(treeSetBitis-treeSetBaslangic);
    }
}
