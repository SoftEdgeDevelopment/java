package unit04.iteration.day18;
//nested loop practice
public class NestedMadeUpQuestion {
    public static void main(String[] args) {
        //starting from 0, until less than 3, add 1
        for (int outer = 0; outer < 3; outer++) {
            //print the count + an arrow to the right
            System.out.print(outer + "-> ");
            //Nested loop - for loop inside a for loop
            //starting from 0, until less than 4, add 1
            for (int inner = 0; inner < 4; inner++) {
                //print the count
                System.out.print(inner);
            }
            //this will print each outer loop on a new line
            System.out.println();
        }
    }
}
