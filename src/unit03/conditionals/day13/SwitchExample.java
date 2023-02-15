package unit03.conditionals.day13;

public class SwitchExample {
    public static void main(String[] args) {
        int selection = 7;
//        1-4
//
        switch (selection){
            case 1:
                System.out.println("You Select Hamburger Menu");
                break;
            case 2:
                System.out.println("You select Pizza Menu");
                break;
            case 3:
                System.out.println("You select French Fries");
                break;
            case 4:
                System.out.println("You select cheeseburger");
                break;
            default:
                System.out.println("You select the special of the day");
                break;
        }
    }
}
