package com.company.Model;

public class NormalWheel implements Wheel {

    private int productionTime = 10;
    private String name = "Normal Wheel";

    @Override
    public int getProductionTime() {
        return productionTime;
    }

}