package unit03.conditionals.day12;

public class ZumbaMain {
    public static void main(String[] args) {
        Zumba today = new Zumba(9000);
        boolean reachedGoal = today.checkGoalReached();
        System.out.println("Reached Goal: " + reachedGoal);
    }
}
