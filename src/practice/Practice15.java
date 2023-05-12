package practice;
//class created with getters to call from the main and setters to change the values of parameters of the object in the main, override to string and display all the information
public class Practice15 {
    //new class for a person created - static to be accessed within
    static class Person{
        private String name;
        private int age;
        private double salary;
        private boolean isMarried;

        //generate constructor with parameters to assign values to private variables
        public Person(String name, int age, double salary, boolean isMarried) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.isMarried = isMarried;
        }
        //create getter methods to get the information of each
        //create setter methods to set the values of each variable
        //right click - generate - getter and setter
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public boolean isMarried() {
            return isMarried;
        }

        public void setMarried(boolean married) {
            isMarried = married;
        }

        //generate to string to display information of the object
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    ", isMarried=" + isMarried +
                    '}';
        }
    }
    Person person1 = new Person("Joe",21,150000,true);
    //main method for setters to call to the methods to change values of parameters in an object
    public static void main(String[] args) {
        //create new object for a Person
        Person person1 = new Person("James",37,150000,true);
        //get the persons info 1 by 1 with getters methods
        person1.getName();
        person1.getAge();
        person1.getSalary();
        person1.isMarried();
        //display all the info using override to string method
        System.out.println(person1);
        //change all the info with setters methods
        person1.setName("Drake");
        person1.setAge(21);
        person1.setSalary(800000);
        person1.setMarried(false);
        //display the persons updated information
        System.out.println(person1);
    }
}
