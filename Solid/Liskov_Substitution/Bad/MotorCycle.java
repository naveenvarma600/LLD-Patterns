package LLD.Concept_And_Coding.L1_Solid.Liskov_Substitution.Bad;


public class MotorCycle implements Bike {

    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed += 10;
    }
}
