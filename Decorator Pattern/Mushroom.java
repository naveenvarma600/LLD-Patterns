package LLD.Concept_And_Coding.L4_Decorator_Pattern;


public class Mushroom extends ToppingDecorator {

    // has-A relationship
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
