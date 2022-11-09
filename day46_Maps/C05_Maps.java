package day46_Maps;

import day44_maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {
        Map<String,Integer> ornekMap=new HashMap<>();

        ornekMap.put("a",3);
        ornekMap.put("b",1);
        ornekMap.put("c",2);
        ornekMap.put("d",5);
        System.out.println(ornekMap); // {a=3, b=1, c=2, d=5}

        System.out.println(ornekMap.containsValue(5)); //True

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

        System.out.println(ornekMap.containsValue("Ali")); //false
        //containsValue methodu tam olarak value girilirse true döner.
        //ancak value içerisindeki bir değeri aratırsanız false döner. value'nun tamamını aratmalısın.
        System.out.println(ogrenciMap.containsValue("Veli-Cem-11-M-Soz"));

        System.out.println(ornekMap.replace("d", 10)); // eski değerinin döndürür. ama d'yi 10 yapar.
        System.out.println(ornekMap); //{a=3, b=1, c=2, d=10}

        System.out.println(ornekMap.replace("a", 5, 8));// a'nın eski değeri 5 olmadığından false döndürür.
        System.out.println(ornekMap.replace("b", 1, 2)); //true
        System.out.println(ornekMap); //{a=3, b=2, c=2, d=10} a'ya dokunmadı b'yi değiştirdi.

        System.out.println(ornekMap.get("b"));//2
        System.out.println(ornekMap.get("z"));//null döner.z yok çünkü. null olmasın diye aşağıdaki gibi default değer atanabilir
        System.out.println(ornekMap.getOrDefault("a", 6)); // varsa getir yoksa default olarak 6 ata. a nın değer
         //var ve 3 olduğu için onu getirdi
        System.out.println(ornekMap.getOrDefault("m", 8)); //m olmadığından 8 getirdi. bu map'de değişiklik yapmaz.
        System.out.println(ornekMap);//{a=3, b=2, c=2, d=10}

    }
}
