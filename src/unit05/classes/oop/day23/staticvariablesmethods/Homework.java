package unit05.classes.oop.day23.staticvariablesmethods;
//calling static variable to make method to increase count
public class Homework {
    private String subject;
    private int maxPoint;
    //new private static variable
    private static int numOfHWs = 0;

    public Homework(String name, int maxPoint) {
        this.subject = subject;
        this.maxPoint = maxPoint;
        numOfHWs++;
    }
    public void printSubject(){
        System.out.println(subject);
    }

    //getter method to return the value for number of homework
    public static int getNumOfHWs() {
        return numOfHWs;
    }
    //new static void method to print the info of the homeworks with 2 parameters for ints for scores
    public static void printInfo(int a, int b){
        //call to the get number of homeworks method
        System.out.println("Homework: " + getNumOfHWs());
        //cannot reach instance variables
        //System.out.println(name);
        //cannot reach nonstatic methods
        //printName();
        System.out.println(numOfHWs);
        System.out.println(a + b);
    }

    //main method
    public static void main(String[] args) {
        Homework h1 = new Homework("math1",100);
        System.out.println(Homework.getNumOfHWs());
        Homework h2 = new Homework("math2",100);
        Homework h3 = new Homework("math3",100);
        System.out.println(Homework.getNumOfHWs());
    }
}
