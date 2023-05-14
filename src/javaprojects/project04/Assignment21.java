package javaprojects.project04;

import java.util.Scanner;

//get user inputs for all the information of the laptop and display the total price
public class Assignment21 {

    public static void main(String[] args) { // Defining the main method

        Scanner scanner = new Scanner(System.in);

        String storageType, screenType, cpu; // Declaring three String variables called storageType, screenType, and cpu
        double price = 0, screenSize = 0; // Declaring two double variables called price and screenSize and initializing them to 0
        int ram = 0, memory = 0; // Declaring two integer variables called ram and memory and initializing them to 0

        System.out.print("Enter screen size (in inches): "); // Prompting the user to enter the screen size
        screenSize = scanner.nextDouble(); // Reading the user input for the screen size

        if (screenSize == 13.3) { // If the screen size is 13.3 inches
            price += 200; // Add $200 to the price
        } else if (screenSize == 15.0) { // If the screen size is 15.0 inches
            price += 300; // Add $300 to the price
        } else if (screenSize == 17.3) { // If the screen size is 17.3 inches
            price += 400; // Add $400 to the price
        }

        System.out.print("Enter CPU type (i3, i5, i7): "); // Prompting the user to enter the CPU type
        cpu = scanner.next(); // Reading the user input for the CPU type

        if (cpu.equals("i3")) { // If the CPU type is i3
            price += 150; // Add $150 to the price
        } else if (cpu.equals("i5")) { // If the CPU type is i5
            price += 250; // Add $250 to the price
        } else if (cpu.equals("i7")) { // If the CPU type is i7
            price += 350; // Add $350 to the price
        }

        System.out.print("Enter RAM size (in GB): "); // Prompting the user to enter the RAM size
        ram = scanner.nextInt(); // Reading the user input for the RAM size
        price += (ram / 4) * 50; // Adding the price for the RAM based on the formula (ram/4)*50

        System.out.print("Enter storage type (SSD or HDD): "); // Prompting the user to enter the storage type
        storageType = scanner.next(); // Reading the user input for the storage type

        System.out.print("Enter storage size (in GB): "); // Prompting the user to enter the storage size
        memory = scanner.nextInt(); // Reading the user input for the storage size

        if (storageType.equals("HDD")) { // If the storage type is HDD
            price += (memory / 500) * 50; // Adding the price for the HDD storage based on the formula (memory/500)*50
        } else if (storageType.equals("SSD")) { // If the storage type is SSD
            price += (memory / 500) * 100; // Adding the price for the SSD storage based on the formula (memory/500)*100
        }

        // Ask user for screen resolution
        System.out.print("Enter screen resolution (FULLHD, 4K): ");
        screenType = scanner.next();

        // Calculate price based on screen resolution
        if (screenType.equals("FULLHD")) {
            price += 100;
        } else if (screenType.equals("4K")) {
            price += 200;
        }

        // Display final price to the user
        System.out.println("Laptop price: $" + price);

    }
}
