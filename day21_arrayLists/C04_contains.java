package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_contains {
    public static void main(String[] args) {
        /*
        contains methodu bir listede aradığımız elementin olup olmadığının sonucunu boolean olarak döndürür.
         */

        int[] arr={2,3,4,5,3,6,5,8,9,2,4,0,1,6,8,3,9};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }

        System.out.println(sayilar.contains(4)); //true

    }
}
