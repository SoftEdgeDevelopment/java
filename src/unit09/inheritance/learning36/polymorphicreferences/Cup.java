package unit09.inheritance.learning36.polymorphicreferences;


//create superclasses and subclasses, use polymorphic reference and check instanceof to see if true or false
class CupMain {
    public static void main(String[] args) {
        Cup cup = new Cup();
        CoffeeCup coffeeCup = new CoffeeCup();
        TurkishCoffeeCup turkishCoffeeCup = new TurkishCoffeeCup();
        MorocconCoffeeCup morocconCoffeeCup = new MorocconCoffeeCup();
        //--------------------------------------------
        //polymorphic reference
        CoffeeCup coffeeCup1 = new TurkishCoffeeCup();
        CoffeeCup coffeeCup2 = new MorocconCoffeeCup();
        Cup cup1 = new TurkishCoffeeCup();
        Cup cup2 = new CoffeeCup();
        //will not work because you cannot create a subclass object from a superclass
        //can only create a superclass object from subclasses
        //MorocconCoffeeCup turkishCoffeeCup1 = new Cup();

        //check instanceof to see if true or false
        System.out.println(coffeeCup1 instanceof Cup);
        System.out.println(coffeeCup2 instanceof Cup);
        System.out.println(cup1 instanceof Cup);
        System.out.println(cup2 instanceof Cup);
        System.out.println(cup1 instanceof TurkishCoffeeCup);
        System.out.println(cup1 instanceof MorocconCoffeeCup);
        System.out.println(coffeeCup2 instanceof MorocconCoffeeCup);
        System.out.println(coffeeCup1 instanceof MorocconCoffeeCup);
    }

}

public class Cup {
}

class CoffeeCup extends Cup{

}

class TurkishCoffeeCup extends CoffeeCup{

}

class MorocconCoffeeCup extends CoffeeCup{

}
