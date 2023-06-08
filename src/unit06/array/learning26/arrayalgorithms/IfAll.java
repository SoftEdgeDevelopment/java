package unit06.array.learning26.arrayalgorithms;

//checks if all the searched elements contained in the array are the same
public class IfAll {
    public static void main(String[] args) {
        //new int array for numbers
        int[] numbers = {2, 2, 2, 2, 2, 2,};
        int[] numbers2 = {2, 2, 2, 2, 3, 2};
        //call to the ifAny method using the numbers array and the search key of 7564
        System.out.println(ifAll(numbers, 2));
        System.out.println(ifAll(numbers2, 2));
    }

    //method to find if all the key numbers are the same in the array
    public static boolean ifAll(int[] arr, int key) {
        //for each number in the array
        for (int num : arr) {
            //if the number does not equal the key
            if (num != key) {
                //it is not in the array
                return false;
            }
        }
        //otherwise it is in the array
        return true;
    }
}