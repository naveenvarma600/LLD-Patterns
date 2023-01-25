package LLD.Concept_And_Coding.L2_Strategy_Pattern.WithStrategyPattern;

import LLD.Concept_And_Coding.L2_Strategy_Pattern.WithStrategyPattern.Strategy.DriveStrategy;


public class Vehicle {
    DriveStrategy driveObject;

    // this is known as constructor injection
    Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }

    public void drive() {
        driveObject.drive();
    }
}
