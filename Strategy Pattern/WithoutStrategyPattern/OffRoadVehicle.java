package LLD.Concept_And_Coding.L2_Strategy_Pattern.WithoutStrategyPattern;


public class OffRoadVehicle extends Vehicle {
    @Override
    // same capability of SportsVehicle, hence duplicating the code
    public void drive() {
        System.out.println("Sports Drive capability");
    }
}
