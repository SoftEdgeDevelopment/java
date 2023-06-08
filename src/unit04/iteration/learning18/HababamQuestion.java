package unit04.iteration.learning18;
//check how many of a char is contained in a string part 2
public class HababamQuestion {
    public static void main(String[] args) {
//        find the number of ab's in Hababam
        String str1 = "Hababam";

        //new count starting from 0
        int count = 0;
        //starting from 0 until the string length - 1, add 1
        for (int i = 0; i < str1.length() - 1; i++) {
            //checks if any 2 letters are "ab"
            //if the substring of i and i + 2 equals "ab"
            if (str1.substring(i, i + 2).equals("ab")) {
                //increase count by 1
                count++;
            }
        }
        //display the amount of abs for the count
        System.out.println("There are " + count + " \"ab\"s in the " + str1);
    }
}
