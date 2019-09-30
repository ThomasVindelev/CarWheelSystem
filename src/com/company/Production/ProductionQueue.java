package com.company.Production;

import com.company.Model.NormalWheel;
import com.company.Model.QualityWheel;
import com.company.Model.Wheel;
import com.company.Model.WinterWheel;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProductionQueue {

    private static volatile Queue<Wheel> wheels = new LinkedList<>();

    public void orderItems(Scanner scanner) {
        System.out.println("1. Normal Wheel   2. Winter Wheel   3. High Quality Wheel");
        String choice = scanner.nextLine();
        if (!choice.equals("exit")) {
            System.out.println("How many wheels do you want?");
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                switch (choice) {
                    case "1":
                        addWheel(new NormalWheel());
                        break;
                    case "2":
                        addWheel(new WinterWheel());
                        break;
                    case "3":
                        addWheel(new QualityWheel());
                        break;
                    default:
                        System.out.println("That's not a valid option!");
                        break;
                }
            }
        }
    }

    private void addWheel(Wheel wheel) {
        wheels.add(wheel);
    }

    public Wheel getNextItem() {
        return wheels.poll();
    }

    public boolean hasItem() {
        return wheels.peek() != null;
    }

    /*private void addToQueue(Wheel wheel, int count) {
        for (int i = 0; i < count; i++) {
            wheels.add(wheel);
        }
    }*/

}
