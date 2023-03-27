package unit02.objects.day10;

public class StringMethodsAll {
    public static void main(String[] args) {
//       substring(beginIndex)
        String state = "Denver";
        //will display everything after index 3
        System.out.println(state.substring(3));
        //will display the last character contained within the String
        System.out.println(state.substring(state.length()-1));
//        System.out.println(state.substring(9));
        String otherState = "California";
        //true or false - checks if equals or not
        System.out.println(state.equals(otherState));
        //String for newState
        String newState = "Denver";
        //the Strings are the same - checks if true
        System.out.println(state.equals(newState));
        //same method as above with string "" used to check instead of variable
        System.out.println("California".equals(otherState));

        //will print the char contained at index location 3
        System.out.println("John".charAt(3));

        //new string with nothing contained inside
        String emptyString = "";
        //checks to see if the String has anything in it - true or false
        System.out.println(emptyString.isEmpty());
        //String has thins contained so this will be false
        System.out.println(newState.isEmpty());

        //will display every char in the String as uppercase
        System.out.println(newState.toUpperCase());
        //will display every char in the String as lowercase
        System.out.println("NEW YORK".toLowerCase());

        //trim removes all the unneeded spaced between the String
        System.out.println(" trimmer ".trim());
        //this will combine trim and to upper case to remove the unneeded spaces and convert all the chars in the string to upper case
        System.out.println("         trimAndUpperCase ".trim().toUpperCase());

        //checks to see if the first word in the String starts with something specific - true or false
        System.out.println("Mr. Aziz".startsWith("Mr"));
        //checks to see if the last word in the String starts with something specific - this will be true
        System.out.println("Ms. John".endsWith("John"));
        //this will be false because the String ends with "Doe"
        System.out.println("John Doe".endsWith("John"));

        //this will replace a targeted word within a String with a replacement word
        System.out.println("SDET is best.".replace("best", "awesome"));
        //it will replace all instances of the word contained in the String
        System.out.println("SDET is best of the best".replace("best", "awesome"));
        //will replace only the first instance of the replacement word contained within the String
        System.out.println("aaaabbbcccddd".replaceFirst("a", "x"));

        //positive result - the initial char / String comes after the comparedTo
        //negative result - the initial char / String comes before the comparedTo
        //compares which comes first in alphabetical order - A is 9 characters ahead of J (-9)
        System.out.println("Al".compareTo("Jack"));
        //A is 0 characters ahead of A (0)
        System.out.println("A".compareTo("A"));
        //A is 1 char ahead of B (-1)
        System.out.println("A".compareTo("B"));
        //B is 1 char behind A (1)
        System.out.println("B".compareTo("A"));
    }
}
