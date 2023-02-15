package unit03.conditionals.day11;

public class OneMoreRandom {

    public static void main(String[] args) {
        int randNumber;

        for (int i = 0; i < 100; i++) {
            randNumber = (int)(Math.random()*10)+1;
            System.out.println(randNumber);
        }

    }
}
