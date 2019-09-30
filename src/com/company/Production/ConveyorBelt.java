package com.company.Production;

import com.company.Model.Wheel;

public class ConveyorBelt implements Runnable {

    private static final ProductionQueue productionQueue = new ProductionQueue();
    private static ProductionStock productionStock = new ProductionStock();
    private boolean isReady = true;

    @Override
    public void run() throws NullPointerException {
        while (true) {
            if (productionQueue.hasItem()) {
                Wheel wheel = productionQueue.getNextItem();
                System.out.println("1123456789");
                System.out.println(wheel.getProductionTime());
                for (int i = 1; i <= wheel.getProductionTime(); i++) {
                    System.out.println((Math.round((float) i / wheel.getProductionTime())*100) + "%");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("dinjmor");
                    }
                }
                productionStock.addToStock(wheel);
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
