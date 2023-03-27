package unit02.objects.day10;

public class EraseTheSearchedWord {
    public static void main(String[] args) {
        //new String variable for a sentence
        String str1 = "SDET is the best";
//        remove the searchWord from the string and print it again.
//        best - > SDET is the
//        the - > SDET is  best
//        print the given word from the string using string methods
        String searchWord = "SDET";

        System.out.println(str1);
        //new int to find the start of the search word
        int beginIndex = str1.indexOf(searchWord);
        //new int to find length of the search word + the initial index - will find the end of the search word
        int endIndex = str1.indexOf(searchWord)+searchWord.length();
        //display the substring of the beginning index and the ending index - between index 0-3
        //will display the search word
        System.out.println(str1.substring(beginIndex, endIndex));
        //new String to get the substring of the beginning of the search word index until the lenght
        String missingWord = str1.substring(endIndex);
        //display the second word - will be the rest of the string without the first word included
        System.out.println(missingWord);

    }
}
