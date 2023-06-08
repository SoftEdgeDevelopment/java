package unit03.conditionals.learning13;

public class ClassStart {
    public static void main(String[] args) {
        /*
        * If there are 50 or more students class starts
        * else you talk about world cup
        * */
        //new int for number of students
        int students = 75;
        //if 50 or more students
        if (students >= 50){
            //class starts
            System.out.println("Class has started");
        }
        //else less than 50
        else{
            //talk about sports
            System.out.println("Lets talk about the world cup!");
        }
    }
}
