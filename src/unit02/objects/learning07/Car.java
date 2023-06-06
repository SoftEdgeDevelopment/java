package unit02.objects.learning07;

//create new class for Car
public class Car {
    //private String variable for the cars color
    private String color;
    //private double variable for the number in cars mileage
    private double mileage;

    //generate constructor to get new variables assigned
    public Car(String color, double mileage) {
        //assign new variables from main
        this.color = color;
        this.mileage = mileage;
    }

    //public void created to display drive message
    public void drive(){
        System.out.println("first constructor");
        System.out.println("you started at " + mileage + " miles");
        //mileage will have 15 added to it
        //mileage = mileage + 15;
        mileage += 15;
        System.out.print("after driving, the updated mileage is ");
        //will display the updated mileage after drive
        System.out.println(mileage);
        System.out.println("-----------------------");
    }

    public void drive(int drivenMiles){
        System.out.println("second constructor");
        //same as mileage += drivenMiles;
        mileage = mileage + drivenMiles;
        System.out.println("You drove " + drivenMiles + " miles");
        System.out.print("after driving the updated mileage is ");
        System.out.println(mileage);
        System.out.println("-----------------------");
    }
    //override to string - right click - generate - toString()
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
