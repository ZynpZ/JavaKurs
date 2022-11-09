package day44_maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import static java.time.chrono.JapaneseEra.values;

public class C03_Map {
    public static void main(String[] args) {
        //Map'deki key ve value listesini ayrı ayrı yazdırın.
        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.keySet());
        // class'da kullanmak için bu keyset'i kaydetmek istersek:
        Set<Integer> ogrenciKeySeti =ogrenciMap.keySet();

        System.out.println(ogrenciMap.values());
        Collection<String> ogrencivalueColl=ogrenciMap.values();

        //103 numaralı öğrencinin bilgilerini yazdıralım:
        System.out.println(ogrenciMap.get(103)); //Ali-Cem-11-B-TM

        //103 numaralı öğrencinin branşını yazdırın
        String ogrenciValue=ogrenciMap.get(103);//103'deki bilgiler ogrenciValue'ya kaydedildi.
        String[] ogrenciValueArr=ogrenciValue.split("-");
        System.out.println(Arrays.toString(ogrenciValueArr)); //[Ali, Cem, 11, B, TM]
        System.out.println("103 numaralı ogrencinin branşı : " + ogrenciValueArr[4]);

        //103 numaralı öğrencinin sınıfını yazdırın
        System.out.println("103 numaralı ogrencinin sınıfı : " + ogrenciValueArr[2]);
    }

}
