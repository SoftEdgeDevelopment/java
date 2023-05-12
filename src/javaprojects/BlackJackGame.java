package javaprojects;

import java.util.Random;
import java.util.Scanner;
//blackjack game program
public class BlackJackGame {
    //randomizer for cards 1-11
    //shuffling for deck after 52 cards are used
    //keep track of player dealer card count
    //compare hands
    //betting and balance
    public static void main(String[] args) {
        //new scanner object to get user input
        Scanner input = new Scanner(System.in);
        //new variables for player and dealer card total
        int playerCards = 0;
        int dealerCards = 0;
        //new variable to get user answer for hit or stand
        String playerAnswer;
        //first give the player 2 cards and the dealer 1 card showing
        playerCards += dealCard(new Random());
        dealerCards += dealCard(new Random());
        playerCards += dealCard(new Random());
        //display the player and dealer cards
        System.out.println("Your cards are : " + playerCards);
        System.out.println("Dealer cards are : " + dealerCards);
        //while the player cards are less than or equal to 21
        if(playerCards == 21){
            if (dealerCards == 21 && playerCards == 21)
            {
                System.out.println("Both player and Dealer have BLACKJACK, Push");
                return;
            }
            System.out.println("You have BLACKJACK!");
            return;
        }
        if (dealerCards == 21){
            if (dealerCards == 21 && playerCards == 21)
            {
                System.out.println("Both player and Dealer have BLACKJACK, Push");
                return;
            }
            System.out.println("YOU LOST! DEALER BLACKJACK!");
            return;
        }
        while (playerCards <= 21) {
            //if the players cards are less than 21
            if (playerCards < 21) {
                //prompt the user to hit or stand
                System.out.println("(H) - Hit or (S) - Stand?");
                //store the users answer as playerAnswer using the scanner
                playerAnswer = input.nextLine();
                //if the players answer = h
                if (playerAnswer.equalsIgnoreCase("h")) {
                    //the player hits and gets another random card
                    playerCards += dealCard(new Random());
                    //display the players cards
                    System.out.println("Your cards are : " + playerCards);
                    //if player cards are more than 21
                    if (playerCards > 21) {
                        //the player loses automatically
                        System.out.println("You bust, dealer wins");
                        //the code ends
                        return;
                        //else if the player cards is 21
                    } else if (playerCards == 21) {
                        //the player wins
                        System.out.println("YOU HAVE 21!");
                        break;
                    }
                    //if the players answer = s
                } else if (playerAnswer.equalsIgnoreCase("s")) {
                    //display the player cards
                    System.out.println("Your cards are : " + playerCards);
                    //give the dealer 1 more card
                    dealerCards += dealCard(new Random());
                    //display the dealers cards after player standing
                    System.out.println("Dealer cards are : " + dealerCards);
                    //break to end the while loop and move to the next code
                    break;
                }
            }
        }
        //while dealer cards are less than 17
        while (dealerCards < 17) {
            //give the dealer a random card
            dealerCards += dealCard(new Random());
            //if card is more than 21
            if (dealerCards > 21) {
                //display dealer cards
                System.out.println("Dealer cards are : " + dealerCards);
                //dealer busts
                System.out.println("Dealer Busts, you win");
                //return to close while loop and end the program
                return;
            }
            //display the dealers cards after drawing because their cards are less than 17
            System.out.println("Dealer cards are : " + dealerCards);
        }
        //if player cards is more than the dealers cards
        if (playerCards > dealerCards){
            //player wins
            System.out.println("You Win");
        }
        //else if the player and dealers cards are equal
        else if (playerCards == dealerCards){
            //it is a push
            System.out.println("Push");
        }
        //else the dealers cards are greater than the players cards
        else {
            //the dealer wins
            System.out.println("Dealer wins");
        }
    }


    //new static method to be called to the main with 1 Random parameter for a random number
    public static int dealCard(Random random){
        //assigns random value to card from 1-10
        int card = random.nextInt(10)+1;
        //if the card is not 1-9
        if(card > 9){
            //the card is a 10 or face
            card = 10;
        }
        //return the value of card to the dealCard method
        return card;
    }
}

