package com.company.Production;
import com.company.Model.NormalWheel;
import com.company.Model.QualityWheel;
import com.company.Model.Wheel;
import com.company.Model.WinterWheel;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Factory {

    private static final int MAX_CONVEYORS = 4;
    private static ProductionStock productionStock = new ProductionStock();
    private ProductionQueue productionQueue = new ProductionQueue();
    private ExecutorService pool = Executors.newFixedThreadPool(MAX_CONVEYORS);

    public Factory() {
        Runnable conveyor1 = new ConveyorBelt();
        Runnable conveyor2 = new ConveyorBelt();
        Runnable conveyor3 = new ConveyorBelt();
        Runnable conveyor4 = new ConveyorBelt();
        pool.execute(conveyor1);
        pool.execute(conveyor2);
        pool.execute(conveyor3);
        pool.execute(conveyor4);
    }

    public void orderItems(Scanner scanner) {
        System.out.println("1. Normal Wheel   2. Winter Wheel   3. High Quality Wheel");
        String choice = scanner.nextLine();
        if (!choice.equals("exit")) {
            System.out.println("How many wheels do you want?");
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                switch (choice) {
                    case "1":
                        productionQueue.addWheel(new NormalWheel());
                        break;
                    case "2":
                        productionQueue.addWheel(new WinterWheel());
                        break;
                    case "3":
                        productionQueue.addWheel(new QualityWheel());
                        break;
                    default:
                        System.out.println("That's not a valid option!");
                        break;
                }
            }
        }
    }

    public void viewStock() {
        productionStock.viewStock();
    }

}
