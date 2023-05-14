package javaprojects.project03;

public class Assignment10 {
    // Given a String in the following format:
    //“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
    //Separate these parts and print them separately:
    //Sender: actualSender
    //Number: actualNumber
    //Message: actualMessage
    public static void main(String[] args) {
        String input = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}";
        // Extract the sender from the input string
        //get the start index location
        int senderStartIndex = input.indexOf("<") + 1;
        //get the end index location
        int senderEndIndex = input.indexOf(">");
        //actualSender = value of start index - end index
        String actualSender = input.substring(senderStartIndex, senderEndIndex);

        // Extract the number from the input string
        //get the start index location
        int numberStartIndex = input.indexOf("[") + 1;
        //get the end index location
        int numberEndIndex = input.indexOf("]");
        //actualNumber  = value of start index - end index
        String actualNumber = input.substring(numberStartIndex, numberEndIndex);

        // Extract the message from the input string
        //get the start index location
        int messageStartIndex = input.indexOf("{") + 1;
        //get the end index location
        int messageEndIndex = input.indexOf("}");
        // actualMessage = value of start index - end index
        String actualMessage = input.substring(messageStartIndex, messageEndIndex);

        // Print the extracted parts
        System.out.println("Sender: " + actualSender);
        System.out.println("Number: " + actualNumber);
        System.out.println("Message: " + actualMessage);
    }
}
