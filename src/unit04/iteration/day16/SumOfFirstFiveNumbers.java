package unit04.iteration.day16;

public class SumOfFirstFiveNumbers {
    public static void main(String[] args) {

        int total = 0;
        int counter=1;
        while(counter<=5){

            total = total + counter;
            counter++;
        }

        System.out.println("The total is " + total );
    }
}
