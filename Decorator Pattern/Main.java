package LLD.Concept_And_Coding.L4_Decorator_Pattern;


public class Main {
    public static void main(String[] args) {
        // Margherita + ExtraCheese + Mushroom
        BasePizza basePizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(basePizza.cost());
    }
}
