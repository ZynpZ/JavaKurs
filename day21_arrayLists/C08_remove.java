package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C08_remove {
    public static void main(String[] args) {

        String[] arr={"Fatih", "Levent","Esra","Seher"};

        List<String> liste=new ArrayList<>();
        liste.add("Fatih");
        liste.add("Levent");
        liste.add("Esra");
        liste.add("Seher");

        System.out.println(liste);//[Fatih, Levent, Esra, Seher]

        //remove 1- silme işlemi için obje yazılırsa objeyi siler ve boolean sonuç döner

        System.out.println(liste.remove("Fatih"));//true

        System.out.println(liste); //[Levent, Esra, Seher]

        System.out.println(liste.remove("Ahmet")); //false

        //remove 2- index ile silersek, bize silinen elementi döndürür

        System.out.println(liste.remove(1));//Esra

        System.out.println(liste); //[Levent, Seher]

    }
}
