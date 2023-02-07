package controller;

import model.ButtonEnum;
import service.ElevatorService;

import java.util.List;

public class ElevatorController {

    private ElevatorService elevatorService;

    public ElevatorController(int floorNo) {
        this.elevatorService = new ElevatorService(floorNo);
    }

    public void pressFloorButton(int floorNo) {
        elevatorService.addRequest(floorNo, ButtonEnum.FLOOR);
    }

    public void pressElevatorButton(int floorNo) {
        elevatorService.addRequest(floorNo, ButtonEnum.ELEVATOR);
    }

    public void move() {
        elevatorService.moveElevator();
    }

    public void getIlluminatedButtons() {
        List<Integer> buttons = elevatorService.getIlluminatedElevatorButtons();
        System.out.println("Following Elevator buttons illuminated ");
        for (Integer floor : buttons) {
            System.out.println(floor + " ");
        }
        buttons = elevatorService.getIlluminatedFloorButtons();
        System.out.println("Following Floor buttons illuminated ");
        for (Integer floor : buttons) {
            System.out.println(floor + " ");
        }
    }
}
