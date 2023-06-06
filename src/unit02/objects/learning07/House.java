package unit02.objects.learning07;

public class House {
    //new private variables for color and address of house
    private String color;
    private String address;

    //generate constructor to assign new parameters
    public House(String color, String address) {
        //assign new parameters to private variables
        this.color = color;
        this.address = address;
    }

    //method to change the color with 1 parameter for newColor
    public void colorChange(String newColor) {
        //display original color of the house
        System.out.println("The houses color is " + color);
        //assign new parameter to change the color to newColor
        color = newColor;
        //display which color it was changed to
        System.out.println("The house is painted to " + color);
        System.out.println("-------");
    }
}
