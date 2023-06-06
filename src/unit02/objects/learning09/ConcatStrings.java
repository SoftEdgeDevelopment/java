package unit02.objects.learning09;

public class ConcatStrings {
    public static void main(String[] args) {
        //new String for first name
        String firstName = "John ";
        //new String for last name
        String lastName = "Doe";
        //new String for full name - add the variables of first and last name
        String fullName = firstName + lastName;
        //print out the full name
        System.out.println(fullName);

        //new String for address
        String address = "Boston";
        //value of String address is updated +=
        address += ", MA";
        //will print out the value of address with the new values added
        System.out.println(address);

        //will print out the value of full name (firstName + lastName) and the value of address (address += ", MA")
        System.out.println("Name: " + fullName + " lives in " + address);

    }
}
