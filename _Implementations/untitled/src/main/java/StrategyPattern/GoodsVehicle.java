package StrategyPattern;

import StrategyPattern.Strategy.GoodsDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new GoodsDriveStrategy());
    }

    @Override
    public void drive() {
        System.out.println("Additional Goods vehicle Capability");
    }
}
