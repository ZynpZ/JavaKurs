package day35_Overriding;

public class CKumesKusları extends BKuslar {

    String tur="Kumes Kusu";
    String isim="Kumes kusu İsim belirtilmedi";
    String yasamYeri="Kumes kusları kumeste yasar";

    void hareket (){
        System.out.println("Kumes hayvanları yürür");
    }
    void beslenme () {
        System.out.println("kumes hayvanları et veya ot yerler");
    }

    public static void main(String[] args) {
        CKumesKusları kk1=new CKumesKusları(); // ikiside C classı olduğu için
        // hem methodda hem de variableda doğrudan o clastaki değerler gelir
        System.out.println(kk1.tur);// C kumes kusu
        System.out.println(kk1.isim); // C Kumes kusu İsim belirtilmedi
        System.out.println(kk1.yasamYeri); // Kumes kusları kumeste yasar
        System.out.println(kk1.ayak); // B kusların ayağı vardır
        kk1.hareket(); // C Kumes hayvanları yürür
        kk1.beslenme(); // C kumes hayvanları et veya ot yerler
        kk1.kanat(); // B Kuslar kanatlıdır
        kk1.solunum(); // B kuslar akciğerle nefes alırlar
        kk1.gaga(); // B Kusların gagalari vardır
        kk1.cogalma(); // B kuslar yumurta ile çoğalır
        kk1.omur(); // A hayvalar yasar ve ölür

        BKuslar kk2=new CKumesKusları(); //data türü ve cons farklı olduğundan aramaya data türünden (BKuslar) başlarız
        System.out.println(kk2.tur);// B Kus
        System.out.println(kk2.isim); // B kus İsim belirtilmedi
        //System.out.println(kk2.yasamYeri); // B de olmadığı için CTE verir
        System.out.println(kk2.ayak); // B kusların ayağı vardır
        kk2.hareket(); // C Kumes hayvanları yürür -bu method A classında var ancak method olduğu için son hali lazım
        // overridde edilmiş mi diye kontrol ederiz. C classında yapıldığından güncel değer yazılır
        kk2.beslenme(); // C kumes hayvanları et veya ot yerler -overridde hali yazıldı
        kk2.kanat(); // B Kuslar kanatlıdır
        kk2.solunum(); // B kuslar akciğerle nefes alırlar
        kk2.gaga(); // B Kusların gagalari vardır
        kk2.cogalma(); // B kuslar yumurta ile çoğalır
        kk2.omur(); // A hayvalar yasar ve ölür

        AHayvanlar kk3=new CKumesKusları();
        System.out.println(kk3.tur);// A Hayvan
        System.out.println(kk3.isim); // A Hayvan isim belirtilmedi
        //System.out.println(kk3.yasamYeri); //  bunlar variable olduğundan Hayvanlar classında yoksa CTE verir.
        //System.out.println(kk3.ayak); // CTE
        kk2.hareket(); // C kumes hayvanları yürür
        kk3.beslenme(); // C kumes hayvanları et veya ot yerler -overridde hali yazıldı
        // kk3.kanat(); // CTE A classında bu method yok çünkü. o classda yoksa günceli de yoktur
        kk3.solunum(); // B kuslar akciğerle nefes alırlar
        //kk3.gaga(); // CTE A classında yok çünkü
        kk3.cogalma(); // B kuslar yumurta ile çoğalır
        kk3.omur(); // A hayvalar yasar ve ölür
    }
}
// methodlar dinamiktir. onun için güncel hali yazılır. variableler ise dinamik değildir.
