package day41_interfaces;

public interface I01_InterfacesEkmek {
    /*
    interface'ler tam abstraction sağlar. içinde concrete method bulunmaz
    interface'ler concrete child class'lar şçşn blueprint(şablon) özelliği taşır

    interface'in class'a göre çok büyük bir avantajı vardır. java'da bir class yalnızca bir parent edinebilir.
    eğer birden fazla classı parent edinmek istersek hiyerarşi ile parent zinciri oluştururuz

    Ancak interfac'de durum farklıdır.
    bir class istediği kadar interface'i implement edebilir.

    Bir classı bir interface'e child yapmak için extends değil implemens yapmak lazım (class adına extends yerine yani)

    istenirse interface de başka bir interface'i parent edinebilir
    bu durumda interface'ler arasına extends keyword kullanılır.

    bir class'a hem başka bir classa extends ile child olup hem de istediği kadar interface'i implement edebilir.

    interface'lerde yalnızca public ve abstract methodlar bulunur.

    interface'lerde variable'larda variable'lar da public, static, ve final'dir.

    variable'lar final olduğu için sonradan değeri değiştirilemez oluşturulurken değer ataması yapılması zorunludur.

    birden fazla interface'i implement eden bir class tüm interface'lerdeki variable'lara ulaşabilir.eğer aynı isimde
    bir variable birden fazla parent interface'da varsa Java static yolu kullanarak interfaceAdı.variable ile
    karışıklığın önüne geçer.

    Eğer farklı iki interface'de aynı isimde method varsa bir kere override edilmesi yeterlidir.

    ancak farklı interface'lerdeki methodların return type'ları farklıysa, ikisi de kendi return type'nı isteyecektir.
    birini yapsak diğeri kabul etmez ve hata verir. bunun çözümü yoktur.
    ancak bu methodların return type eşitlenerek sorun giderilebilir.
     */

    public abstract void un(); // olması zorunlu olanlar abstract yapılır

    public abstract void maya();

    public abstract void bicim();

    public abstract void gramaj();
}
