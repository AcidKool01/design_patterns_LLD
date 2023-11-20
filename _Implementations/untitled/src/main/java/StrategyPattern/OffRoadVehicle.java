package StrategyPattern;

import StrategyPattern.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    // passing the object to the parent class constructor.
    public OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
