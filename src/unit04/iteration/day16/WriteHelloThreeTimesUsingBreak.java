package unit04.iteration.day16;

public class WriteHelloThreeTimesUsingBreak {
    public static void main(String[] args) {
        int controlNumber=1;

        while(true){
            if(controlNumber>=4){
                break;
            }
            System.out.println("Hello");
            controlNumber++;
        }
        System.out.println("While is broken.");
    }
}
