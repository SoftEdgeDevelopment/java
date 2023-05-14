package javaprojects.project02;

//create 3 classes with constructors, create main method, call the constructors to create objects
//create new class for Students
class Students{
    //new private for String - StudentsName
    private String studentsName;
    //new private for int - studentsId
    private int studentsId;
    //create constructor public Students with new variables
    ////create new parameters inside (here), in this case string for theStudentsName, and int for theStudentsId, to get new values to give to the variables - (studentsName,studentsId)
    public Students (String theStudentsName, int theStudentsId){
        //studentsName = whatever the new input of theStudentsName is
        studentsName = theStudentsName;
        //studentsId = whatever the new input of theStudentsId is
        studentsId = theStudentsId;
    }
}
//new class for house with private instance variables for address and street
class Houses {
    private int housesAddress;
    private String housesStreet;
    //generate constructor to assign new parameters to private variables
    public Houses(int theHousesAddress, String theHousesStreet){
        housesAddress = theHousesAddress;
        housesStreet = theHousesStreet;
    }
}
//new class for employees with private instance variables for name and phone number
class Employees {
    private String employeesName;
    private int employeesPhoneNumber;
    //generate constructor to assign new parameters to privates variables
    public Employees(String theEmployeesName, int theEmployeesPhoneNumber){
        employeesName = theEmployeesName;
        employeesPhoneNumber = theEmployeesPhoneNumber;
    }
}
public class Assignment11 {
    public static void main(String[] args) {
        //new objects created with parameters assigned
        //-------------------------------------------------------------------------------------------
        Employees employee1 = new Employees("John",2063757183);
        //-------------------------------------------------------------------------------------------
        Houses house1 = new Houses(47298,"SE Lightning ST");
        //-------------------------------------------------------------------------------------------
        Students student1 = new Students("Mike",317461);
        //-------------------------------------------------------------------------------------------
    }
}
