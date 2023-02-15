package unit04.iteration.day16;

public class AddEvenNumbers {
    public static void main(String[] args) {
        int total = 0;
        int counter = 2;

        while (counter <= 10) {
            total = total + counter;
            counter = counter + 2;
        }

        System.out.println("The total is " + total);
    }
}
