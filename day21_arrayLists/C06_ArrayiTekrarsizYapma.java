package day21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArrayiTekrarsizYapma {
    public static void main(String[] args) {
        /*
    verilen bir array'den tekrar eden sayıları silip benzersiz sayılardan oluşan bir array haline getirip
    bize döndüren bir method oluşturun
     */

        int[] arr={1,2,3,4,1,2,3,4,2,1,3,4,1,2,3};
        //output [1,2,3,4]

        arr=benzersizYap(arr);

        System.out.println(Arrays.toString(arr));

        int[] arr2={22,2,2,8,8,8,8,9,9,9};
        arr2=benzersizYap(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] benzersizYap(int[] arr) {
        //önce array'in elemanlarını kontrol ederek koyacağım bir list oluşturalım
        List<Integer> benzersizList=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!benzersizList.contains(arr[i])){

                benzersizList.add(arr[i]);
            }
        }
        // artık benzersiz elemanlardan oluşan bir listeye sahibiz
        //şimdi de bir array oluşturup, Listedeki elementleri o array'e atayacağız

        int[] benzersizArr=new int[benzersizList.size()];

        // bir loop ile listedeki elementeleri array'e atayalım

        for (int i = 0; i < benzersizArr.length; i++) {
            benzersizArr[i]= benzersizList.get(i);

        }
        //benzersiz elementlerden oluşan bir array oluşturduk bunu main method'a döndürelim
        return benzersizArr;

    }
}
