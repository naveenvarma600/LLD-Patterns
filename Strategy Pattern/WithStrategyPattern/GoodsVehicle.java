package LLD.Concept_And_Coding.L2_Strategy_Pattern.WithStrategyPattern;

import LLD.Concept_And_Coding.L2_Strategy_Pattern.WithStrategyPattern.Strategy.NormalDriveStrategy;


public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
