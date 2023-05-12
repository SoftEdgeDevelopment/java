package practice;

import java.util.Scanner;

//for loop to check if a number is prime
public class Practice11 {

    public static void main(String[] args) {
        //call to the isPrime method
        isPrime();
    }
    //new boolean method isPrime to see if a number is prime or not
    public static boolean isPrime(){
        //new scanner for user input
        Scanner scan=new Scanner(System.in);
        //prompt user to input a number
        System.out.println("input a number: ");
        //get user input for int variable number
        int number= scan.nextInt();
        //boolean to check if a number is prime or not
        boolean isPrime;
        int count=0;
        //starting from, until the user input number, add 1
        for (int i =1; i <=number; i++) {
            //if the number after being divided by the number has no remaining
            if(number%i==0) {
                //increase count by 1
                count++;
            }
        }
        //if the count goes more than 2
        if (count>2){
            //the number is not prime
            System.out.println("it is not prime");
            isPrime=false;
        }else{
            //else the number is prime
            System.out.println("it is prime");
            isPrime=true;
        }
        return isPrime;

    }
}
