package StrategyPattern;

import StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    // Strategy Design Pattern
    DriveStrategy driveObject;

    // constructor injection
    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }
    public void drive() {
        driveObject.drive();
    }
}
