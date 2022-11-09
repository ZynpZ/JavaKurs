package day44_maps;

import java.util.List;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {
        //branşı verilen öğrencilerin isim ve soy isimlerini liste olarak yazdırın
        //MF dediğimizde Ali Can, Ayça Can

        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();
        // {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

        List<String> bransOgrenciListesi=ReusableMethods.bransdakiOgrencilerListesiOlustur(ogrenciMap,"tm");

        System.out.println(bransOgrenciListesi);
    }
}
