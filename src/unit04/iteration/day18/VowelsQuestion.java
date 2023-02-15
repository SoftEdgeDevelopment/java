package unit04.iteration.day18;

public class VowelsQuestion {
    public static void main(String[] args) {
        String champ = "Morocco is the best!";
        int counter = 0;
        for (int i = 0; i < champ.length(); i++) {
            String check = champ.substring(i, i+1);
            if(isVowel(check)){
                counter++;
            }

        }
        System.out.println("There are " + counter + " vowels in " + champ);
    }

    public static boolean isVowel(String check){
        if(check.equals("a") || check.equals("e") || check.equals("i") || check.equals("o") || check.equals("u")){
            return true;
        } else {
            return false;
        }
    }
}
