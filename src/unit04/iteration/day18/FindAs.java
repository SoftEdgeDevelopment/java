package unit04.iteration.day18;
//method to find how many of a specific char are contained in a String
public class FindAs {
    public static void main(String[] args) {
        //create a new string for a word
        String str1 = "Argentina";
        //new count starting from 0
        int count = 0;
        //starting from 0, until the string length add 1
        for (int i = 0; i < str1.length(); i++) {
            //checks letter by letter using substring to see how many a's are contained in the String
            if (str1.substring(i, i + 1).contains("a") || str1.substring(i, i + 1).contains("A")){
                //if any a's are contained, increase the count
                count++;
            }
        }
        //display the number of a's in the String
        System.out.println("There are " + count + " \"a\"s in the " + str1);

    }
}
