package unit04.iteration.day16;
//while loop with break to write a message a certain amount of times and display when the loop is broken
public class WriteHelloThreeTimesUsingBreak {
    public static void main(String[] args) {
        //new variable that is being controlled in the while loop
        int controlNumber=1;
        //while whatever is inside this loop is true
        while(true){
            //if the controlled number is greater than or equal to 4
            if(controlNumber>=4){
                //the loop breaks and ends
                break;
            }
            //displays this message in a loop
            System.out.println("Hello");
            //every loop the control number goes up by 1
            controlNumber++;
        }
        //this is printed after the While loop finishs
        System.out.println("While is broken.");
    }
}
