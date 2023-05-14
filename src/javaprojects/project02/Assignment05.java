package javaprojects.project02;

public class Assignment05 {
    //analyze the following code and guess the output pt.4
    public static void main(String[] args) {
        System.out.println((int)(3.4+1.8));  //5 because it was cast as (int)
        System.out.println((int)3.4+1.8);    //4.8 because only 3.4 was cast to (int) and rounded down to 3 + 1.8
        System.out.println((double)5/2);     //2.5 because 5 is cast to (double) 5.0 / 2
        System.out.println(5/(double)2);     //2.5 still because 2 is cast to (double) 5 / 2.0
        System.out.println((double)(5/2));   //2.0 because 5/2 as an int is 2 and then cast to (double) 2.0
        System.out.println((int)(3/2));      //1 because nothing was cast and the numbers are int by default
    }
}
