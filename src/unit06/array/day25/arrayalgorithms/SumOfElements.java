package unit06.array.day25.arrayalgorithms;
//sum of all the elements in the array and example using extract method
public class SumOfElements {
    public static void main(String[] args) {
        //new int array for numbers
        int[] numbers = {1, 2, 3, 4, 5,};
        //new int for sum starting at 0
        int sum = getSum(numbers);
        //display the total sum
        System.out.println("The total sum of all elements in the array is " + sum);
        //display the average by the sum divided by the total amount of elements in the array (numbers.length)
        System.out.println("The average of the elements is " + getSum(numbers)/ numbers.length);
    }
    //highlight the method, right click - refactor - extract method

    private static int getSum(int[] numbers) {
        int sum = 0;
        //for each element (num) in the array (numbers)
        for (int num : numbers) {
            //add the value of each index to the sum
            sum += num;
            //display the value each time the sum is updated
            System.out.println(sum);
        }
        return sum;
    }


}

