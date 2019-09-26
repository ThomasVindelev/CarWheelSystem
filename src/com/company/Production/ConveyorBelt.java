package com.company.Production;

import com.company.Model.Wheel;

public class ConveyorBelt implements Runnable {

    private static ProductionQueue productionQueue;
    private boolean isReady = true;

    @Override
    public void run() {
        while (true) {
            if (productionQueue.hasItem()) {

                Wheel wheel = productionQueue.getNextItem();
                for (int i = 0; i <= wheel.getProductionTime(); i++) {
                    System.out.println(wheel.getProductionTime() / i + "%");
                }
            } else {
                try {
                    Thread.sleep(1000);
                    isReady = true;
                } catch (InterruptedException e) {
                    System.out.println("An error occured at conveyorbelt");
                }
            }
        }
    }

    public boolean isReady() {
        return isReady;
    }
}
