package day40_abstractClasses;

public class FCicekEkmek extends CAbstractEkmek{

    @Override
    public void un() {
        System.out.println("beyaz un kullanılır");
    }

    @Override
    public void maya() {
        System.out.println("maya kullanılır");
    }

    @Override
    public void bicim() {
        System.out.println("ekmek çiçek şeklinde olur");
    }

    @Override
    public void gramaj() {
        System.out.println("350 gramdır");
    }

    @Override
    public void tuz() {
        System.out.println("çiçek ekmekte binde bir tuz kullanılır");
    }
}
