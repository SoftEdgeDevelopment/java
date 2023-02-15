package unit03.conditionals.day13;

public class PositiveNegative {
    public static void main(String[] args) {
//        declare an int and assign a number
//        check if it is positive and print positive
//        check if it is negative and print negative
//        else print 0
//        int someNumber = new Scanner(System.in).nextInt();

        int someNumber = -1;

        if (someNumber > 0) {
            System.out.println(someNumber + " is positive");
        } else if (someNumber < 0) {
            System.out.println(someNumber + " is negative");
        } else {
            System.out.println(someNumber + " is zero");
        }

        if(someNumber<0){
            System.out.println("You entered a negative number");
        }
    }
}
