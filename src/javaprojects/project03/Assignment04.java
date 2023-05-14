package javaprojects.project03;

import java.util.Scanner;
//checks if or else a message contains certain words and prints a statement
public class Assignment04
{
    //Given a String variable with a message (You can declare one). You will check if the
    //message contains any of these bad words: “idiot, dumb, heck”. You should check the variable
    //manually.
    //If the message contains any of those words: print: “Message not sent”.
    //If the message is bad word free: print “Message sent
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);
        //prompt the user to send a message
        System.out.println("Enter your text message");
        //get user input as a string for text message
        String textMessage = input.nextLine();
        //new if statement to check if the message contains profainity
        if (textMessage.contains("idiot")){
            //message will not be sent
            System.out.println("Message not sent");
        }
        //checks again for another bad word
        else if(textMessage.contains("dumb")){
            //message wont send if contains any of these bad words
            System.out.println("Message not sent");
        }
        else if(textMessage.contains("heck")){
            System.out.println("Message not sent");
        }
        //else the message does not contain any bad words
        else{
            System.out.println("Message sent");
        }
    }

}