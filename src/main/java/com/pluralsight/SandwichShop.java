package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Exercise 1

        //Set the variables for the base price
        double basePrice = 0.00;
        double discount = 0.00;

        //Prompt the user for the size of the sandwich (1 or 2)
        System.out.println("Please decide which size you would want your sandwich to be: 1 or 2");
        System.out.println("1: Regular Sandwich - $5.45");
        System.out.println("2: Large Sandwich - $8.95");

        System.out.println("Enter your choice (1 or 2)");
        short size = scanner.nextShort();

        scanner.nextLine();

        //Create conditionals for the 2 sandwich size prices

        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else System.out.println("Invalid Option, Try again");

        //Determine if the user is a student or senior
        System.out.println("Are you a student (17 or under), senior (65 or older), or neither?");

        //Create conditionals to add discounts
        String status = scanner.nextLine().toLowerCase();
        if (status.equals("student")) {
            discount = 0.9;
        } else if (status.equals("senior")) {
            discount = 0.8;
        } else discount = 1.0;

        //Print out result
        System.out.printf("The total cost of your sandwich is: $%.2f", (basePrice * discount));



    }

}
