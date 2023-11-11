package unit09.inheritance.learning38.objectclass;

//practice generating equals and hashcode methods to check if Strings are equal

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("John", "12");
        Student student2 = new Student("John", "15");
        Student student3 = new Student("John", "12");
        Student student4 = new Student("Mike", "12");
        Student student5 = new Student("Mike", "15");
        Student student6 = new Student("Mike", "12");

        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
        System.out.println(student1.equals(student4));
        System.out.println(student1.equals(student5));
        System.out.println(student1.equals(student6));
        System.out.println(student4.equals(student5));
        System.out.println(student4.equals(student6));
    }
}
