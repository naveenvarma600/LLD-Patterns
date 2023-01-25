package LLD.Concept_And_Coding.L5_Factory_Pattern;


public class ShapeFactory {
    Shape getShape(String input) {
        switch (input) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
