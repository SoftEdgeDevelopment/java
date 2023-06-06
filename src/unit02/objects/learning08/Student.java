package unit02.objects.learning08;
//new class for student
public class Student {
//    new private instance variables for name, exam 1 result, exam 2 result
    private String name;
    private int exam1Result;
    private int exam2Result;

//    generate constructor to assign new parameters to private variables
    public Student(String name, int exam1Result, int exam2Result) {
        //assign new variables to privates
        this.name = name;
        this.exam1Result = exam1Result;
        this.exam2Result = exam2Result;
    }
    //new method to return the value of the average exam results
    public double getAverage(){
        //new double variable for average, cast int exam1 and 2 to double
        //do math for average - add all scores and divide by amount of scores added
        double average = ((double)exam1Result + exam2Result)/2;
        //return the value of the average to getAverage
        return average;
    }
    //new method to return the students name
    public String getName(){
        //will return the value of name
        return name;
    }
}
