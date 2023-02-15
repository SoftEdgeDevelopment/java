package unit03.conditionals.day14;

public class NetflixSubscription {
    public static void main(String[] args) {
        boolean hasSubscription;
        boolean inFreeTrial;
        hasSubscription = false;
        inFreeTrial = false;

        if (hasSubscription || inFreeTrial) {
            System.out.println("You can watch the movies.");
        } else {
            System.out.println("Please subscribe of try.");
        }
        String msg = (hasSubscription || inFreeTrial ? "you can watch the movies." : "please subscribe");
        System.out.println(msg);
    }
}
