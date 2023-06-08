package unit04.iteration.learning16;
//while loop for a counter to display the total of amount of numbers
public class SumOfFirstFiveNumbers {
    public static void main(String[] args) {
        //create a total outside starting value from 0
        int total = 0;
        //new variable for the counter starting from 1
        int counter = 1;
        while (counter <= 5){
            //total = total + counter (0+1)(1+2)(3+3)(6+4)(10+5)
            total += counter;
            //counter goes up while counter is less than or equal to 5
            counter++;
            //print the total
            System.out.println(total);
        }


    }
}
