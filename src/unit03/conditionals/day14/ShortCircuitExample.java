package unit03.conditionals.day14;
//practice using if else statement with && and isNot
public class ShortCircuitExample {
    public static void main(String[] args) {
//        numberOfSlices / numberOfPeople >=2 you have enough pizza
//                else you don't' have enough pizza
        //new variables for number of slices of pizza and number of of people
        int numOfSlices = 10;
        int numOfPeople = 1;

        //if number of people does not equal 0 and number of slices divided by the number of people is greater than 2
        if (numOfPeople != 0 && numOfSlices / numOfPeople >= 2.0) {
            //you have enough
            System.out.println("You have enough pizza");
        } else {
            //else you have too many people or no one is there
            System.out.println("Not enough pizza for everyone");
        }

    }
}
