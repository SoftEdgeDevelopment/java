package unit06.array.learning26.arrayalgorithms;
//method to see if there are duplicates of the element contained in the array
public class FindDuplicates {
    public static void main(String[] args) {
        //new int array for numbers
        int[] numbers = {1, 3, 2, 3, 5, 7, 9, 11};
        //calling to the findDuplicates method using numbers array for the search key 3
        System.out.println("Duplicates : " + findDuplicates(numbers, 3));
    }

    //new boolean method true or false to find if there are 2 of the same contained in the array
    public static boolean findDuplicates(int[] arr, int key) {
        //new counter starting for 0 for the amount contained in the array
        int counter = 0;
        //for each element in the array
        for (int num : arr) {
            //if the number in the array equals the search key
            if (num == key) {
                //increase the counter by 1
                counter++;
                //if the counter is more than 1
                if (counter > 1) {
                    //return true because there are duplicates
                    return true;
                }
            }
        }
        //return false when there are no duplicates
        return false;
    }
}
