package unit01.primitive.types.day02;

public class SwapValues {

    public static void main(String[] args) {
        /*
         * swap the values
         * give num1 value to num2
         * num2 value to num1
         * then print the updated values
         * */
        int num1 = 7;
        int num2 = 9;

        int tempNumber=num1; //temp = 7
        num1 = num2; //num2 = 9 and num1 = 9
        num2 = tempNumber; //num2 = 7
        System.out.println(num1);
        System.out.println(num2);
    }
}
