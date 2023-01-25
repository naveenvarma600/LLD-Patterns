package LLD.Concept_And_Coding.L1_Solid.Dependency_Inversion.Good;


public class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
