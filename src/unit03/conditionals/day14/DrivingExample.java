package unit03.conditionals.day14;

public class DrivingExample {
    public static void main(String[] args) {
//        If has driver license
//        if no alcohol
//        than you can drive
//        otherwise can't drive
        boolean hasDriverLicense;
        boolean noAlcohol;

        hasDriverLicense = true;
        noAlcohol = true;

        if(hasDriverLicense && noAlcohol) {
            System.out.println("You can drive");
        } else{
            System.out.println("You CAN'T drive.");
        }
    }
}
