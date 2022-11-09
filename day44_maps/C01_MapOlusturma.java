package day44_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturma {
    public static void main(String[] args) {
        /*
        bir lisedeki öğrenci bilgilerini tutacak bir map oluşturalım.
        öğrenci numarası key; isim, soyisim,sınıf,şube, alan bilgileri value içerisinde yer alsın.
        örneğin; key:101
        value: "Ali, Can, 10, H, MF"

        Bir map oluşturulurken öncelikle key ve value'nun data türlerine karar verilir.
        Value birden fazla bilgi verilerek oluşturulmuşsa:
        1- buradaki bilgilerin sırası
        2- bilgiler arasında kullanılacak ayraç standart olmalıdır.

         */
        Map<Integer,String> ogrenciMap= new HashMap<>(); // burada integer key, string ise value'dur.
        ogrenciMap.put(101,"Ali- Can-10-H-MF"); // map2de add yok. onun yerine put var.
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        System.out.println(ogrenciMap);
        // {101=Ali- Can-10-H-MF, 102=Veli-Cem-11-M-Soz}
        // standart giriş açısından map'de herşeyi method ile yapmakta fayda vardır.
    }
}
