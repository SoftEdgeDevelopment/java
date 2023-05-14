package javaprojects.project03;

public class Assignment09 {
    //given two full names check if the two people are related. they will be considered to be
    //related if they have the same last name
    public static void main(String[] args) {
        //2 strings for peoples names
        String fullName1 = "James Bond";
        String fullName2 = "Jamie Bond";

        //call to the extractLastName method
        // Extract the last names from the full names
        String lastName1 = extractLastName(fullName1);
        String lastName2 = extractLastName(fullName2);

        // Compare the last names to determine if the people are related
        if (lastName1.equals(lastName2)) {
            System.out.println("Related");
        } else {
            System.out.println("Not Related");
        }
    }
    // method to get the value of the last name with 1 parameter as String for full name
    public static String extractLastName(String fullName) {
        //find where the first name ends, index of the space
        int spaceIndex = fullName.indexOf(" ");
        //to get the last name, display substring starting from space index plus 1, no need for end index because it will be the end of the string
        String lastName = fullName.substring(spaceIndex + 1);
        //return the value of the last name to the method
        return lastName;
    }
}
