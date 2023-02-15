package unit03.conditionals.day12;

public class Zumba {
    private int steps;

    public Zumba(int steps) {
        this.steps = steps;
    }

    public boolean checkGoalReached(){
        if(steps >= 10000){
            System.out.println("Congrats!");
            return true;
        }
        return false;
    }
}
