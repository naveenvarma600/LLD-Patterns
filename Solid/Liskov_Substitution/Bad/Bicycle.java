package LLD.Concept_And_Coding.L1_Solid.Liskov_Substitution.Bad;


public class Bicycle implements Bike {
    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    @Override
    public void accelerate() {

    }
}
