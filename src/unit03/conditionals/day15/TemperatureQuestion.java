package unit03.conditionals.day15;

public class TemperatureQuestion {
    public static void main(String[] args) {
        int temperature = 40;
        if (temperature >= 76) {
            System.out.println("It is hot outside.");
        } else if (temperature >= 61 && temperature <= 75) {
            System.out.println("The weather is warm and nice.");
        } else if (temperature >= 41 && temperature <= 60) {
            System.out.println("It is a little chilly outside.");
        } else if (temperature >= 32 && temperature <= 40) {
            System.out.println("it is cold");
        } else {
            System.out.println("It is freezing outside.");
        }
        /*
        *   31 and below
            "It is freezing outside."
            32–40
            "It is cold."
            41–60
            "It is a little chilly outside."
            61 - 75 and above
            "The weather is warm and nice."
            76 and above
            "It is hot outside."
        * */
    }
}
