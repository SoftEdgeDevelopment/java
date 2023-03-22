package unit02.objects.day06;
//new class for main
public class HouseMain {
    public static void main(String[] args) {
        //create new objects assigned to house class and assign new parameters to private variables
        House house1 = new House("Red", "1234 South Barry Road");
        House house2 = new House("Blue", "837th ST SE 318th Place");
        House house3 = new House("Black","84th NW Road Drive");
        House house4 = new House("Green", "Park Lake Ave");

        System.out.println("End of Main");
    }
}
