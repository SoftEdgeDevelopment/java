package unit03.conditionals.day15;

public class SuperQuestion {
    public static void main(String[] args) {
        int x = 5;
        int y = -2;
        int z = 4;
        if ((y * 2) < x)
        {
            y *=-1;
            z -= y;
        }
        if (z != x)
        {
            x++;
            y = x + z;
        }
        System.out.println("x: " + x + " y: " + y + " z: " + z);
    }
}
