package LLD.Concept_And_Coding.L5_Abstract_Factory_Pattern;

public class LuxuryFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicle) {
        switch (vehicle) {
            case "LuxuryV1":
                return new LuxuryV1();
            case "LuxuryV2":
                return new LuxuryV2();
            default:
                return null;
        }
    }
}
