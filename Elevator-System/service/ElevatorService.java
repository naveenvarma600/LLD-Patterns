package service;

import datastore.ButtonsData;
import datastore.ElevatorRequestsData;
import model.ButtonEnum;
import model.Elevator;
import model.ElevatorRequest;
import strategy.DefaultFloorSelectionStrategy;

import java.util.List;

public class ElevatorService {

    private Elevator elevator;
    private ElevatorRequestsData requestsData;
    private ButtonsData buttonsData;

    public ElevatorService(int noFloor) {
        this.elevator = getInstance(noFloor);
        this.buttonsData = new ButtonsData(noFloor);
        this.requestsData = new ElevatorRequestsData(new DefaultFloorSelectionStrategy());
    }

    public void moveElevator() {
        while (requestsData.hasRequests()) {
            ElevatorRequest request = requestsData.getNextFloor();
            System.out.println("From " + elevator.getCurrFloor() + " to " + request.getFloor());
            elevator.setCurrFloor(request.getFloor());
            buttonsData.doNotIlluminateElevatorButton(request.getFloor());
            buttonsData.doNotIlluminateFloorButton(request.getFloor());
        }
    }

    public void addRequest(int floor, ButtonEnum buttonEnum) {
        requestsData.addRequest(new ElevatorRequest(floor));
        if (ButtonEnum.FLOOR == buttonEnum) {
            buttonsData.illuminateFloorButton(floor);
        } else if (ButtonEnum.ELEVATOR == buttonEnum) {
            buttonsData.illuminateElevatorButton(floor);
        }
        System.out.println("Added request from " + buttonEnum.toString() + " for floor " + floor);
    }

    public List<Integer> getIlluminatedElevatorButtons() {
        return buttonsData.getIlluminatedElevatorButtons();
    }

    public List<Integer> getIlluminatedFloorButtons() {
        return buttonsData.getIlluminatedFloorButtons();
    }

    private Elevator getInstance(int noFloor) {
        if (this.elevator == null) {
            return new Elevator(noFloor);
        }
        return this.elevator;
    }
}
