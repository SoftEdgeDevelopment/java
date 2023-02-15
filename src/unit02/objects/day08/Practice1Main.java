package unit02.objects.day08;

public class Practice1Main {
    public static void main(String[] args) {
        Practice1 p1 = new Practice1(3.5);

        double doubledValue;
        doubledValue = p1.doubleTheValue();
        System.out.println(doubledValue);

        double halvedValue;
        halvedValue = p1.halfTheValue();
        System.out.println(halvedValue);


        System.out.println(p1.threeTimesTheValue());

    }
}
