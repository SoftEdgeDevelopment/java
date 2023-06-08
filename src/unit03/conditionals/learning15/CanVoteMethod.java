package unit03.conditionals.learning15;

public class CanVoteMethod {
    //call to a different method to check if true or false
    public static void main(String[] args) {

        //new variables for age and if they are registered true or false
        int voterAge = 18;
        boolean isRegistered = false;

        //call from canVote method with the 2 parameters
        //if canVote
        if(canVote(voterAge, isRegistered)){
            //display they can vote
            System.out.println("You can vote");
            //else one or both things are false and they cannot vote
        } else{
            System.out.println("Not allowed to vote");
        }

        System.out.println(canVote(voterAge, isRegistered));
//        boolean readyToVote = canVote(voterAge, isRegistered);
//        System.out.println("Can vote: " + readyToVote);
    }

    //new method true or false if the user can vote, 2 parameters for age and if they are registered
    public static boolean canVote(int voterAge, boolean isRegistered){
        //returns the value true or false if voter age is greater than or equal to 18 and they are registered
        return voterAge>=18 && isRegistered;
//        if(age >= 18 && isRegistered){
//            return true;
//        } else {
//            return false;
//        }

        //        if(age >= 18 && isRegistered)
//            return true;
//        return false;
    }
}
