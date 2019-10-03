package com.company.Production;

import com.company.Model.NormalWheel;
import com.company.Model.Wheel;
import com.company.Model.WinterWheel;

import java.util.ArrayList;
import java.util.List;

public class ProductionStock {

    private static List<Wheel> wheelStock = new ArrayList<>();
    private int normal = 0;
    private int winter = 0;
    private int quality = 0;

    public synchronized void addToStock(Wheel wheel) {
        wheelStock.add(wheel);
    }

    public void viewStock() {
        for (Wheel wheel : wheelStock) {
            if (wheel instanceof NormalWheel) {
                normal++;
            } else if (wheel instanceof WinterWheel) {
                winter++;
            } else {
                quality++;
            }
        }
        System.out.println("Normal: " + normal + " Winter: " + winter + " Quality: " + quality);
    }
}
