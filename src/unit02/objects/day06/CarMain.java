package unit02.objects.day06;
//create new class for main
public class CarMain
{
    public static void main(String[] args) {
        //call to Car class and create new object car1 with new parameters
        Car car1 = new Car("Blue",30);
        Car car2 = new Car("White", 1000);
        System.out.println(car1);
    }
}
