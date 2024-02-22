package javaprojects.project06;

public class Assignment01 {
    public static void main(String[] args) {
        //call to the prefixAppearsAgain method to display the amount of times the prefix appears in the String
        System.out.println("one time: " + prefixAppearsAgain("abXYabc", 1)); // output: true
        System.out.println("two times: " + prefixAppearsAgain("abXYabc", 2)); // output: true
        System.out.println("three times: " + prefixAppearsAgain("abXYabc", 3)); // output: false
    }

    //method to check if prefix of length 'n' appears more than once in the string
    public static boolean prefixAppearsAgain(String str, int n) {
        //extract the prefix of length 'n' from the string
        String prefix = str.substring(0, n);
        //counter to keep track of the number of occurrences of the prefix
        int prefixCount = 0;

        //iterate through the string to find occurrences of the prefix
        for (int i = 0; i <= str.length() - n; i++) {
            //check if the substring of length 'n' starting from index 'i' matches the prefix
            if (str.substring(i, i + n).equals(prefix)) {
                //increment the prefix count if match is found
                prefixCount++;
            }
        }

        //return true if the prefix appears more than once, otherwise false
        return prefixCount >= 2;
    }
}

