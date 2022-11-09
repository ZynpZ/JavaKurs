package day46_Maps;

import day44_maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Maps {
    public static void main(String[] args) {
        // verilen bir öğrenci map'inde her sınıfta kaçar öğrenci olduğunu yazdıran bir method oluşturun.

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}
        //output {10=2, 11=3}

        Map<String,Integer> sinifSayilariMap=new HashMap<>();
        // ogrenci map'ini entry'lere ayirip sinif kontrolu yapmaliyiz.

        Set<Map.Entry<Integer,String>> ogrenciMapEntrySet=ogrenciMap.entrySet();
        for (Map.Entry<Integer,String> entry:ogrenciMapEntrySet
        ) {
            // elimizde 101=Ali-Can-10-H-MF gibi entry'ler var.
            String[] tempValueArr=entry.getValue().split("-"); //[Ali, Can, 10, H, MF]
            String sinifBilgisi=tempValueArr[2];
            // su an elimizde sinif bilgisi var
            // bunu yeni olusturdugumuz sinifSayilariMap'e ekleyecegiz

            //amacımız sınıf bilgisi daha önceden map'de varsa value'yu bir artırmak.
            //sınıf bilgisi daha önceden map'de yoksa map'e (sınıfbilgisi,1) eklemek

            sinifSayilariMap.computeIfPresent(sinifBilgisi,(k,v)->v+1);
            sinifSayilariMap.putIfAbsent(sinifBilgisi,1);


        }
        System.out.println(sinifSayilariMap);
    }
}
