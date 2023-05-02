package unit04.iteration.day19;
//inner and outer loop to decrease the amount of stars shown
public class DecreasingStars {
    public static void main(String[] args) {
        //outer loop from 5 until 1, subtract 1
        for(int i = 5; i > 0; i--){
            //inner loop starting from 0 until the value of i, add 1
            for(int j = 0; j < i; j++){
                //print out the stars for rows and columns
                System.out.print("* ");
            }
            //new line to add the stars to each row
            System.out.println();
        }
    }
}
