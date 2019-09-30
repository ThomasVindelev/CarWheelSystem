package com.company.Production;

import com.company.Model.Wheel;

import java.util.ArrayList;
import java.util.List;

public class ProductionStock {

    private static List<Wheel> wheelStock = new ArrayList<>();

    public void addToStock(Wheel wheel) {
        wheelStock.add(wheel);
    }

}
