package unit02.objects.day07;

public class Car {
    private String color;
    private double mileage;

    public Car(String color, double mileage) {
        this.color = color;
        this.mileage = mileage;
    }

    public void drive(){
        mileage += 15;
//     note for you: mileage = mileage + 15;
        System.out.println("You drove 15 miles");
        System.out.print("The updated mileage is ");
        System.out.println(mileage);
    }

    public void drive(int drivenMiles){
        mileage = mileage + drivenMiles;
        System.out.print("The updated mileage is ");
        System.out.println(mileage);
    }


}
