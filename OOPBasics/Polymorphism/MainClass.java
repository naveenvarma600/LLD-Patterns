package LLD.OOPBasics.Polymorphism;


public class MainClass {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.voice();
        Bird duck = new Duck();
        duck.voice();
    }
}
