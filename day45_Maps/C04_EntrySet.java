package day45_Maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_EntrySet {
    public static void main(String[] args) {
        // 10. sınıftaki öğrencilerin no, isim, soyisim ve bölümlerini bir liste olarak kullanıcıya yazdırın
        // No İsim Soyisim Bölüm

        Map<Integer, String> ogrenciMap = ReusableMethods.ogrenciMapOlustur();
        System.out.println("No Isim Soyisim Bölüm");

        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();
        Integer tempKey;
        String tempValue;
        String[] tempValueArr;
        for (Map.Entry<Integer, String> each : ogrenciEntrySet
        ) {
            tempKey = each.getKey();
            tempValue = each.getValue();
            tempValueArr = tempValue.split("-");
            if (tempValueArr[2].equals("10")) {
                System.out.println(tempKey + " " +
                        tempValueArr[0] + " " +
                        tempValueArr[1] + " " +
                        tempValueArr[4]);
            }

        }


    }
}

