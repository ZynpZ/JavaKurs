 package day40_abstractClasses;

public class DChildOfAbstractEkmek extends CAbstractEkmek {// parent classdaki abstract methodlarını
    // burada oluşturmak zorundasın. abstract olmayanlar zorunlu değil

    @Override
    public void un() {
        System.out.println("cevizli ekmek kepekli undan yapılır");
    }

    @Override
    public void maya() {
        System.out.println("cevizli ekmekte binde iki oranında maya kullanılır");
    }

    @Override
    public void bicim() {
        System.out.println("cevizli ekmek somun şekkinde olur");
    }

    @Override
    public void gramaj() {
        System.out.println("cevizli ekmek 650 gr'dır");
    }
}
