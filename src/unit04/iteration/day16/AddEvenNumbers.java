package unit04.iteration.day16;
//while loop for a counter to find the sum of the even numbers until a certain amount
public class AddEvenNumbers {
    public static void main(String[] args) {
        //new variables for total starting at 0 and counter starting at 2 to find even numbers
        int total = 0;
        int counter = 2;
        //while counter is less than or equal to 10
        while(counter <= 10){
            //add the value of the counter to the total each time
            total += counter;
            //increase the value of the counter by 2 to get even numbers
            counter = counter + 2;
            //display the value of the total
            System.out.println(total);
        }
    }
}
