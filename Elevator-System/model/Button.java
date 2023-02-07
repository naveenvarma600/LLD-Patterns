package model;

public abstract class Button {

    private boolean indicator;

    public Button() {
        this.indicator = false;
    }

    public void illuminate() {
        this.indicator = true;
    }

    public void doNotIlluminate() {
        this.indicator = false;
    }

    public boolean isIndicator() {
        return indicator;
    }
}
