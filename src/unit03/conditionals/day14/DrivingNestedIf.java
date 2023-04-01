package unit03.conditionals.day14;

public class DrivingNestedIf {
    //practice nested loop both ifs must be true for statement to run
    public static void main(String[] args) {
        boolean hasDriverLicense = false;
        boolean clearBackground = true;
        //checks if they have a driver license true or false
        if (hasDriverLicense) {
            //nested if, checks also if they have a clear background true or false
            if (clearBackground) {
                //if true for both ifs can drive
                System.out.println("You can drive for the company");
            } else {
                //else needs a clear background check
                System.out.println("You should have a clear background check");

            }
            //else they dont have a driver license, and the first check was false
        } else {
            System.out.println("You should have a driver license to drive");
        }
        //another way to write it
//        if(hasDriverLicense && clearBackground){
//            System.out.println("You can drive for the company");
//        } else {
//            System.out.println("You can't drive");
//        }
    }
}
