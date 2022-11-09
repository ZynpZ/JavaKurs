package day45_Maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        //tüm öğrencilerin bilgilerini bir liste şeklinde kullanıcılara yazdırın
        // no isim soyisim sınıf sube bölüm
        /*
        {101=Ali- Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Yan-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}
            Java map'lerde  key ve value'yu birlikte manipüle(işlem) edebilmemiz için map'lere özel entry Class'ı oluşturmuştur.

           101=Ali-Can-10-H-MF   1.entry
           101=Ali-Can-10-H-MF   2.entry
         */
        Map<Integer,String>ogrencimap= ReusableMethods.ogrenciMapOlustur();

        //Map'deki tün entry'leri bir set'e store ettik
        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrencimap.entrySet();

        for (Map.Entry<Integer,String > each: ogrenciEntrySet
             ) {
            Integer tempKey=each.getKey();
            String tempValue= each.getValue();
            String[] tempValueArr=tempValue.split("-");
            System.out.println(tempKey+" " +
                                tempValueArr[0]+" "+
                                tempValueArr[1]+" "+
                                tempValueArr[2]+" "+
                                tempValueArr[3]+" "+
                                tempValueArr[4]);
        }
    }
}
