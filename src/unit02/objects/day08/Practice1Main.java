package unit02.objects.day08;
//new class for main method
public class Practice1Main {
    public static void main(String[] args) {
        //new object created with parameters assigned called from class Practice1 constructor
        Practice1 p1 = new Practice1(3.5);
        //call to each method, halfValue, tripleValue, tenTimesValue, to display information about the num
        System.out.println(p1.halfValue());
        System.out.println(p1.tripleValue());
        System.out.println(p1.tenTimesValue());
    }
}
