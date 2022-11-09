package day46_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_Maps {
    public static void main(String[] args) {
         /*
        Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
        Input : {1,2,3,4,5,3,4,2,5,1,3,2,4,1}
        output : 1 kullanimi : 3 adet
                2 kullanimi : 3 adet
                3 kullanimi : 3 adet
                4 kullanimi : 3 adet
                5 kullanimi : 2 adet
         */
        int[] arr={1,2,3,4,5,3,4,2,5,1,3,2,4,1,1,1,1};
        Map<Integer,Integer> kullanimSayilariMap=new HashMap<>(); //{ } şu an boş ama
        // hedef   { 1=3, 2=3, 3=3, 4=3, 5=2} şekline ulaşmak

        for (int each:arr
             ) {
            // each'in key olarak map'de olup olmadigini kontrol edelim
            if (kullanimSayilariMap.containsKey(each)) {
                //gelen each yani key map'de varsa
                kullanimSayilariMap.put(each,kullanimSayilariMap.get(each) +1);
                //kullanimSayilariMap.get(each) key'in yani each kaç kere kullanıldığını getirir.
            }else {
                // key map'de yoksa (o zaman ekle)
                kullanimSayilariMap.put(each,(1));
            }
        }
        System.out.println(kullanimSayilariMap); //{1=6, 2=3, 3=3, 4=3, 5=2}

        Set<Map.Entry<Integer,Integer>> kullanimsayilariEntrySet=kullanimSayilariMap.entrySet();

        for (Map.Entry<Integer,Integer>each: kullanimsayilariEntrySet
             ) {
            // 1 kullanimi : 3 adet,
            System.out.println(each.getKey()+ " kullanımı : " + each.getValue() + " adet");
        }
    }
}
