package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_removeAll {
    public static void main(String[] args) {
        String[] arr={"Fatih", "Levent","Esra","Seher"};

        List<String> liste=new ArrayList<>();
        liste.add("Fatih");
        liste.add("Levent");
        liste.add("Esra");
        liste.add("Seher");

        List<String> silinecekListe=new ArrayList<>();
        silinecekListe.add("Fatih");
        silinecekListe.add("Levent");

        liste.removeAll(silinecekListe);
        System.out.println(liste); //[Esra, Seher]

        //removeAll belirlenen silinecek listenin tamamını siler. clear ise tüm listeyi siler

        liste.addAll(silinecekListe);
        System.out.println(liste); //[Esra, Seher, Fatih, Levent]

        System.out.println(liste.equals(silinecekListe));//false
    }
}
