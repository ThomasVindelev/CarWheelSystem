package com.company.Production;

import com.company.Model.Wheel;
import java.util.ArrayList;
import java.util.List;

public class Factory {

    private List<ConveyorBelt> conveyorBelts = new ArrayList<>();

    public void createWheel(Wheel wheel) {
        for (int i = 0; i < conveyorBelts.size(); i++) {
            if (conveyorBelts.get(i).) {

            } else {

            }
        }
    }

    public Factory() {
        for (int i = 0; i < 4; i++) {
            conveyorBelts.add(new Thread(new ConveyorBelt()));
            conveyorBelts.get(i).start();
        }
    }

}
