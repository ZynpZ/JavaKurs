package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayListOlusturma {

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        /*
        List interface'dir ve interface'lerden obje oluşturulmaz
        dolayısıyla eşitliğin sağ tarafında List<> kullanamayız. onun yerine List'in child classı olan  ArrayList kullanırız.

         */

        System.out.println(sayilar);

        //bir arrayList'e elementler tek tek eklenmelidir.

        sayilar.add(24);
        sayilar.add(32);
        sayilar.add(10);

        System.out.println(sayilar);// [24, 32, 10]



    }
}
