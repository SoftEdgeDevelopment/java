package practice;

public class Practice08 {
    public static void main(String[] args) {
        //call to the sum of numbers method,
        // input 1 parameter for the number to count until
        int sum1 = sumOfNumbers(100);
        //will display the count and sum of all numbers 1-100
        System.out.println(sum1);
        int sum2 = sumOfNumbers(4);
        //will display the count and sum of all numbers 1-4
        System.out.println(sum2);
        System.out.println("the sum of all numbers 1-100 is " + sum1);
        //call to the printTheMessage method and give the parameter for the number of times it will be printed
        printTheMessage(3);
        System.out.println("Hello Java printed 3 times");
        //call to the printFirstNNumbers method to print the numbers of a given parameter
        printFirstNNumbers(8);
    }
    //new method to return the sum of numbers
    //with 1 parameter of the count for the number to enter in main
    public static int sumOfNumbers(int number){
        //new int variable for total value
        //starting from 0
        int total = 0;
        //starting from 1, until the number parameter, add 1
        for (int i = 1 ; i <= number ; i ++){
            //to add the sum of all the numbers, total = total + 1
            total = total + i;
            //display the count and the total of the count
            System.out.println(i + " : " +total);
        }
        //return the value of the total to the method
        return total;
    }
    //new method to print the message a certain number of times
    //1 parameter for user to input the number of times the message is printed
    public static void printTheMessage(int number){
        //starting from 0, until the given parameter number, add 1
        for (int i = 1; i <= number; i++){
            //display hello java
            System.out.println("Hello Java");
        }
    }
    //new method to print the first n numbers starting from 1
    public static void printFirstNNumbers(int n){
        //starting from 1 until the given number from int parameter, add 1
        for(int i = 1; i <= n; i++){
            //display the count of the numbers from a given parameter
            System.out.print(" " + i);
        }
    }
}
