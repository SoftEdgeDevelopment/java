package unit04.iteration.day18;
//practice String transversal, charAt, and writing a String letter by letter backwards
public class StringTraversing {
    public static void main(String[] args) {
        String str1 = "World";
        //starting at 1, until the Strings length, add 1
        for (int i = 0; i < str1.length(); i++) {
            //display the substring starting at i until i+1 (0,0+1) to get each index letter 1 at a time
            System.out.println(str1.substring(i, i+1));
        }

        System.out.println("+++++Reversed Version++++++++++");

        //starting at String legnth - 1, until 0, subtract 1
        for (int i = str1.length() - 1; i >=0 ; i--) {
            //display the substrings and +1 to display 1 letter at a time
            System.out.println(str1.substring(i, i+1));
        }

        System.out.println("+++++charAt() Version++++++++++");
        //same way to write as the first method with charAt instead of substring
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
//        System.out.println(str1.substring(6, 9));
//        System.out.println(str1.substring(6, 10));
    }
}
