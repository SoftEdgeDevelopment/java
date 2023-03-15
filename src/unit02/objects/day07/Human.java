package unit02.objects.day07;

//new class for Human
public class Human {
    //new private String for the name
    private String name;
    //generate constructor for new assigned variable
    public Human(String name) {
        //new value assigned to private
        this.name = name;
    }
    //new constructor with no parameters
    public Human(){
        //if no parameter is set, the name will automatically be this
        this.name = "Unknown Person";
    }
    //new public void method to print out the name passed from main method
    public void printName(){
        //prints out name variable assigned from main
        System.out.println(name);
    }
    //right click - generate - toString()
    //this will override address value to string value
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
