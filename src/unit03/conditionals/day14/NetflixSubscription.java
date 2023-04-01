package unit03.conditionals.day14;
//if else example with boolean and ternary operator
public class NetflixSubscription {
    public static void main(String[] args) {
        boolean hasSubscription = false;
        boolean inFreeTrial = true;

        //if either boolean is true
        if (hasSubscription || inFreeTrial) {
            //they can watch movies
            System.out.println("You can watch the movies.");
        } else {
            //else both booleans are false
            System.out.println("Please subscribe.");
        }
        //---------------ternary operator
        System.out.println("-- Ternary Operator Below --");
        //another way to write with a ternary operator
        String msg = (hasSubscription || inFreeTrial ? "you can watch the movies." : "please subscribe");
        //display the String variable result
        System.out.println(msg);
    }
}
