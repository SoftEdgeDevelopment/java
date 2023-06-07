package unit06.array.day26.arrayalgorithms;
//checks if any of the searched elements are contained in the array
public class IfAny {
    public static void main(String[] args) {
        //new int array for numbers
        int[] numbers = {123, 5534, 7564, 2345, 8567, 243,};
        //call to the ifAny method using the numbers array and the search key of 7564
        System.out.println(ifAny(numbers,7564));
    }
    //method to find if any of the key numbers are in the array
    public static boolean ifAny(int[] arr, int key) {
        //for each number in the array
        for (int num : arr) {
            //if the number does not equal the key
            if (num != key){
                //it is not in the array
                return false;
            }
        }
        //otherwise it is in the array
        return true;
    }
}
