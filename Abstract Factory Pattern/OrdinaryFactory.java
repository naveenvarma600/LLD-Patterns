package LLD.Concept_And_Coding.L5_Abstract_Factory_Pattern;


public class OrdinaryFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicle) {
        switch (vehicle) {
            case "OrdinaryV1":
                return new OrdinaryV1();
            case "OrdinaryV2":
                return new OrdinaryV2();
            default:
                return null;
        }
    }
}
