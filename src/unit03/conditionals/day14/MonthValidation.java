package unit03.conditionals.day14;

public class MonthValidation {
    public static void main(String[] args) {
        int month = 15;
        if (month >= 1 && month <= 12) {
            System.out.println(month + ": Valid month entry");
        } else {
            System.out.println(month + ": Invalid month entry");
        }
    }
}
