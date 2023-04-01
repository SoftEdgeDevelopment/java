package unit03.conditionals.day14;
//if else example using and
public class MonthValidation {
    public static void main(String[] args) {
        //new int variable for the number month of the year
        int month = 15;
        //if month is greater than or equal to 1 and less than or equal to 12
        if (month >= 1 && month <= 12) {
            //display the month and if it is valid
            System.out.println(month + ": Valid month entry");
        } else {
            //else the month is not valid
            System.out.println(month + ": Invalid month entry");
        }
    }
}
