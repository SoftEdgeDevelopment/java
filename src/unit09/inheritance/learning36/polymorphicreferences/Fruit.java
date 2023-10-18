package unit09.inheritance.learning36.polymorphicreferences;

//main method

//polymorphic reference example
class FruitMain {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit(1.7,32);
        Apple apple1 = new Apple(2.3,12,"Red");
        Grape grape1 = new Grape(6,7,19);
        RedGrape redGrape1 = new RedGrape(1.4,15,15,10);
        YellowGrape yellowGrape1 = new YellowGrape(1.5,12,12,"Friday");
        //---------------------------------------
        //polymorphic reference
        //fruit objects from each subclass
        Fruit fruit2 = new Fruit(1.3,12);
        Fruit fruit3 = new Apple(1,5,"Red");
        Fruit fruit4 = new Grape(1,12,15);
        Fruit fruit5 = new RedGrape(1,23,54,10);
        Fruit fruit6 = new YellowGrape(1,7,4,"Friday");
        //grape object from subclass yellowGrape
        Grape fruit7 = new YellowGrape(1,5,7,"Monday");

        //this will not work because Apple is subclass of Fruit
        //Apple polymorphicApple = new Fruit();

        //instanceof returns true or false to check if an object is part of a class
        System.out.println(fruit1 instanceof Grape);
        System.out.println(fruit2 instanceof Grape);
        System.out.println(fruit3 instanceof Grape);
        System.out.println(fruit7 instanceof Grape);
        System.out.println(apple1 instanceof Fruit);
        System.out.println(grape1 instanceof YellowGrape);
        System.out.println(redGrape1 instanceof Fruit);
        System.out.println(yellowGrape1 instanceof Grape);

    }
}

//superclass
public class Fruit {
    double size;
    int amount;

    //constructor
    public Fruit(double size, int amount) {
        this.size = size;
        this.amount = amount;
    }

    //getters and setters
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "size=" + size +
                ", amount=" + amount +
                '}';
    }
}

//--------------------------------------
//subclass of fruit superclass
class Apple extends Fruit {
    private String color;

    //super() constructor generated from Fruit
    public Apple(double size, int amount, String color) {
        super(size, amount);
        this.color = color;
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                '}';
    }
}

//---------------------------------------
//subclass extents fruit superclass
class Grape extends Fruit {
    int count;

    //super() constructor from Fruit
    public Grape(double size, int amount, int count) {
        super(size, amount);
        this.count = count;
    }

    //getters and setters
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Grape{" +
                "count=" + count +
                '}';
    }
}

//--------------------------------------
//subclass of grape superclass
class RedGrape extends Grape {
    private int howMuchDoYouLikeOutOfOneToTen;

    //super() constructor from Grape class
    public RedGrape(double size, int amount, int count, int howMuchDoYouLikeOutOfOneToTen) {
        super(size, amount, count);
        this.howMuchDoYouLikeOutOfOneToTen = howMuchDoYouLikeOutOfOneToTen;
    }

    //getters and setters
    public int getHowMuchDoYouLikeOutOfOneToTen() {
        return howMuchDoYouLikeOutOfOneToTen;
    }

    public void setHowMuchDoYouLikeOutOfOneToTen(int howMuchDoYouLikeOutOfOneToTen) {
        this.howMuchDoYouLikeOutOfOneToTen = howMuchDoYouLikeOutOfOneToTen;
    }

    @Override
    public String toString() {
        return "RedGrape{" +
                "howMuchDoYouLikeOutOfOneToTen=" + howMuchDoYouLikeOutOfOneToTen +
                '}';
    }
}

//--------------------------------------
//subclass of grape superclass
class YellowGrape extends Grape{
    private String whatIsTheBestDayToEatGrapes;

    //super() constructor from Grape class
    public YellowGrape(double size, int amount, int count, String whatIsTheBestDayToEatGrapes) {
        super(size, amount, count);
        this.whatIsTheBestDayToEatGrapes = whatIsTheBestDayToEatGrapes;
    }

    //getters and setters
    public String getWhatIsTheBestDayToEatGrapes() {
        return whatIsTheBestDayToEatGrapes;
    }

    public void setWhatIsTheBestDayToEatGrapes(String whatIsTheBestDayToEatGrapes) {
        this.whatIsTheBestDayToEatGrapes = whatIsTheBestDayToEatGrapes;
    }

    @Override
    public String toString() {
        return "YellowGrape{" +
                "whatIsTheBestDayToEatGrapes='" + whatIsTheBestDayToEatGrapes + '\'' +
                '}';
    }
}