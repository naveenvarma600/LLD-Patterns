package model;

public class FloorButton extends Button{
    private int floor;
    private FloorButtonState direction;

    public FloorButton(int floor) {
        this.floor = floor;
        this.direction = FloorButtonState.NONE;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public FloorButtonState getDirection() {
        return direction;
    }

    public void setDirection(FloorButtonState direction) {
        this.direction = direction;
    }
}
