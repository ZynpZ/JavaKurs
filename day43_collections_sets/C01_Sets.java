package day43_collections_sets;

import java.util.*;

public class C01_Sets {
    public static void main(String[] args) {

        Set<Integer> sayilarKumesi=new HashSet<>();
        sayilarKumesi.add(10);
        sayilarKumesi.add(30);
        sayilarKumesi.add(50);
        sayilarKumesi.add(40);
        sayilarKumesi.add(20);

        System.out.println(sayilarKumesi); //[50, 20, 40, 10, 30] sayıları rastgele sıralar.

        sayilarKumesi.add(10);
        sayilarKumesi.add(30);
        sayilarKumesi.add(40);
        System.out.println(sayilarKumesi); //[50, 20, 40, 10, 30] // aynı elementlerden eklemek istersek tekrardan yazmaz.
        // çünkü setlerde her elemandan bir tane vardır tekrar yoktur.

        List<Integer> sayilarList=new ArrayList<>();
        sayilarList.add(1);
        sayilarList.add(2);


        sayilarKumesi.addAll(sayilarList);
        System.out.println(sayilarKumesi); //[1, 50, 2, 20, 40, 10, 30]



        }
    }

