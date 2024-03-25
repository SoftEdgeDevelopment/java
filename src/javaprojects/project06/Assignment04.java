package javaprojects.project06;

import java.util.Scanner;

//method to read HTML input, and output the value of the id attribute of any tag

public class Assignment04 {

    //method to extract the value of the id attribute from HTML input
    public static String getId(String html) {
        int startIndex = html.indexOf("id=");
        if (startIndex == -1) {
            //if id attribute is not found
            System.out.println("Invalid input!");
            return null;
        }

        //extract the id attribute value
        int valueStartIndex = html.indexOf("\"", startIndex) + 1;
        int valueEndIndex = html.indexOf("\"", valueStartIndex);
        return html.substring(valueStartIndex, valueEndIndex);
    }

    public static void main(String[] args) {
        //declare variables
        String html;
        Scanner scanner = new Scanner(System.in);

        //prompt user for input
        System.out.println("Enter the HTML input: ");
        html = scanner.nextLine();

        //call getId method and print result
        String id = getId(html);
        if (id != null) {
            System.out.println(id);
        }
        //close scanner
        scanner.close();
    }
}

