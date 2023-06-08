package unit04.iteration.learning17;
/*
        Write two countdown programs counting from 10 to 0
        one with a while loop
        and the other one with a for loop.
        * */
public class WhileForCountdown {
    public static void main(String[] args) {
        //example of for loop to make a countdown from 10
        //starting from 10, until 0, countdown by 1
        for (int i = 10; i >=0 ; i--) {
            //display counting down and the number
            System.out.println("counting down " + i);
        }

        //example of while loop to make a countdown from 10
        //new int variable for counter
        int counter = 10;
        //while counter is greater than or equal to zero
        while(counter>=0){
            //display the count
            System.out.println("counting down " + counter);
            //count down
            counter--;
        }

    }
}
