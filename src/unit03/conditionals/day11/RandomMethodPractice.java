package unit03.conditionals.day11;

public class RandomMethodPractice {
    public static void main(String[] args) {
        //random number between 0 and 10 as decimal
        System.out.println((Math.random() * 11));
        //cast as (int) to display full number
//        random number between 0 and 10
        System.out.println((int)(Math.random() * 11));
//       random number between 1 and 6
        System.out.println((int) (Math.random() * 6) + 1);
//        Selims question random number between 4 and 8
        //4 is the starting index location, the random numbers will be between 5 total values starting from 4 (4,5,6,7,8) 8 is the highest possible number
        System.out.println((int) (Math.random() * 5) + 4);
    }
}
