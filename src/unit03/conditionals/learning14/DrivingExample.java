package unit03.conditionals.learning14;

public class DrivingExample {
    public static void main(String[] args) {
//        If has driver license
//        if no alcohol
//        than you can drive
//        otherwise can't drive
        //new true or false if driver has a license
        boolean hasDriverLicense;
        //checks true or false if driver has alcohol
        boolean noAlcohol;
        hasDriverLicense = true;
        noAlcohol = true;
        //if they have a license and no alcohol they can drive
        if(hasDriverLicense && noAlcohol) {
            //displays the user can drive
            System.out.println("You can drive");
        }
        //else the user cant drive
        else{
            System.out.println("You CAN'T drive.");
        }
    }
}
