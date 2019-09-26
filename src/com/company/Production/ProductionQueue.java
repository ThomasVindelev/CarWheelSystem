package com.company.Production;

import com.company.Model.Wheel;

import java.util.LinkedList;
import java.util.Queue;

public class ProductionQueue {

    private static volatile Queue<Wheel> wheels = new LinkedList<>();

    public void queueItem(Wheel wheel) {
        wheels.add(wheel);
    }

    public Wheel getNextItem() {
        return wheels.poll();
    }

    public boolean hasItem() {
        return wheels.peek() != null;
    }

}
