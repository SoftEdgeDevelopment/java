package unit05.classes.oop.learning21.gettersandsetters;
//main method for setters to call to the methods to change values of parameters in an object
public class MainForSetters {
    public static void main(String[] args) {
        //create car object and assign values
        Car car1 = new Car("White", 2020,135000);
        Car car2 = new Car("Purple", 1995, 193000);
        //using string override from the Car class, display the cars information
        System.out.println(car1);
        //display info of car 2
        System.out.println(car2);
        //call to the set color method to change the color of the car
        //method to set the value of the color from white to blue
        System.out.println("updated parameters");
        car1.setColor("Blue");
        //display the car with the updated color
        System.out.println(car1);
        //change mileage of car 2
        car2.setMileage(12000);
        //change color of car 2
        car2.setColor("Pink");
        //display updated car 2
        System.out.println(car2);
        //change year of car 1
        car1.setYear(1908);
        //display updated car 1
        System.out.println(car1);
        //--------------------------------------------------
        System.out.println("------------------------------");
        //for student
        Student student1 = new Student(839567,"James",3.7);
        Student student2 = new Student(573822,"Kate",4.0);
        //display the students info from the Student Class override to string
        System.out.println(student1);
        System.out.println(student2);
        //change a few values of the students
        student1.setGpa(2.1);
        student1.setName("Joe");
        student2.setId(746281);
        System.out.println("updated parameters");
        //display the new students updated parameters
        System.out.println(student1);
        System.out.println(student2);
    }
}
