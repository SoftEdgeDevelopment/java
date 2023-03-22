package unit02.objects.day06;
//create new class for main
public class CarMain
{
    public static void main(String[] args) {
        //call to Car class and create new object car1 with new parameters
        Car car1 = new Car("Blue",30);
        Car car2 = new Car("White", 1000);
        //create new object calling to the second constructor with 1 parameter
        Car car3 = new Car("Yellow");
        //create new object calling to the third constructor with 0 parameters
        Car car4 = new Car();
        //will print out the stored data location
        System.out.println(car1);
        //call to the carInfo public void to display all cars information
        car1.carInfo();
        car2.carInfo();
        car3.carInfo();
        car4.carInfo();
    }
}
