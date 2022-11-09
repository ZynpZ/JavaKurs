package day32_encapsulation_inheritance;

public class C02_encapsulation {
    public static void main(String[] args) {
        C01 obj= new C01();
        System.out.println(obj.getYas()); //0

        obj.setYas(-20);

        System.out.println(obj.getYas()); //-20
        /*
        biz bir objeye değer atamasını kontrol edemeyiz. kullanıcı kaç atarsa java onu yazar.
        encapsulation'ın faydalarından biri de bu değer atamasını getter veya setter methodlarında kontrol edebilmektir.
         */

        System.out.println(C01.getHastaneAdi()); // Yıldız Hastanesi
        // C01.HastaneAdı="Gıcık Hastane";
        // C01 classında hastane adını private yaptık ve getter oluşturduk. (private yapmadan encapsulation kullanılmaz.)
        // böylece artık hastane adına atama yapılamaz.
        // yani obj oluşturmadan class adıyla çağırabiliyoruz. ama değiştirme yapılamaz. b

        System.out.println(C01.getHastaneAdi());
    }
}
