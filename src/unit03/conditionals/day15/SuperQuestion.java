package unit03.conditionals.day15;
//quick if, else if, else review for maths
public class SuperQuestion {
    public static void main(String[] args) {
        //new variables for the value of x, y, and z
        int x = 5;
        int y = -2;
        int z = 4;
        //if y * 2 is less than x
        if ((y * 2) < x)
        {
            //multiply y by -1 and return the value to y
            y *=-1;
            //subtract the value of y from z and return z
            z -= y;
        }
        //if z does not equal x
        if (z != x)
        {
            //add x by 1
            x++;
            //make the value of y equal to x plus z
            y = x + z;
        }
        //display the new values of x, y, and z
        System.out.println("x: " + x + " y: " + y + " z: " + z);
    }
}
