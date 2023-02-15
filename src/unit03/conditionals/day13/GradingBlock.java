package unit03.conditionals.day13;

public class GradingBlock {
    public static void main(String[] args) {
        int grade = 43;
        if(grade > 89){
            System.out.println("Your grade is A");
        } else if(grade>79){
            System.out.println("Your grade is B");
        } else if (grade > 69) {
            System.out.println("Your grade is C");
        } else {
            System.out.println("Your grade is F.");
        }
//        A >89
//        B >79 less than 90
//        C > 69 less than 80
//        F anything less than 69
    }
}
