package unit02.objects.day08;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 95, 100);
        double averageGrade = student1.getAverage();
        System.out.print(student1.getName());
        System.out.print(" has an average of ");
        System.out.println(averageGrade);
    }

}
