package com.company;

import com.company.Production.Factory;
import com.company.Production.ProductionQueue;
import com.company.Production.ProductionStock;

import java.util.Scanner;

public class GUI {

    private Scanner scanner = new Scanner(System.in);
    private String choice;
    private ProductionQueue productionQueue = new ProductionQueue();
    private ProductionStock productionStock = new ProductionStock();
    private Factory factory = new Factory();

    public void runMenu() {
        while (true) {
            System.out.println("Welcome to the Tire Manufacturer\n" +
                    "1. Make order   " +
                    "2. View stock");
            System.out.println();
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    productionQueue.orderItems(scanner);
                    scanner.nextLine();
                    break;
                case "2":
                    productionStock.viewStock();
                    break;
                case "3":

                    break;

                default:
                    System.out.println("This is not an option");
                    break;
            }
        }
    }

}
