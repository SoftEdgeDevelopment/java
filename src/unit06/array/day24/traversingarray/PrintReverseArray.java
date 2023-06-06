package unit06.array.day24.traversingarray;

//method to print an array in reverse and called to the main
public class PrintReverseArray {
    public static void main(String[] args) {
        //new array variable to call in the call
        int [] myArr = {324,6346,867,132,7,465,};
        //call to the method using myArr and display the array reversed
        printReversedArray(myArr);
    }


    public static void printReversedArray(int[] arr){
        //from int array length until the first element, subtract by 1
        for (int i = arr.length-1; i >= 0; i--) {
            //print each element
            System.out.println(arr[i]);
        }
    }
}
