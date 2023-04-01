package unit03.conditionals.day15;
//password checker to see if String is correct length and if it contains specific chars
public class PasswordChecker {

    /*password length >= 6 password contains ! */
    public static void main(String[] args) {
        //new string variable for password
        String password = "password111!!!!";
//        nested if
        //checks if the length is greater than or equal to 6
        if (password.length() >= 6) {
            //also checks if it contains "!"
            if (password.contains("!")) {
                //if true for both. valid password
                System.out.println("You have a valid password");
            } else {
                //else does not contain "!"
                System.out.println("Your password must have an (!) character");
            }
            //else does not contain 6 or more characters
        } else {
            System.out.println("Invalid password. It should be 6 or more characters.");
        }

//Compound if
/*        if (password.length() >= 6 && password.contains("!")) {
            System.out.println("You have a valid password");
        } else {
            System.out.println("Your password doesn't meet the requirements.");
        }*/
    }
}
