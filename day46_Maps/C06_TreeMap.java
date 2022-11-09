package day46_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> ornekMap=new TreeMap<>();

        ornekMap.put("a",3);
        ornekMap.put("r",1);
        ornekMap.put("k",2);
        ornekMap.put("b",5);
        System.out.println(ornekMap); // {a=3, b=5, k=2, r=1} key'leri doğal sıralı yapar.

        System.out.println(ornekMap.ceilingEntry("b"));//b=5 b olduğu için onu getirdi
        System.out.println(ornekMap.ceilingEntry("c"));//k=2 c olmadığı için sıralamada nerede olabilecekse ondan sonrakini getirir
        System.out.println(ornekMap.ceilingEntry("m"));//r=1 r olmadığı için sıralamada nerede olabilecekse ondan sonrakini getirir
        System.out.println(ornekMap.ceilingEntry("t"));//null t yok. olsaydı r'den sonra gelecekti. ve ondan sonra da bişey olmadığından null oldu

        System.out.println(ornekMap.ceilingKey("b"));//b
        System.out.println(ornekMap.ceilingKey("c")); //k

        System.out.println(ornekMap.firstKey()); //a
        System.out.println(ornekMap.firstEntry()); //a=3

        System.out.println(ornekMap.lastKey()); //r
        System.out.println(ornekMap.lastEntry());//r=1

        System.out.println(ornekMap.pollFirstEntry());//a=3 silip getirdi
        ornekMap.pollLastEntry();//r=1 silip getirdi
        System.out.println(ornekMap); //{b=5, k=2}

        System.out.println(ornekMap.descendingMap());//{k=2, b=5} burada yer değiştirme işlemi yapar.
        // ancak tree map olduğu için sonra yazdırdığımızda yine doğal sıralı yapar.
        System.out.println(ornekMap);

        System.out.println(ornekMap.floorEntry("b"));//b=5
        System.out.println(ornekMap.floorKey("d")); //b ceiling bulamayınca sonrakini getiriyordu.
        // bu da bulamayınca öncekini getiriyor
        System.out.println(ornekMap.floorKey("k")); //k
        System.out.println(ornekMap); //{b=5, k=2}

        ornekMap.put("y",3);
        ornekMap.put("t",2);
        System.out.println(ornekMap);//{b=5, k=2, t=2, y=3}

        System.out.println(ornekMap.headMap("m")); //m ye kadar olanları yazdı {b=5, k=2}
        System.out.println(ornekMap.headMap("t"));//{b=5, k=2} t yi dahil etmedi.
        System.out.println(ornekMap.headMap("t",true));//{b=5, k=2, t=2} t yi dahil etti.

        System.out.println(ornekMap.higherKey("k")); //k dan bir sonraki key i yazdırır
        System.out.println(ornekMap.higherEntry("t")); //y=3 t'den yüksek entry'i yazdırdı.

        System.out.println(ornekMap.lowerEntry("m")); //k=2 m'den öncekini yazdırdı
        System.out.println(ornekMap.lowerKey("c")); //b c'den önce olabilecek olanı yazdırdı.
    }
}
