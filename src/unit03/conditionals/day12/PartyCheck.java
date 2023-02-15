package unit03.conditionals.day12;

import java.util.Scanner;

public class PartyCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();

        boolean canGoToParty;

        canGoToParty = age >= 18;

        System.out.println("Can go to party: " + canGoToParty);
    }
}
