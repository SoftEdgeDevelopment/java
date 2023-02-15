package unit02.objects.day07;

public class HumanMain {
    public static void main(String[] args) {
        Human human1 = new Human("John Doe");
        System.out.println(human1);
        Human human2 = new Human();
        human1.printName();
        System.out.println(human2);
    }
}
