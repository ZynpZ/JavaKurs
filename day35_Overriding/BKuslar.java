package day35_Overriding;

public class BKuslar extends AHayvanlar{
    String tur= "Kus";
    String isim="Kus isim belirtilmedi";
    String ayak= "Kusların ayakları vardır";

    void kanat () {
        System.out.println("kuslar kanatlıdır");
    }
    void solunum() {
        System.out.println("kuslar akciğerle nefes alır");
    }
    void gaga () {
        System.out.println("kusların gagaları vardır");
    }
    void cogalma () {
        System.out.println("kuslar yumurtayla çoğalır");
    }
}
