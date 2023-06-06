package unit01.primitive.types.learning02;

public class InitializeVariables {

    //create variables, assign values and print variable to console
    public static void main(String[] args) {
        //new int variable currentYear must be whole number
        int currentYear;
        //assign value for variable
        currentYear = 2022;
        //print the value assigned as currentYear to console
        System.out.println(currentYear);

        //new double variable myGpa can be whole or decimal number
        double myGpa;
        //assign value for variable
        myGpa = 3.9;
        //print the value assigned as myGpa to console
        System.out.println(myGpa);

        //new boolean variable gameOver must be true or false
        boolean gameOver;
        //assign value for variable
        gameOver = false;
        //print the value assigned as gameOver to console
        System.out.println(gameOver);

        //new char variable correctAnswer must be a single character letter = 'C'
        char correctAnswer = 'C';
        //print the value assigned as correctAnswer to console
        System.out.println(correctAnswer);

        //currentYear reassigned value to 2023
        currentYear = 2023;
        //print new value of currentYear to console
        System.out.println(currentYear);

        //final means that the value cannot be changed
        final int DAYS_OF_THE_WEEK;
        //this value 1000 will never be changed even when initialized later
        DAYS_OF_THE_WEEK = 1000;
        //will print the value of DAY_OF_THE_WEEK
        System.out.println(DAYS_OF_THE_WEEK);

        //final double value of PI will never change - value set to 3.14
        final double PI = 3.14;

        //DAYS_OF_THE_WEEK = 10002; this value can never be changed

        //new String variable fullName with "John Doe" assigned
        String fullName = "John Doe";
        //print value of fullName to console
        System.out.println(fullName);

    }
}
