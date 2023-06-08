package unit03.conditionals.learning11;

public class OneMoreRandom {

    public static void main(String[] args) {
        //new variable for random number
        int randNumber;
        //starting at 0, until 100 times, it will keep running the code
        for (int i = 0; i < 100; i++) {
            //random whole numbers cast as int between 1 and 10
            randNumber = (int)(Math.random()*10)+1;
            //display 100 random numbers
            System.out.println(randNumber);
        }

    }
}
