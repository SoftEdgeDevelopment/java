package unit04.iteration.day18;

public class StringTraversing {
    public static void main(String[] args) {
        String str1 = "World";
        
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.substring(i, i+1));
        }

        System.out.println("+++++Reversed Version++++++++++");

        for (int i = str1.length() - 1; i >=0 ; i--) {
            System.out.println(str1.substring(i, i+1));
        }

        System.out.println("+++++charAt() Version++++++++++");
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
//        System.out.println(str1.substring(6, 9));
//        System.out.println(str1.substring(6, 10));
    }
}
