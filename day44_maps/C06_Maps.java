package day44_maps;

import java.util.List;
import java.util.Map;

public class C06_Maps {
    public static void main(String[] args) {
        // veilen sınıftaki öğrencilerin isim ve soyisimlerini liste olarak döndüren bir metod oluşturun

        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();
        List<String> sinifOgrenciListesi=ReusableMethods.siniftakiOgrenciListesiOlustur(ogrenciMap,10);

        System.out.println(sinifOgrenciListesi);

    }
}
