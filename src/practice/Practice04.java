package practice;

import java.util.Scanner;

public class Practice04
{
    //write a java program to convert seconds to hours,minutes,and seconds
    public static void main(String[] args) {
        //create Scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to input amount of seconds
        System.out.println("Input the amount of seconds");
        int seconds = input.nextInt();

        //minutes = seconds / 60
        int M = seconds / 60;
        //seconds = remainder of seconds after diving by 60
        int S = seconds % 60;
        //minutes = remainder after minutes divided by 60
        int minutes = M % 60;
        //hours = minutes / 60
        int H = M / 60;
        System.out.println(seconds + " seconds equals " +H+ " hours, " +minutes+ " minutes, " + S + " seconds");

    }
}
