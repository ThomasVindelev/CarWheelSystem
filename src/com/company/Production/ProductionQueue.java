package com.company.Production;

import com.company.Model.Wheel;
import java.util.LinkedList;
import java.util.Queue;

public class ProductionQueue {

    private static volatile Queue<Wheel> wheels = new LinkedList<>();

    public void addWheel(Wheel wheel) {
        wheels.add(wheel);
    }

    public synchronized Wheel getNextItem() {
        return wheels.poll();
    }

    public synchronized boolean hasItem() {
        return wheels.peek() != null;
    }

}
