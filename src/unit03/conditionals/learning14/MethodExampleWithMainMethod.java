package unit03.conditionals.learning14;

//call to different methods within the same class, without making new classes
public class MethodExampleWithMainMethod {
    //create a new method to print "hello world" to console, must be satatic to call to the main method
    public static void helloWorld(){
        System.out.println("Hello World");
    }
    //new method to say hello with name with 1 parameter for name
    public static void sayHelloWithName(String name){
        System.out.println("Hello " + name);
    }
    //write a new method to check if the user is old enough to goto the party, 1 parameter for age
    public static void canJoinParty(int age){
        //if age is or equal to 18
        if(age >= 18){
            //they can party
            System.out.println("you can goto party");
        }
        else{
            //else they are younger than 18
            System.out.println("you cannot goto party");
        }
    }
    //same as above with ternary operator, 1 parameter for age
    public static void canJoinPartyTernary(int age){
        String message = age >= 18 ? "Enjoy the party" : "You cannot goto the party";
        //another way to write it without making a new String variable
        //System.out.println(age >= 18 ? "Enjoy the party" : "You cannot go to the party");
    }
    public static int sumOfNumbers(int num1, int num2){
        //new int variable for the sum of the numbers
        int sum = num1 + num2;
        //return the value of sum to sumOfNumbers
        return sum;
        //faster way to write it
        //return num1 + num2
    }

    public static void main(String[] args) {
        //call to the method with no parameters
        helloWorld();
        //call to the method with 1 parameter, this will return the value to String name
        sayHelloWithName("John");
        //call to the sumOfNumbers method with 2 parameters
        System.out.println("the sum of the numbers are " + sumOfNumbers(5,9));
        //example - call to the person class day14 - Person
        Person person1 = new Person("John");
        //call to the print name method from the person class day 14 - Person
        person1.printName();
        //call to canJoinParty method with age as parameter
        canJoinParty(17);
        canJoinParty(25);
        //easier way method for above line ^^^^
        canJoinPartyTernary(19);


    }

}
