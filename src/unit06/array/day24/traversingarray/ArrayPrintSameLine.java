package unit06.array.day24.traversingarray;

//print arrays on the same line with a space between elements
public class ArrayPrintSameLine {
    public static void main(String[] args) {
        int[] myArray = {123,154,1235,2,352,35,235,2,6,346,3,};
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            //will print 0, 10 times because no indexes have been assigned values
            System.out.println(array[i] + " ");
            System.out.println(myArray[i] + " ");
        }
        //     \n makes a new space
        System.out.println("\n----------------------");
        //traverse every other element in the array
        //to increase i by 2, must have i = i + 2
        for (int i = 0; i < myArray.length; i = i + 2) {
            //will display the data type of it
            System.out.println(myArray);
            //needs to add + " " to display the numbers
            System.out.println(myArray[i] + " ");
        }
    }
}
