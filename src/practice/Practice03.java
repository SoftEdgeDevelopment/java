package practice;

//new class for person
class person{
    //private variables for name, eye color, and age
    private String name;
    private String eyes;
    private int age;
    //generate constructor to assign new parameters
    public person(String theirName, int theirAge, String colorEyes){
        name = theirName;
        age = theirAge;
        eyes = colorEyes;
    }
    //new void method to get the persons info and display all the names, ages, and colors
    public void getPersonInfo(){
        //will display the name
        System.out.println("The persons name is " + name);
        //will display the age
        System.out.println("They are " + age + " years old");
        //will display the eyes
        System.out.println("Their eyes are the color " + eyes);
    }
}
//new class for fruit information
class fruit{
    //privates for fruit type
    private String type;
    //private for amount of fruit
    private int count;
    //new constructor to assign new parameters
    public fruit(String fruitType, int fruitCount){
        type = fruitType;
        count = fruitCount;
    }
    //new void method to display the fruit information
    public void getFruitInfo(){
        System.out.println("Their favorite fruit is " + type);
        System.out.println("When they go to the store they buy " + count + " of them");
    }
}
//new class for job
class job{
    //new private variables for job name, amount of hours worked weekly, and salary
    private String jobName;
    private int weeklyHours;
    private double salary;
    //generate constructor to assign new parameters
    public job(String theJobName, int theWeeklyHours, double theSalary){
        jobName = theJobName;
        weeklyHours = theWeeklyHours;
        salary = theSalary;
    }
    //new void method to display the job information
    public void getJobInfo(){
        System.out.println("They work as a " + jobName);
        System.out.println("They work " + weeklyHours + " hours per week");
        System.out.println("They make $" + salary + " per hour");
        System.out.println("----------------------------------------------------");
    }
}
//public class for where all the classes are stored
public class Practice03
{

    public static void main(String[] args)
    {
        System.out.println("Start of Main");
        System.out.println("----------------------------------------------------");
        //create new objects for each person and assign parameters
        person person1 = new person("James",28,"Blue");
        person person2 = new person("Emily",48,"Brown");
        person person3 = new person("Sara",19,"Green");
        //------------------------------------------------------------------------
        //create new objects for each fruit and assign new parameters
        fruit fruit1 = new fruit("Strawberries", 5);
        fruit fruit2 = new fruit("Apples",9);
        fruit fruit3 = new fruit("Bananas",3);
        //------------------------------------------------------------------------
        //create new objects for each job and assign new parameters
        job job1 = new job("Engineer",40,30.70);
        job job2 = new job("Farmer",70,25.54);
        job job3 = new job("Astronaut",23,250.32);
        //------------------------------------------------------------------------
        //display all information about each person, the fruit information, and the job information
        person1.getPersonInfo();
        fruit1.getFruitInfo();
        job1.getJobInfo();
        //-----
        person2.getPersonInfo();
        fruit2.getFruitInfo();
        job2.getJobInfo();
        //-----
        person3.getPersonInfo();
        fruit3.getFruitInfo();
        job3.getJobInfo();
        //-----
        System.out.println("End of Main");
    }

}
