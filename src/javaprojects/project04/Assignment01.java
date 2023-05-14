package javaprojects.project04;

import java.util.Scanner;

//write a program to display remaining gift card balance after a purchase, or tell the user they do not have enough, or invalid entry if incorrect item choice was picked
public class Assignment01
{
    public static void main(String[] args) {
        //new variable for starting gift card balance
        int balance = 100;
        //new variables for all the items for sale
        int smartPhone = 300;
        int laptop = 400;
        int charger = 15;
        int usbCable = 10;
        int headphones = 30;
        int pants = 50;
        int hat = 25;
        int socks = 5;
        int blanket = 60;
        int pillow = 40;
        //prompt the user to purchase an item
        System.out.println("Which item would you like to purchase?");
        System.out.println("Smartphone - $300");
        System.out.println("Laptop - $400");
        System.out.println("Charger - $15");
        System.out.println("USB Cable - $10");
        System.out.println("Headphones - $30");
        System.out.println("Pants - $50");
        System.out.println("Hat - $25");
        System.out.println("Socks - 5$");
        System.out.println("Blanket - $60");
        System.out.println("Pillow - $40");
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //new string to store the user input for item purchased
        String itemPurchased = input.nextLine();
        //checks if the user input equals any of the available choices, and if they have enough money
        //if they have enough for the purchase it will tell them the remaining amount
        while(itemPurchased.equals("Smartphone")){
            if(balance > smartPhone){
                System.out.println("The remaining balance is $" + (balance - smartPhone));
                break;
            }
            else {
                System.out.println("You do not have enough");
                break;
            }
        }
        while(itemPurchased.equals("Laptop")){
            if(balance > laptop){
                System.out.println("The remaining balance is $" + (balance - laptop));
                break;
            }
            else {
                System.out.println("You do not have enough");
                break;
            }
        }
        while(itemPurchased.equals("Charger")){
            if(balance > charger){
                System.out.println("The remaining balance is $" + (balance - charger));
                break;
            }
            else {
                System.out.println("You do not have enough");
                break;
            }
        }
        while(itemPurchased.equals("USB Cable")){
            if(balance > usbCable){
                System.out.println("The remaining balance is $" + (balance - usbCable));
                break;
            }
            else {
                System.out.println("You do not have enough");
                break;
            }
        }
        while(itemPurchased.equals("Headphones")){
            if(balance > headphones){
                System.out.println("The remaining balance is $" + (balance - headphones));
                break;
            }
            else {
                System.out.println("You do not have enough");
                break;
            }
        }
        while(itemPurchased.equals("Pants")){
            if(balance >pants){
                System.out.println("The remaining balance is $" + (balance - pants));
                break;
            }
            else {
                System.out.println("You do not have enough");
                break;
            }
        }
        while(itemPurchased.equals("Hat")){
            if(balance > hat){
                System.out.println("The remaining balance is $" + (balance - hat));
                break;
            }
            else {
                System.out.println("You do not have enough");
                break;
            }
        }
        while(itemPurchased.equals("Socks")){
            if(balance > socks){
                System.out.println("The remaining balance is $" + (balance - socks));
                break;
            }
            else {
                System.out.println("You do not have enough");
                break;
            }
        }
        while(itemPurchased.equals("Blanket")){
            if(balance > blanket){
                System.out.println("The remaining balance is $" + (balance - blanket));
                break;
            }
            else {
                System.out.println("You do not have enough");
                break;
            }
        }
        while(itemPurchased.equals("Pillow")){
            if(balance > pillow){
                System.out.println("The remaining balance is $" + (balance - pillow));
                break;
            }
            else {
                System.out.println("You do not have enough");
                break;
            }
        }
        //if the item purchased does not equal any of the items listed
        if(!itemPurchased.contains("Smartphone") && !itemPurchased.contains("Laptop") && !itemPurchased.contains("Charger")
                && !itemPurchased.contains("USB Cable") && !itemPurchased.contains("Headphones") && !itemPurchased.contains("Pants")
                && !itemPurchased.contains("Hat") && !itemPurchased.contains("Socks") && !itemPurchased.contains("Blanket") && !itemPurchased.contains("Pillow")){
            //display invalid
            System.out.println("Invalid Entry");
        }
    }
}
