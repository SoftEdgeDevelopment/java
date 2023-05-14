package javaprojects.project02;

public class Assignment03 {
    //analyze the following code and guess the output pt.2
    public static void main(String[] args) {
        int x = 5;
        x++;      //5 + 1
        System.out.println(x);    //printing 5
        x = 5;
        ++x;      //same as 5 + 1
        System.out.println(x);    //printing 5
        x = 5;
        System.out.println(x++);  //printing 5 + 1 but will still be 5 because it didnt add in yet
        System.out.println(x);    //printing 6 because it will add from above statement
        x = 5;
        System.out.println(++x);  //same thing as 1 + 5 because it adds before showing x(5)
        System.out.println(x);    //will be 6 because ++ before in above statement
        //result returned by var++ is the value of the variable before incrementing,
        //whereas the result returned by ++var is the value of the variable after the increment is applied
    }
}
