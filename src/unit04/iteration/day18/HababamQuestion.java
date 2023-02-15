package unit04.iteration.day18;

public class HababamQuestion {
    public static void main(String[] args) {
//        find the number of ba's in Hababam
        String str1 = "Hababam";

        int count = 0;
        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.substring(i, i + 2).equals("ab")) {
                count++;
            }
        }
        System.out.println("There are " + count + " \"ab\"s in the " + str1);
    }
}
