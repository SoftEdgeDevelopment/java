package unit02.objects.day08;

public class Student {
//    instance variable name
    private String name;
    private int exam1Result;
    private int exam2Result;

//    Constructor
    public Student(String name, int exam1Result, int exam2Result) {
        this.name = name;
        this.exam1Result = exam1Result;
        this.exam2Result = exam2Result;
    }

    public double getAverage(){
        double average = ((double)exam1Result + exam2Result)/2;
        return average;
    }

    public String getName(){
        return name;
    }
}
