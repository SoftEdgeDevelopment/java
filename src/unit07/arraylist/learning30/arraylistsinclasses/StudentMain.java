package unit07.arraylist.learning30.arraylistsinclasses;

import java.lang.reflect.Array;
import java.util.ArrayList;

//methods to store and display different things in arraylists calling to different classes and creating objects

public class StudentMain {
    public static void main(String[] args) {
        //new Student object calling to the student class
        Student student1 = new Student("John Doe", 8);
        //add grades to the student to store in the array list
        student1.addMathGrade(95);
        student1.addMathGrade(67);
        student1.addMathGrade(100);
        student1.addMathGrade(87);
        student1.addMathGrade(38);
        student1.addMathGrade(91);
        student1.addMathGrade(79);
        student1.addMathGrade(70);
        student1.addMathGrade(71);
        student1.addMathGrade(100);
        //call to the getMathGrades method to display all the grades
        System.out.println("all of the math scores in the class displayed: " + student1.getMathGrades());
        //call to the mathAverage method to display the average of all the grades
        System.out.println("the students math score average: " + student1.mathAverage());
        student1.gradesAboveSeventy();
        System.out.println("grades above 70: "+student1.getMathGrades());
        System.out.println("average above 70: "+student1.mathAverage());
    }
}


//class for student
class Student {
    private String name;
    private int gradeLevel;
    private ArrayList<Integer> mathGrades;

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        //initialize mathGrades with an empty arrayList
        this.mathGrades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public ArrayList<Integer> getMathGrades() {
        return mathGrades;
    }

    public void setMathGrades(ArrayList<Integer> mathGrades) {
        this.mathGrades = mathGrades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", mathGrades=" + mathGrades +
                '}';
    }

    //void method because it doesn't return anything
    //method to add a math score into the mathGrades array list
    public void addMathGrade(int score) {
        //add the score element to the mathGrades array list
        mathGrades.add(score);
    }

    public double mathAverage() {
        //new empty double to store the sum;
        double sum = 0.0;
        //for each number in the mathGrades array list
        for (int num : mathGrades) {
            //add the number to the sum
            sum += num;
        }
        //get the average by sum / size of the mathGrades array list
        return sum / mathGrades.size();
    }

    public void gradesAboveSeventy() {
        for (int i = 0; i < mathGrades.size(); i++) {
            //gets the index of the number in the mathGrades arraylist and checks if it's less than 70
            if (mathGrades.get(i) <= 70){
                //removes the index of the number below 70
                mathGrades.remove(i);
                //assigned the new index position for the next number
                i--;
            }
        }
    }
}
