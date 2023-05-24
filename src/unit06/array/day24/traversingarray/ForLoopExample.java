package unit06.array.day24.traversingarray;
//practice traversing and array in a for loop
public class ForLoopExample {
    public static void main(String[] args) {
        //create new int array for numbers
        int[] numbers = {3,8,2,9,11,34,57};

        //fori + tab = fast way to type
        //for i, until numbers.length
        for (int i = 0; i < numbers.length; i++) {
            //display all the numbers until each length
            System.out.println(numbers[i]);
        }
    }
}
