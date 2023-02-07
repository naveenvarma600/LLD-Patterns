package model;

public class Elevator {
    private int currFloor;
    private int noFloor;

    public Elevator(int noFloor) {
        this.noFloor = noFloor;
        this.currFloor = 0;
    }

    public int getCurrFloor() {
        return currFloor;
    }

    public void setCurrFloor(int currFloor) {
        this.currFloor = currFloor;
    }

    public int getNoFloor() {
        return noFloor;
    }
}
