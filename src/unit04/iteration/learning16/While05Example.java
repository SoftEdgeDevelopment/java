package unit04.iteration.learning16;
//while loop display a message with a counter until it reaches a certain amount

public class While05Example {
    public static void main(String[] args) {
//        print numbers from 0 to 5 using while loop.
        //new controlled variable starting at 0 for the counter
        int counter = 0;
        //while the counter is less than or equal to 5
        while(counter <= 5){
            //display the counter
            System.out.println(counter);
            //add the value of the counter by 1
            counter++;
        }
    }
}
