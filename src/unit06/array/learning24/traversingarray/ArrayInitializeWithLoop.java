package unit06.array.learning24.traversingarray;

public class ArrayInitializeWithLoop {
    public static void main(String[] args) {
        //create an integer array with a new keyword with 5 elements
        //traverse each element and set their values to 10x
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            //multiply i by 10 and assign it to the value of each element in the array
            //will replace each element in the array with the new value
            myArray[i] = i * 10;
            System.out.println(myArray[i] + " ");
        }
        System.out.println("------------------------------");
        //create new array and set every other element
        int[] myArray2 = new int[7];
        for (int i = 0; i < myArray2.length; i = i+2) {
            myArray2[i] = i * 10;
            System.out.println(myArray2[i] + " ");
        }
    }
}
