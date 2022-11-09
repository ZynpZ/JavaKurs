package day34_inheritance_dataTypeKullanımı;

public class CDizelCorolla extends BCorolla {

    String yakit="Dizel";
    String motor="1.4 dizel motor";
    String renk="Tanımlanmadı";

    public static void main(String[] args) {
        CDizelCorolla arb1=new CDizelCorolla();
        System.out.println(arb1.motor); // C 1.4 dizel motor"
        System.out.println(arb1.renk); // C "Tanımlanmadı"
        System.out.println(arb1.yakit); // C "Dizel"
        System.out.println(arb1.uretimYeri); // B Türkiye
        System.out.println(arb1.marka); // A Toyota


        BCorolla corolla=new BCorolla();
        BCorolla arb2=new CDizelCorolla(); //  -burada dizelcorolla üretildi ama variable'lar BCorolla'dan alınacak.
        System.out.println(arb2.yakit); //B Tanımlanmadı
        System.out.println(arb2.renk); // B belirtilmedi
        //arb2.motor -data türü olarak seçilen BCorolla classında motor variable'ı olmadığından CTE verir.
        System.out.println(arb2.uretimYeri); //B Türkiye
        System.out.println(arb2.marka); // A Toyota

        AToyota arb3=new CDizelCorolla();
        //arb3.motor A classında motor olmadığından CTE verir
        //arb3.renk A classında motor olmadığından CTE verir
        //arb3.yakit A classında motor olmadığından CTE verir.
        System.out.println(arb3.uretimYeri); // A Değer Atanmadı
        System.out.println(arb3.marka); // A Toyota

        /*
        Bir child class'da obje oluşturulurken data türü olarak parent class'lar seçilebilir.
        bu durumda obje child class'ın objesi olmakla birlikte
        özellikleri data türü olarak seçilen parent class'a ait olacaktır.

        Bir obje oluşturulurken data türü cons.'dan farklı ise
        o objeye ait variable değerlerinin ne olduğunu bulmak için ilk bakılacak scope
        data türü olarak seçilen parent class olmalıdır.

        Eğer data türü olarak atanan class'da varibale yoksa parent classlara bakılır.

        Eğer aranan variable data türü olarak seçilen class ve onun parentlerinde yoksa CTE verir.

        böyle bir obje oluşturmanın temel amacı cons olarak seçilen class ve onun parentlarındaki özellikleri kullanmaktır.
        yani variable'ların değeri için önemli olan cons. değil data türüdür.
         */

        /*
        18. satırda oluşturulan obje inheritance ile ilgisi yoktur.
        data türü ve cons. aynı olduğundann standart bir obje oluşturulmuştur.
        ve bu objenin tüm özellikleri BCorolla classından alınır.

        19. satırda ise dizel bir corolla üretilir ancak
        bu dizel corolla'nın Corolla olarak özelliklerini görmek istiyoruz.
         */
    }

}
