package unit02.objects.day06;
//new class for main
public class StudentMain
{
    public static void main(String[] args) {
        System.out.println("---Main Started---");
        //call from the Student class and create new objects to assign variables for the name and gpa
        Student student1 = new Student("John Doe", 3.74);
        Student student2 = new Student("Mike Myers", 2.7);
        System.out.println("---Main Finished---");
    }
}
