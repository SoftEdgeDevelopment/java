package unit06.array.learning25.foreach;
// different foreach example for int and string
public class ForEachExample {
    public static void main(String[] args) {
        // declare and initialize an integer array called arr with values
        int[] arr = {234, 645, 867, 264, 96, 523, 756, 125};
        // start a foreach loop that iterates over each element 'num' in the 'arr' array
        for (int num : arr) {
            // print each element in the array to console
            System.out.println(num);
        }
        // declare and initialize a String array called name with values
        String[] name = {"John", "Eric", "Andre", "Phil"};
        // start a foreach loop that iterates over each element 'person' in the 'name' array
        for (String person : name) {
            // print each element in the array to console
            System.out.println(person);
        }
    }

}
