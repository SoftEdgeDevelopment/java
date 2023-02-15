package unit02.objects.day07;

public class Human {
    private String name;
    public Human(String name) {
        this.name = name;
    }
    public Human(){
        name = "Good Person";
    }

    public void printName(){
        System.out.println(name);
    }


}
