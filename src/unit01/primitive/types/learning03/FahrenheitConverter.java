package unit01.primitive.types.learning03;

public class FahrenheitConverter {
    public static void main(String[] args) {
//        °C = (°F - 32) × 5/9
        //starting temp in F double because can vary
        double tempF = 78.0;
        //new double for conversion equation F to C
        double tempC  = (tempF - 32) * 5 / 9;
        //display to console with converted value
        System.out.print("The converted Celsius degree is " + tempC);
    }
}
