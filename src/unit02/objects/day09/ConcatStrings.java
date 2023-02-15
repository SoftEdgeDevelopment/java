package unit02.objects.day09;

public class ConcatStrings {
    public static void main(String[] args) {
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        String address = "Boston";
        address += ", MA";
        System.out.println(address);

        System.out.println("Name: " + fullName + " lives in " + address);

    }
}
