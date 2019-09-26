package com.company;

import java.util.Scanner;

public class GUI {

    private Scanner scanner = new Scanner(System.in);
    private String choice;

    public void runMenu() {
        System.out.println("Welcome to the Tire Manufacturer\n" +
                "1. Make order   " +
                "2. ");
        System.out.println();
        choice = scanner.nextLine();
        switch (choice) {
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;

            default:
                System.out.println("This is not an option");
                break;
        }
    }

}
