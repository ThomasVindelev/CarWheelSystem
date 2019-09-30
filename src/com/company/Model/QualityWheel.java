package com.company.Model;

public class QualityWheel implements Wheel {

    private int productionTime = 17;
    private String name = "High Quality Wheel";

    @Override
    public int getProductionTime() {
        return productionTime;
    }

    public String getName() {
        return name;
    }

}