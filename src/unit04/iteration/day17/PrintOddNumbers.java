package unit04.iteration.day17;
//for loops to print odd and even numbers to console
public class PrintOddNumbers {
    public static void main(String[] args) {
        //starting from 2, until 10, add i by 2; (i = i+2)
        for (int i = 2; i <= 10; i = i + 2) {
            //display even numbers 1-10
            System.out.println("i: " + i);
        }
        System.out.println("------------------");
        /*
         * Print odd numbers starting from 1 until 10
         * use for loop
         * */
        for(int i = 1; i <=9; i = i+2){
            System.out.println("i : " + i);
        }

    }
}
