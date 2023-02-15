package unit04.iteration.day17;

public class SumNumbersMethod {
    public static void main(String[] args) {
//        Turn it into a method to
//        return the sum of numbers
//        starting from 1 to the given parameter value.
//        public static int sumOfNumbers(int number)
//        int sum = sumOfNumbers(3);
//        System.out.println(sum);
//        sum = sumOfNumbers(5);
//        System.out.println(sum);
//        System.out.println(sumOfNumbers(10));
        printFirstNNumbers(33);
        printHelloJavaNTimes(3);
        System.out.println("Calling sumofnumbers method with 5");
        System.out.println("result of 5 numbers addition is " + sumOfNumbers(5));
    }

    public static int sumOfNumbers(int number) {
        int total = 0;
        for (int i = 1; i <= number; i++) {
            total = total + i;
        }
        return total;
    }

    public static void printHelloJavaNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello Java");
        }
    }

    //    print the first n numbers starting from 1
    public static void printFirstNNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
