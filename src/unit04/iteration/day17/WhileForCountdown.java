package unit04.iteration.day17;

public class WhileForCountdown {
    public static void main(String[] args) {
        for (int i = 10; i >=0 ; i--) {
            System.out.println("counting down " + i);
        }

        int counter = 10;
        while(counter>=0){
            System.out.println("counting down " + counter);
            counter--;
        }
        /*
        Write two countdown programs counting from 10 to 0
        one with a while loop
        and the other one with a for loop.
        * */
    }
}
