package unit06.array.learning24.foreachloop;

// foreach example for int and string
public class ForEachExample {
    public static void main(String[] args) {
        // declare and initialize an integer array called myArr with values 1, 3, 5, 7, 9, 0
        int[] myArr = {1, 3, 5, 7, 9, 0};
        // start a foreach loop that iterates over each element 'num' in the 'myArr' array
        for (int num : myArr) {
            // Print out each element in the array
            System.out.println(num);
        }

        // declare and initialize a string array called names with values "john", "erickson", "billy bob"
        String[] names = {"john", "erickson", "billy bob"};
        // start a foreach loop that iterates over each element 'theNames' in the 'names' array
        for (String theNames : names) {
            // print out each element in the array
            System.out.println(theNames);
        }
    }
}

