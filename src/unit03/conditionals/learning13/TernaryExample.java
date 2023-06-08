package unit03.conditionals.learning13;

public class TernaryExample {
    public static void main(String[] args) {
        //ternary operator is an easy way to write if else statement on a single line
        //int variable for age
        int age = 19;
        //new string variable for message
        String message;
        //checks if age is greater than or equal to 18 ?   if true - runs first String, if false - runs second String
        message = age >= 18 ? "You can join the party." : "You are not allowed";
        System.out.println(message);


    }
}
