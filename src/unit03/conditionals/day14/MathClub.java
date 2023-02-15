package unit03.conditionals.day14;

public class MathClub {
    public static void main(String[] args) {
//        if you have 3.0 or higher gpa
//        or if you have A grade from Math check strings with .equals()
//        you can join the math club
//        else you can't join the math club.
        double gpa;
        String mathGrade;

        gpa = 2.97;
        mathGrade = "A";
        char mathLetterGrade = 'A';

//        if(gpa >= 3.0 || mathGrade.equals("A")){
//            System.out.println("You are welcome to join.");
//        } else {
//            System.out.println("You can't join the club.");
//        }

        if(gpa >= 3.0 || mathLetterGrade == 'A'){
            System.out.println("You are welcome to join.");
        } else {
            System.out.println("You can't join the club.");
        }
    }
}
