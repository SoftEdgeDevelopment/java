package javaprojects.project02;

public class Assignment07 {
    //analyze the following code and guess the output pt.6
    public static void main(String[] args) {
        int num1 = 1; //value of num1
        int num2 = 2; //value of num2
        System.out.println("num1: " + num1); //prints 1
        System.out.println("num2: " + num2); //prints 2
        //num1 = num2;      //num1 will become 2
        //num2 = num1;      //num2 will become 2
        int temp = num1;    //value of temp is num1 (either 1 or 2 based on if above statement is included)
        num1 = num2;  //num1 will be 2
        num2 = temp;  //num2 will be 2
        System.out.println("num1: " + num1); //will print the value of num1=num2 which is 2
        System.out.println("num2: " + num2); //will print the value of num2=temp=num1=num2 which is 2 unless //num1 = num2 above
    }
}
