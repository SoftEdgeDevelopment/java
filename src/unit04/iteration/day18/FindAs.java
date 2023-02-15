package unit04.iteration.day18;

public class FindAs {
    public static void main(String[] args) {
        String str1 = "Argentina";

        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.substring(i, i + 1).contains("a") || str1.substring(i, i + 1).contains("A")){
                count++;
            }
        }
        System.out.println("There are " + count + " \"a\"s in the " + str1);

    }
}
