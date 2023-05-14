package javaprojects.project02;

public class Assignment08 {
    //analyze the following code and guess the output pt.7
    public static void main(String[] args) {
        //int number1 = 2147483647; //this is the highest value of integer
        int number1 = Integer.MAX_VALUE;  //this will create an integer with the highest value possible
        System.out.println(number1); //prints number1 (int max value)
        number1++; //integer value cannot add past highest possible number (2147483647)
        System.out.println(number1); //count will restart at integer lowest value (-2147483648)
        number1++; //count will add up from lowest value
        System.out.println(number1); //will print and add up (-2147483646)
        number1--;
        number1--;
        System.out.println(number1);//will print back out int max value
        number1++;
        System.out.println(number1);//will print back out int min value
    }
}