package practice;

public class Practice16 {
    //Write a program to simulate a random coin toss 10 times and display the results every time
    //each time the coin is tossed it should display HEADS or TAILS
    //program should keep track of how many each was displayed at the end
    public static void main(String[] args) {
        //create new random number between 1 and 2
        //cast as int
        //store random number inside the loop to generate a new random number each time the code runs, otherwise it will run 1 random number 10 times instead of 10 random numbers
        //int randomNumber = (int)(Math.random()*2)+1;
        //new variable for the result of heads or tails, starting at null or empty string ""
        String tossResult = "";
        //new ints to count the amount of heads and tails starting at 0
        int countHeads = 0;
        int countTails = 0;
        //for loop to make the code run 10 times
        for(int i = 0; i < 11; i++) {
            //create new random number between 1 and 2
            //cast as int
            int randomNumber = (int)(Math.random()*2)+1;
            //using a switch case for random number
            switch (randomNumber) {
                //if 1 - toss result is heads
                case 1:
                    tossResult = "Heads";
                    //break the switch
                    break;
                //if 2 result is tails
                case 2:
                    tossResult = "Tails";
                    //close the switch with break for ending or nothing at all
                    break;
            }
            //new if else to display count of heads or tails if toss results was 1 or 2
            if (tossResult.equals("Heads")) {
                countHeads++;
            } else {
                countTails++;
            }
        }
        System.out.println("After 10 coin tosses");
        System.out.println("Heads: " + countHeads);
        System.out.println("Tails: " + countTails);
    }
}
