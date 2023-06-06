package unit02.objects.learning08;

public class StudentMain {
    public static void main(String[] args) {
        //new objects created with parameters assigned called from Student class constructor
        Student student1 = new Student("John Doe", 95, 76);
        Student student2 = new Student("Rick James", 38, 97);
        //new double variable for averageGrade of all grades
        double averageGrade;
        //get the average grade for all student grades by initializing getAverage methods for each student and diving by amount of students
        averageGrade = ((student1.getAverage() + student2.getAverage()) / 2);
        //display the students name from the getName method, and the averageGrade called from the getAverage method
        System.out.println(student1.getName() + " has an average grade of " + student1.getAverage());
        System.out.println(student2.getName() + " has an average grade of " + student2.getAverage());
        System.out.println("the students have an average grade of " + averageGrade);



    }

}
