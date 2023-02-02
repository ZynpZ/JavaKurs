package day21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarsizArray {
    public static void main(String[] args) {
        /*
        verilen bir integer array'deki tekrar eden elementleri sadece 1 tane yapıp, array'i güncelleyin
         */

        int[] arr={1,2,3,4,1,2,3,4,2,1,3,4,1,2,3};
        //output [1,2,3,4]

        List<Integer>benzersizList=new ArrayList<>();

        /*
        array'deki elementleri kontrollü olarak listeye ekleyelim. listede yoksa ekleyelim yoksa eklemeyelim
         */

        for (int i = 0; i < arr.length; i++) {
            if (!benzersizList.contains(arr[i])){

                benzersizList.add(arr[i]);
            }
        }
        System.out.println(benzersizList); //[1, 2, 3, 4]

        //bu listeyi arr listesine atamak için yeni bir array oluşturup
        // listedeki elementleri yeni array'e ekleriz sonra da arr'ye değer olarak yeni array'i atama yaparız

        int[] benzersizArr=new int[benzersizList.size()];

        //benzersiz listenin uzunluğunda bir array olusturduk

        for (int i = 0; i < benzersizArr.length; i++) {
            benzersizArr[i]= benzersizList.get(i);

        }
         arr=benzersizArr;

        System.out.println(Arrays.toString(benzersizArr)); //[1, 2, 3, 4]
    }
}
