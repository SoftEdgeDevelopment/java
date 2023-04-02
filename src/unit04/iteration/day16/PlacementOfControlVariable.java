package unit04.iteration.day16;
//error example why placement of control variables is important
public class PlacementOfControlVariable {
    public static void main(String[] args) {
        //counter starts at 0
        int counter = 0;
        //while counter is less than or equal to 5, counter ++ and display the output of the counter
        while(counter <= 5){
            counter++;
            //will skip printing 0 because the counter was initiated first, and now the count will be from 1-5
            System.out.println(counter);
        }
    }
}
