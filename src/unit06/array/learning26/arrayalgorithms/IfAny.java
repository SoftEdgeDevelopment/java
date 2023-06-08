package unit06.array.learning26.arrayalgorithms;
//method to check if any of the elements are in the array
public class IfAny {
    public static void main(String[] args) {
        //new int array for numbers
        int[] numbers = {1,3,5,7,9,};
        //using the findAny method calling to the numbers array, check to see if 2 is in the array
        System.out.println(findAny(numbers,2));
        //using the findAny method calling to the numbers array, check to see if 3 is in the array
        System.out.println(findAny(numbers,3));
    }
    //new boolean method true or false if any of the keys are in the array
    public static boolean findAny(int[] arr, int key) {
//        //foreach element in the array
//        for (int num : arr) {
//            //if num equals key
//            if(num == key){
//                //true - the element was found
//                return true;
//            }
//        }


        //another way to write it with fori loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return true;
            }
        }
        //false - the element does not exist
        return false;
    }
}
