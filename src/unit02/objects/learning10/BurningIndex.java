package unit02.objects.learning10;

public class BurningIndex {
    public static void main(String[] args) {
        //new string variable for a word
        String str1 = "California";
        //new string variable for a search word contained
        String searchedWord = "ali";
        //new int variable to get the start location of the search word (indexOf)
        int begin = str1.indexOf(searchedWord);
        //new int variable to get the end location of the search word (beginning index + length)
        int end = begin + searchedWord.length();
        //new substring to get the beinning index and ending index of the String
        String result = str1.substring(begin,end);
        //will display the index of the beginning of the search word
        System.out.println(begin);
        //will display the index of the end of the search word
        System.out.println(end);
        //will display the search word begin - end index as a String
        System.out.println(result);
    }
}
