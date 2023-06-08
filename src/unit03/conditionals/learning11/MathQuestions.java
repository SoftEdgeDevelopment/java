package unit03.conditionals.learning11;
//practice with math class methods
public class MathQuestions {
    public static void main(String[] args) {
        //new int variables
        int a = 3;
        int b = 2;
        //new variable double for math with decimals
        double result;
        //find the square root of a^3 / the absolute value of a-b
        result = Math.sqrt(Math.pow(a,3)/Math.abs(a-b));
        //display the result
        System.out.println(result);
    }
}
