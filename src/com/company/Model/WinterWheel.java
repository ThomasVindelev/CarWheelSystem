package com.company.Model;

public class WinterWheel implements Wheel{

    private int productionTime = 10;
    private String name = "Winter Wheel";

    @Override
    public int getProductionTime() {
        return productionTime;
    }

}