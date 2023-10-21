package unit09.inheritance.learning38.polymorphism;

public class Main {
    public static void main(String[] args) {
        //create an Athlete object as subclass HockeyPlayer
        Athlete athlete1 = new HockeyPlayer("Jim Jones");
        athlete1.practice();
        //can not call to these methods
        //athlete1.shoot();
        //athlete1.pass();
        Athlete athlete2 = new Swimmer("Mike Mars");

        //these methods will not work
        //athlete2.swim();
        //athlete2.shoot();
        //athlete2.pass();

        if (athlete2 instanceof Swimmer) {
            ((Swimmer) athlete2).swim();
        }
    }
}
