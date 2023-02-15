package unit03.conditionals.day14;

public class ShortCircuitExample {
    public static void main(String[] args) {
//        numberOfSlices / numberOfPeople >=2 you have enough pizza
//                else you don't' have enough pizza
        int numOfSlices = 10;
        int numOfPeople = 0;

        if (numOfPeople != 0 && numOfSlices / numOfPeople >= 2.0) {
            System.out.println("You have enough pizza");
        } else {
            System.out.println("Not enough pizza for everyone");
        }

    }
}
