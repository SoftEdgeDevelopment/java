package practice;

public class Practice23 {

    //method to combine contents from 2d string array
    public static void main(String[] args) {
        //2D string array for letters
        String[][] letters = {
                {"a","b","c","d","e"},
                {"e","f","g","h","i"},
                {"j","k","l","m","n"},
                {"o","p","q","r","s"},
                {"t","u","v","w","x","y","z"}
        };

        //make the string SDET from the 2D string array
        String key = letters[3][4] + letters[0][3] + letters[0][4] + letters[4][0];
        //prints the key
        System.out.println(key);
        //prints the key toUpperCase
        System.out.println(key.toUpperCase());
    }
}
