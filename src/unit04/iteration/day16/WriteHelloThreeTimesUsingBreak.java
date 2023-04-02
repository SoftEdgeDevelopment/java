package unit04.iteration.day16;

public class WriteHelloThreeTimesUsingBreak {
    public static void main(String[] args) {
        //new variable that is being controlled in the while loop
        int controlNumber=1;
        //while whatever is inside this loop is true
        while(true){
            //if the controlled number is greaterthan or equal to 4
            if(controlNumber>=4){
                break;
            }
            System.out.println("Hello");
            controlNumber++;
        }
        System.out.println("While is broken.");
    }
}
