package unit03.conditionals.learning15;
//new class for main method for rectangle
public class RectangleMain {

    public static void main(String[] args) {
        //create new objects and assign parameters for width and height
        Rectangle r1 = new Rectangle(3,5);
        Rectangle r2 = new Rectangle(3,5);

        //generate an @Override equals method for boolean in the rectangle class
        //if the value of rectangle r1 and r2 are the same
        if(r1.equals(r2)) {
            System.out.println("They have same values");
            //else the values are not the same
        } else {
            System.out.println("They don't have the same values");
        }
    }
}
