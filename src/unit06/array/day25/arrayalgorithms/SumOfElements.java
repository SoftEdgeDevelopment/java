package unit06.array.day25.arrayalgorithms;
//sum of all the elements in the array
public class SumOfElements {
    public static void main(String[] args) {
        //new int array for numbers
        int[] numbers = {1, 2, 3, 4, 5,};
        //new int for sum starting at 0
        int sum = 0;
        //for each element (num) in the array (numbers)
        for (int num : numbers) {
            //add the value of each index to the sum
            sum += num;
            //display the value each time the sum is updated
            System.out.println(sum);
        }
        //display the total sum
        System.out.println("The total sum of all elements in the array is " + sum);
    }




}

