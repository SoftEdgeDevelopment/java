package unit06.array.day24.arrayreview;
//practice with arrays
public class Student {
    //create a new private int array variable
    private int[] grades;
    //create new private String for name
    private String name;

    //generate constructor with parameter for int array grades, and String name
    public Student(int[] grades, String name) {
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


    //create main method
    public static void main(String[] args) {
        //create new array for grades and assign values
        int[] myGrades = {100,97,99};
        //create new student object using array as one parameter and String for the other
        Student student1 = new Student(myGrades,"John");
        //create new array for student grades, use student 1 object and call to getGrades method
        int[] studentGrades = student1.getGrades();
        //display the studentGrades at index value 2
        System.out.println(studentGrades[2]);
    }
}

