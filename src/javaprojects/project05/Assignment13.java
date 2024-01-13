package javaprojects.project05;

import java.util.Scanner;
//simulate a population in which the user gives the starting population and the population loses half each day
public class Assignment13 {

    public static void main(String[] args) {
        //create Scanner object
        Scanner scanner = new Scanner(System.in);

        //prompt user for the initial amount of inhabitants
        System.out.println("Population Simulation:");
        System.out.println("Enter the initial amount of inhabitants:");
        //declare variable for population
        int inhabitants = scanner.nextInt();

        //call the getInhabitants method to simulate population decline
        getInhabitants(inhabitants);
    }

    //method to simulate population decline using a do-while loop
    public static void getInhabitants(int startingPopulation) {
        //declare variables
        int day = 1;
        int population = startingPopulation;

        //use do-while loop to simulate population decline until no inhabitants left
        do {
            //print the population for the current day
            System.out.println("Day " + day + ": " + population + " inhabitants");

            //calculate the population for the next day (loses half each day)
            population /= 2;

            //increase the day counter to go to the next day
            day++;
        }
        //do this loop while the population is greater than 0
        while (population > 0);
    }
}

