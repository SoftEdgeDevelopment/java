package unit03.conditionals.learning15;
//example of an issue with nesting if statement
public class IfElseDilemma {
    public static void main(String[] args) {
        //if 5 is greater than 3
        if (5 > 3) {
            //display it is true
            System.out.println("It is true");
            //if 4 > 7
            if (4 > 7)
                //display it is true as well
                System.out.println("it is true as well");
            //else display it is false
        } else System.out.println("it is false");
        //will not run the middle if statement no matter what because it only checks if and not if else
    }
}
