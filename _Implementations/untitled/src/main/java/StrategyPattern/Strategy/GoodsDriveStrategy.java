package StrategyPattern.Strategy;

public class GoodsDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Goods Drive Strategy");
    }
}

