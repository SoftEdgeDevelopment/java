package unit03.conditionals.day14;

public class DrivingNestedIf {
    public static void main(String[] args) {
        boolean hasDriverLicense = true;
        boolean clearBackground = false;
        if (hasDriverLicense) {

            if (clearBackground) {
                System.out.println("You can drive for the company");
            } else {
                System.out.println("You should have a clear background check");

            }
        } else {
            System.out.println("You should have a driver license to drive");
        }

//        if(hasDriverLicense && clearBackground){
//            System.out.println("You can drive for the company");
//        } else {
//            System.out.println("You can't drive");
//        }
    }
}
