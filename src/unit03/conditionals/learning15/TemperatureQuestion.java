package unit03.conditionals.learning15;
//write if, else if, else to display different status of the temperature
public class TemperatureQuestion {
    public static void main(String[] args) {
        //new variable for temperature
        int temperature = 40;
        //if temp is greater than or equal to 76
        if (temperature >= 76) {
            //display it is hot
            System.out.println("It is hot outside.");
            //else if temperature is greater than 60 and less than 76
        } else if (temperature >= 61 && temperature <= 75) {
            //display it is warm
            System.out.println("The weather is warm and nice.");
            //else if the temperature is greater than 40 and less than 61
        } else if (temperature >= 41 && temperature <= 60) {
            //display it is chilly
            System.out.println("It is a little chilly outside.");
            //else if the temperature is greater than 31 and less than 41
        } else if (temperature >= 32 && temperature <= 40) {
            //display it is cold
            System.out.println("it is cold");
            //else the temperature is less than 32
        } else {
            //display it is freezing
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
