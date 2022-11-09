package day38_exceptions;

public class C06_Exceptions {
    public static void main(String[] args) {

        //NumberFormatException - eğer string sadece sayıdan oluşsaydı işlem yapılırdı ama
        // aşağıdaki gibi olursa (yani sayı dışında bir karakter de varsa) ve parseInt () kullanılırsa bu exceptionu fırlatır
        String str="56a";
        // bunu 3 artır

        //System.out.println(Integer.parseInt(str)+3); // parsInt sayıdan oluşan bir stringi int' çevirir

        //5 - ClassCastException - uygun olmayan cast işlemlerinde ortaya çıkar.
        String a="Java";
        //Integer b=a; farklı data türlerindeki variable'lar birbirine atanamaz
        Object b=a; //  object class String'in parent classı olduğundan kabul eder

        Integer c=(Integer) b; // object class Integer'ın da parentı olduğundan kabul eder.
        System.out.println(c); //ancak bunu yazdırdığımızda java exceptions fırlatır.

    }
}
