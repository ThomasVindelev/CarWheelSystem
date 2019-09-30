package com.company.Production;

import com.company.Model.Wheel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Factory {

    private static final int MAX_CONVEYORS = 4;
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

}
