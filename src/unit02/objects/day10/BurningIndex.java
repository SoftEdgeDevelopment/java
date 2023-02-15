package unit02.objects.day10;

public class BurningIndex {
    public static void main(String[] args) {
        String str1 = "California";
        String searchedWord = "ali";
        int begin = str1.indexOf(searchedWord);
        int end = begin + searchedWord.length();
        String result = str1.substring(begin,end);
        System.out.println(result);
    }
}
