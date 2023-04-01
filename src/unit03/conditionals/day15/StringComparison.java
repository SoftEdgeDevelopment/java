package unit03.conditionals.day15;
//comparing values between strings creating new objects
public class StringComparison {
    public static void main(String[] args) {
        //3 new string variables
        //creates 2 new objects
        String str1 = new String("Java OOP");
        String str2 = new String("Java OOP");
        //the value of str3 to show the same as str1
        String str3 = str1;

        //checks if str1 and str2 are equal strings
        System.out.println(str1.equals(str2)); //true
        //checks if str2 and str3 are the same, never use "==" when checking the value of objects
        System.out.println(str2 == str3); //false because objects have different address values
        //checks if str3 and str1 are the same
        System.out.println(str3 == str1); //true because String str3 was assigned to object str1
        System.out.println(str2 == str1); // false because objects have different address values
    }
}
