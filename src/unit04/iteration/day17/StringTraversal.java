package unit04.iteration.day17;

public class StringTraversal {
    public static void main(String[] args) {
        String str1 = "Hello";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.substring(i, i+1));
            System.out.println("with charAt(i) " + str1.charAt(i));
        }
        System.out.println("Something");
    }
}
