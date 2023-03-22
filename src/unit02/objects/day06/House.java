package unit02.objects.day06;
//new class created for house
public class House
{
    //new private variables for the color and address
    private String color;
    private String address;

    //generate constructor
    //public initialize the class with new variables
    public House(String theColor, String theAddress){
        //new variables will be assigned to privates
        color = theColor;
        address = theAddress;
        System.out.println("a new house object is created");
    }
}
