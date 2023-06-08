package unit03.conditionals.learning14;

public class MathClub {
    public static void main(String[] args) {
//        if you have 3.0 or higher gpa
//        or if you have A grade from Math check strings with .equals()
//        you can join the math club
//        else you can't join the math club.
        //new variables for grade and letter grade
        double gpa = 2.4;
        char mathLetterGrade = 'A';

        //String mathGrade = "A";
//       if(gpa >= 3.0 || mathGrade.equals("A")){
//          System.out.println("You are welcome to join.");
//        } else {
//           System.out.println("You can't join the club.");
//        }

        //if gpa is greater than or equal to 4 OR if mathLetterGrade is equal to 'A'
        if(gpa >= 4 || mathLetterGrade == 'A'){
            //they can join
            System.out.println("You are welcome to join.");
        } else {
            //else they cant join
            System.out.println("You can't join the club.");
        }
    }
}
