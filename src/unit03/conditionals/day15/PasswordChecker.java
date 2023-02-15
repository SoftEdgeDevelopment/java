package unit03.conditionals.day15;

public class PasswordChecker {

    /*password length >= 6 password contains ! */
    public static void main(String[] args) {
        String password = "password111!!!!";
//        nested if
        if (password.length() >= 6) {
            if (password.contains("!")) {
                System.out.println("You have a valid password");
            } else {
                System.out.println("Your password must have an (!) character");
            }
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
