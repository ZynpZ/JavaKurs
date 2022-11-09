package day43_collections_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C02_Set {
    public static void main(String[] args) {
       // verilen bir array'deki tekrar eden elementleri silerek
        // her element'den sadece bir tane olacak şekilde yeni bir array oluşturun.

        int[]arr={2,3,4,2,6,5,2,4,6,5,7,9};

        Set<Integer> temp=new HashSet<>();

        for (Integer each: arr
             ) {
            temp.add(each);
        }
        System.out.println(temp);// [2, 3, 4, 5, 6, 7, 9]
        //Set tekrar edenleri sildi. şimdi bu elementleri eski array'a atayalım.

        arr=new int[temp.size()]; //  array'de element silinemeyeceğinden eski array'e yeni boyutta yeni bir array atadık

        //şimdi set'deki her bir elementi array'e atayalım. .
        // set'de index yoktur. bu yüzden şu şekilde yapılır:

        int index=0;
        for (Integer each: temp
             ) {
            arr[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(arr)); //[2, 3, 4, 5, 6, 7, 9]


    }
}
