package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_size_get {
    public static void main(String[] args) {
        String[] arr={"Fatih", "Levent","Esra","Seher"};

        List<String> liste=new ArrayList<>();
        liste.add("Fatih");
        liste.add("Levent");
        liste.add("Esra");
        liste.add("Seher");
        //size methodu listenin uzunluğunu verir

        System.out.println(liste.size()); //4

        // listedeki herhangi bir indeksteki herhangi bir elemente ulaşmak istersek

        System.out.println(liste.get(2));//esra

        // add(indeks, istenenDeger) eski listeden hiçbir elementi silmeden istediğimiz elementi istediğimiz indexe koyar
        //sonraki elementler bir geriye kayar

        liste.add(2,"Ayse");
        System.out.println(liste); //[Fatih, Levent, Ayse, Esra, Seher]

        // set methodu ise istenen index'deki eski elementi silip yerine yeni elementi ekler. yani update
        liste.set(2,"Yasar");
        System.out.println(liste); //[Fatih, Levent, Yasar, Esra, Seher]
    }
}
