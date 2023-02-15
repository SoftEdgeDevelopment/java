package unit04.iteration.day18;

import java.util.Scanner;

public class PrimeMsNebahat {
    public static void main(String[] args) {
        isPrime();
    }

    public static boolean isPrime(){
        Scanner scan=new Scanner(System.in);
        System.out.println("input a number: ");
        int number= scan.nextInt();
        boolean isPrime = true;
        int count=0;
        for (int i =1; i <=number; i++) {
            if(number%i==0) {
                count++;
            }
        }
        if (count>2){
            System.out.println("it is not prime");
            isPrime=false;
        }else{
            System.out.println("it is prime");
            isPrime=true;
        }
        return isPrime;

    }

}
