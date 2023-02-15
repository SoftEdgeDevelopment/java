package unit02.objects.day07;

public class House {
    //    class variables
    private String color;
    private String address;

    //    constructor
    public House(String color, String address) {
        this.color = color;
        this.address = address;
    }

    //    method to change the color
    public void colorChange(String newColor) {
        color = newColor;
        System.out.print("Your house is painted to ");
        System.out.println(color);
    }
}
