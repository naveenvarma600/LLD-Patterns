package LLD.Concept_And_Coding.L2_Strategy_Pattern.WithStrategyPattern;

import LLD.Concept_And_Coding.L2_Strategy_Pattern.WithStrategyPattern.Strategy.SportsDriveStrategy;


public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
