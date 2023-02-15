package unit03.conditionals.day14;


public class MethodExampleWithMainMethod {

    //    greetingJava "Hello Java"
    public static void greetingJava() {
        System.out.println("Hello Java");
    }

    //    greetingWithName it will get a String as a parameter
//    it will be a void method
//    it will print How are you today, {parameter}
    public static void greetingWithName(String name) {
        System.out.println("How are you today, " + name + "?");
    }

    //    write a void method name canJoinParty
//    it will get one integer parameter for age
//    within the method you will check if the age is
//    greater than or equal to 18
//    if yes print enjoy the party
//    if no print not allowed
    public static void canJoinParty(int age) {
        if (age >= 18) {
            System.out.println("Enjoy the party.");
        } else {
            System.out.println("Not allowed.");
        }
    }
//same method but use ternary operator inside the logic
//    canJoinPartyTernary ? :

    public static void canJoinPartyTernary(int age) {
//        String message;
//        message = age >= 18 ? "Enjoy the party" : "Not allowed";
//        System.out.println(message);
        System.out.println(age >= 18 ? "Enjoy the party" : "Not allowed");
    }

    public static void main(String[] args) {
//        greetingJava();
//        greetingWithName("John");
//        canJoinParty(15);
//        canJoinParty(19);
        canJoinPartyTernary(21);
    }


}
