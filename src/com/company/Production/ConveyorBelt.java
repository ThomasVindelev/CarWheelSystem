package com.company.Production;

import com.company.Model.Wheel;

public class ConveyorBelt implements Runnable {

    private static final ProductionQueue productionQueue = new ProductionQueue();
    private static ProductionStock productionStock = new ProductionStock();
    private int wheelsProduced = 0;

    @Override
    public void run() {
        Wheel wheel;
        while (true) {
            if (productionQueue.hasItem()) {
                wheel = productionQueue.getNextItem();
                for (int i = 1; i <= wheel.getProductionTime(); i++) {
                    System.out.println(((float) i / wheel.getProductionTime())*100 + "%" + Thread.currentThread());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                productionStock.addToStock(wheel);
                wheelsProduced++;
                reset();
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("An error occured at conveyorbelt");
                }
            }
        }
    }

    public void reset() {
        if (wheelsProduced != 10) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try {
                System.out.println("Cleaning up conveyorbelt");
                Thread.sleep(6000);
                wheelsProduced = 0;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
