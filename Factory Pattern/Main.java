package LLD.Concept_And_Coding.L5_Factory_Pattern;


public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeObj = shapeFactory.getShape("CIRCLE");
        shapeObj.draw();
    }
}
