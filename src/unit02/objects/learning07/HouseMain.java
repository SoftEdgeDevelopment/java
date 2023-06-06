package unit02.objects.learning07;
//new class for main method
public class HouseMain {
    public static void main(String[] args) {
        //create objects from house class constructor and assign parameters
        House house1 = new House("Blue","1st Ave");
        House house2 = new House("Green", "11th Street");
        //initialize colorChange method for each object created
        house1.colorChange("Yellow");
        house2.colorChange("Red");
    }
}
