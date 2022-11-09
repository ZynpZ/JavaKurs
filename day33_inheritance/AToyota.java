package day33_inheritance;

public class AToyota {

    AToyota() {
        //burada extends olmadığı için super cons. yoktur.
        System.out.println("Toyota cons");
    }
    String marka="Toyota";
    String uretimYeri="belirtilmemiş";
}
