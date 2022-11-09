package day40_abstractClasses;

import day14_methodCreation.C03_MethodOlusturma;

public class EKepekliEkmek extends CAbstractEkmek{

    @Override
    public void un() {
        System.out.println("kepekli ekmekte yüzde otuz kepek vardır");
    }

    @Override
    public void maya() {
        System.out.println("kepekli ekmekte binde bir maya vardır");
    }

    @Override
    public void bicim() {
        System.out.println("kepekli ekmek farklı şekillerde olabilir");
    }

    @Override
    public void gramaj() {
        System.out.println("kepekli ekmek farklı gramazjlarda olabilir");

    }
    /*public static void main(String[] args) {
    //class'lar kendi objelerini üretmek için oluşturulmuş kalıplardır
        C03_MethodOlusturma obj=new C03_MethodOlusturma();
        AEkmek obj2= new AEkmek();

        //başka classtan oluşturulan objeler kendi classımızın objeleri değildir.
        // sadece o methodlardan yararlanmak için aracı olan objelerdir
        /*
     */

    }



