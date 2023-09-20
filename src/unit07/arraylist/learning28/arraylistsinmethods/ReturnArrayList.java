package unit07.arraylist.learning28.arraylistsinmethods;

import java.util.ArrayList;
import java.util.Scanner;
//get inputs from user and store into an array list
public class ReturnArrayList {
    public static void main(String[] args) {
        //new empty String array list
        ArrayList<String> cities = new ArrayList<>();
        //call to returnFavoriteCities method using cities array list
        returnFavoriteCities(cities);
    }

    //method to get favorite cites from user and store it into an array list
    public static void returnFavoriteCities(ArrayList<String> cities){
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt user to enter cities 1-3
        System.out.println("Enter City 1");
        String userInput;
        //enter the users inputs into the array list
        cities.add( userInput = input.nextLine());
        System.out.println("Enter City 2");
        cities.add( userInput = input.nextLine());
        System.out.println("Enter City 3");
        cities.add( userInput = input.nextLine());
        //display all the cities in the array list
        System.out.println(cities);
    }
}
