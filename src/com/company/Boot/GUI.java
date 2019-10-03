package com.company.Boot;

import com.company.Production.Factory;

import java.util.Scanner;

public class GUI {

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        Factory factory = new Factory();
        String choice;
        while (true) {
            System.out.println("Welcome to the Tire Manufacturer\n" +
                    "1. Make order   " +
                    "2. View stock");
            System.out.println();
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    factory.orderItems(scanner);
                    break;
                case "2":
                    factory.viewStock();
                    break;
                default:
                    System.out.println("This is not an option");
                    break;
            }
        }
    }
}