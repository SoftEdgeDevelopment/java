package unit04.iteration.learning16;
//how a while loop works
public class WhileLoopExample {
    public static void main(String[] args) {
        //new variable for starting number countdown
        int countdown = 10;
        //while countdown is greater than or equal to 10
        while(countdown>=0){
            //display the value of countdown while it is greater than or equal to 0
            System.out.print(countdown + " ");
            // print it down on a list
            // System.out.println(countdown);
            //value of countdown - 1 until it is equal to 0
            countdown--;
        }
    }
}
