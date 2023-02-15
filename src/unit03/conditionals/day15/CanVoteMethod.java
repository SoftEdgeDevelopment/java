package unit03.conditionals.day15;

public class CanVoteMethod {
    public static void main(String[] args) {

        int voterAge = 18;
        boolean isRegistered = false;

        if(canVote(voterAge, isRegistered)){
            System.out.println("You can vote");
        } else{
            System.out.println("Not allowed to vote");
        }

        System.out.println(canVote(voterAge, isRegistered));
//        boolean readyToVote = canVote(voterAge, isRegistered);
//        System.out.println("Can vote: " + readyToVote);
    }

    public static boolean canVote(int age, boolean isRegistered){

        return age>=18 && isRegistered;
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
