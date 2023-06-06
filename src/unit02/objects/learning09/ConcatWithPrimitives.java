package unit02.objects.learning09;

public class ConcatWithPrimitives {
    public static void main(String[] args) {
        //will print out literally 70 + 5 (705) because it is not () and the math works from left to right
        //there is a string before the math, so the math will act as a string
        System.out.println("There are " + 70 + 5 + " students.");
        //will print out 70 + 5 = 75 but 11 + 33 = 1133 because there is a string and 11+33 was converted to string format
        System.out.println(70 + 5 + " students in the class " + 11 + 33);
        //will print out 75 because 70 + 5 is contained
        System.out.println("There are " + (70 + 5) + " students.");
    }
}
