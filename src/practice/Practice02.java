package practice;

public class Practice02
{
    //private created for personName
    private String personName;
    //private created for personAge
    private int personAge;
    //constructor created to assign new variables
    public Practice02(String thePersonName, int thePersonAge){
        //new variable to be assigned
        personName = thePersonName;
        //new variable to be assigned
        personAge = thePersonAge;
    }
    //new public created
    //void for text
    public void printPersonInfo(){
        //call the personName and print info from main
        System.out.println("The persons name is " + personName);
        //call the personAge and print info from main
        System.out.println("They are " + personAge + "years old");
    }
    public static void main(String[] args) {
        //generate new object and assign the variables values for personName, and personAge
        Practice02 person1 = new Practice02("Mike",87);
        Practice02 person2 = new Practice02("James", 26);
        //prints info of person 1 called from public void printPersonInfo
        person1.printPersonInfo();
        //prints info of person 2
        person2.printPersonInfo();
    }
}
