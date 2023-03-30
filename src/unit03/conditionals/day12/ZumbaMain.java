package unit03.conditionals.day12;
//main method generate constructor call to different class to get boolean method and display true or false if goal was reached
public class ZumbaMain {
    public static void main(String[] args) {
        //new object created calling from zumba class with steps parameter assigned
        Zumba today = new Zumba(9000);
        //new boolean method true or false to check if goal was reached calling from checkGoalReached method
        boolean reachedGoal = today.checkGoalReached();
        //display true or false if the goal was reached
        System.out.println("Reached Goal: " + reachedGoal);
    }
}
