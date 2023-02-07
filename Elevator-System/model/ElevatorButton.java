package model;

public class ElevatorButton extends Button {

    int floorNo;

    public ElevatorButton(int floorNo) {
        this.floorNo = floorNo;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }
}
