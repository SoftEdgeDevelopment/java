package unit07.arraylist.learning30.splitjoinmethods;

//method to parse to do math with Strings

public class ParseIntMethod {
    public static void main(String[] args) {
        String numberString1 = "34";
        String numberString2 = "35";
        //will display the numbers as a string
        System.out.println(numberString1+numberString2);
        //parse for int to do math with Strings
        int num1 = Integer.parseInt(numberString1);
        int num2 = Integer.parseInt(numberString2);
        //will add the numbers and display the sum
        System.out.println(num1+num2);
    }
}
