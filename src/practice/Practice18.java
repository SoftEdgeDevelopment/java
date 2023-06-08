package practice;

import unit06.array.learning24.arrayreview.Student;

//practice traversing an array in a for loop, and making constructors and objects
public class Practice18 {
    //create a new private int array variable
    private int[] grades;
    //create new private String for name
    private String name;

    //generate constructor with parameter for int array grades, and String name
    public Practice18(int[] grades, String name) {
        this.grades = grades;
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //main method
    public static void main(String[] args) {
        //create new array for grades and assign values
        int[] myGrades = {100,97,99};
        //create new student object using array as one parameter and String for the other
        unit06.array.learning24.arrayreview.Student student1 = new Student(myGrades,"John");
        //create new array for student grades, use student 1 object and call to getGrades method
        int[] studentGrades = student1.getGrades();
        //display the studentGrades at index value 2
        System.out.println(studentGrades[2]);
        System.out.println("--------------------");
        //-------------------------------------------------------------------------
        //practice traversing an array in a for loop
        //create new int array for numbers
        int[] numbers = {3,8,2,9,11,34,57};
        //fori + tab = fast way to type
        //for i, until numbers.length
        for (int i = 0; i < numbers.length; i++) {
            //display all the numbers until each length
            System.out.println(numbers[i]);
        }

    }


}
