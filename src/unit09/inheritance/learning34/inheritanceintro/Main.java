package unit09.inheritance.learning34.inheritanceintro;

public class Main {
    public static void main(String[] args) {
        //create new athlete object from the Athlete class
        Athlete athlete1 = new Athlete();
        //call to the other methods from the other classes to get info
        System.out.println(athlete1.getName());
        athlete1.practice();
        //athlete1 is not a swimmer so it cannot use dive method()
        //athlete1.dive();

        //create new swimmer object from the Swimmer class
        Swimmer swimmer1 = new Swimmer();
        //call to the other methods from the other classes to get info
        System.out.println(swimmer1.getName());
        System.out.println(swimmer1.getBirthYear());
        swimmer1.practice();
        swimmer1.dive();

        //call to the getter method from Swimmer to getSwimStyle
        System.out.println(swimmer1.getSwimStyle());

    }
}
