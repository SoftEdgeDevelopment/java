package javaprojects.project04;


import java.util.Scanner;
//gets user input for year of car and checks if it needs to be recalled, else the car is fine
public class Assignment11 {
    public static void main(String[] args) {
        //scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to input the year of the car
        System.out.println("Enter the year of your car");
        //create new variable to store user input
        int carYear = input.nextInt();
        //checks if the year is from 1995-1998, 2001-2002, 2004-2006 and 2015-2017
        if (carYear >= 1995 && carYear <= 1998 ){
            System.out.println("Vehicle Problem, needs to be recalled");}
        else if (carYear >= 2001 && carYear <= 2002 ){
            System.out.println("Vehicle Problem, needs to be recalled");}
        //displays if the vehicle needs to be recalled or fine
        else if (carYear >= 2004 && carYear <= 2006){
            System.out.println("Vehicle Problem, needs to be recalled");}
        else if (carYear >= 2015 && carYear <= 2017 ){
            System.out.println("Vehicle Problem, needs to be recalled");}
        else {
            System.out.println("There are no issues with your car");
        }
    }
}