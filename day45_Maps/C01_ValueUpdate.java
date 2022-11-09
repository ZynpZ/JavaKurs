package day45_Maps;

import day44_maps.ReusableMethods;

import java.util.Arrays;
import java.util.Map;

public class C01_ValueUpdate {
    public static void main(String[] args) {
        //103 numaralı öğrencinin soyadını Yan yapalım

        Map<Integer,String > ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        String ogrenciEskiBilgiler=ogrenciMap.get(103);
        System.out.println(ogrenciEskiBilgiler); //Ali-Cem-11-B-TM
        String[] ogrenciValueArr=ogrenciEskiBilgiler.split("-");
        System.out.println(Arrays.toString(ogrenciValueArr)); //[Ali, Cem, 11, B, TM]
        ogrenciValueArr[1]="Yan";
        System.out.println(Arrays.toString(ogrenciValueArr));//[Ali, Yan, 11, B, TM]
        //şu an array' eklendi ama bizim bunu map'e eklememiz lazım
        String ogrenciYeniValue=ogrenciValueArr[0]+"-"+
                                ogrenciValueArr[1]+"-"+
                                ogrenciValueArr[2]+"-"+
                                ogrenciValueArr[3]+"-"+
                                ogrenciValueArr[4];
        ogrenciMap.put(103,ogrenciYeniValue);
        System.out.println(ogrenciMap);
    }
}
