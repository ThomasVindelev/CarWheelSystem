package com.company.Production;

import com.company.Model.NormalWheel;
import com.company.Model.Wheel;
import com.company.Model.WinterWheel;

import java.util.ArrayList;
import java.util.List;

public class ProductionStock {

    private static List<Wheel> wheelStock = new ArrayList<>();

    public void addToStock(Wheel wheel) {
        wheelStock.add(wheel);
    }

    public void viewStock() {
        int normal = 0;
        int winter = 0;
        int quality = 0;
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
