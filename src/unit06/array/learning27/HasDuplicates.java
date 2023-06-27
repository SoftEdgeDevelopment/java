package unit06.array.learning27;
//method to check if an array has any duplicates in it
public class HasDuplicates {
    public static void main(String[] args) {
        //array created with duplicated number
        int[] numbers = {1, 1, 2, 3, 4, 5, 6};

        //call to the hasDuplicates method to check if the numbers array has any duplicate numbers
        System.out.println(hasDuplicates(numbers));
    }

    public static boolean hasDuplicates(int[] arr) {
        //starting from the first index until 1 before the last, check the neck index
        //for (int i = 0; i < arr.length - 1; i++)        this also works
        for (int i = 0; i < arr.length; i++) {
            //using the array, starting from position index 1, until the length of the array
            for (int j = i + 1; j < arr.length; j++) {
                //check if the values are the same from index i (0) and j (1) and keep checking each index until the end of the array
                if (arr[i] == arr[j]) {
                    //return true if the values match
                    return true;
                }
            }
        }
        //return false if there are no duplicates
        return false;
    }
}
