package unit03.conditionals.day12;
//new class for zumba workout
public class Zumba {
    //new private variable for steps taken
    private int steps;
    //generate constructor for private variable steps
    public Zumba(int steps) {
        //assign new value to steps
        this.steps = steps;
    }

    //new public boolean to check if the goal was reached true or false
    public boolean checkGoalReached(){
        //if more than or equal to 10000 steps
        if(steps >= 10000){
            //display congrats if true
            System.out.println("Congrats!");
            //return congrats and true to checkGoalReached
            return true;
        }
        //if less than 10000, return false to checkGoalReached
        return false;
    }
}
