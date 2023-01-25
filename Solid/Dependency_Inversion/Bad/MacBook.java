package LLD.Concept_And_Coding.L1_Solid.Dependency_Inversion.Bad;


public class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook() {
        keyboard = new WiredKeyboard();
        mouse = new WiredMouse();
    }
}
