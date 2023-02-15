package unit01.primitive.types.day03;

public class FahrenheitConverter {
    public static void main(String[] args) {
//        °C = (°F - 32) × 5/9
        double tempF = 78;

        double convertedValue;

        convertedValue = (tempF - 32) * 5 / 9;

        System.out.print("The converted Celsius degree is ");
        System.out.println(convertedValue);
    }
}
