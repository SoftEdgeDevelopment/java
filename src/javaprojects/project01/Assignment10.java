package javaprojects.project01;

public class Assignment10 {
    //5 friends going to a theatre with an aisle on either side
    //James doesn't want to sit next to Jill
    //Betty and Herb want to sit next to each other
    //Bob wants to sit on the left side of the aisle
    //James wants to sit on the aisle
    //please fix the invalid order : James, Betty, Herb, Bob, Jill
    public static void main(String[] args) {
        String p1 = "James";
        String p2 = "Jill";
        String p3 = "Bob";
        String p4 = "Betty";
        String p5 = "Herb";
        //arrange the names in order based on the prompt above
        System.out.println(p3 + ", " + p2 + ", " + p4 + ", "+ p5 + ", " + p1);
    }
}