package unit02.objects.day10;

public class EraseTheSearchedWord {
    public static void main(String[] args) {
        String str1 = "SDET is the best";
//        remove the searchWord from the string and print it again.
//        best - > SDET is the
//        the - > SDET is  best
//        print the given word from the string using string methods
        String searchWord = "SDET";

        int beginIndex = str1.indexOf(searchWord);
        int endIndex = str1.indexOf(searchWord)+searchWord.length();
        System.out.println(str1.substring(beginIndex, endIndex));

        String firstWord = str1.substring(0,str1.indexOf(searchWord));
        System.out.println(firstWord);
        String secondWord = str1.substring(endIndex);
        System.out.println(secondWord);
        System.out.println(firstWord+secondWord);
    }
}
