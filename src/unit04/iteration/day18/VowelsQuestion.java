package unit04.iteration.day18;
//checks if a String contains any vowels
public class VowelsQuestion {
    public static void main(String[] args) {
        //new String sentence
        String champ = "Morocco is the best!";
        //counter starting at 0
        int counter = 0;
        //starting from 0, until the length of the string, add 1
        for (int i = 0; i < champ.length(); i++) {
            //string string checks letter by letter using substring
            String check = champ.substring(i, i+1);
            //call to the isVowel method using check to see letter by letter if it contains any of the vowels
            if(isVowel(check)){
                //if it contains any vowel, add 1
                counter++;
            }

        }
        //display the count of vowels
        System.out.println("There are " + counter + " vowels in " + champ);
    }

    //new method true or false to see if there is a vowel or not
    //1 parameter for check
    public static boolean isVowel(String check){
        //checking letter by letter, if any letter equals a vowel
        if(check.equals("a") || check.equals("e") || check.equals("i") || check.equals("o") || check.equals("u")){
            //return true to the counter
            return true;
            //else return false and do not increase counter
        } else {
            return false;
        }
    }
}
