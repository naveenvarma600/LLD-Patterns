package datastore;

import model.ElevatorRequest;
import strategy.FloorSelectionStrategy;

import java.util.LinkedList;
import java.util.Queue;

public class ElevatorRequestsData {
    Queue<ElevatorRequest> elevatorRequests;
    FloorSelectionStrategy strategy;

    public ElevatorRequestsData(FloorSelectionStrategy strategy) {
        this.elevatorRequests = new LinkedList<>();
        this.strategy = strategy;
    }

    public void addRequest(ElevatorRequest request) {
        elevatorRequests.add(request);
    }

    public ElevatorRequest getNextFloor() {
        return strategy.getNextFloor(elevatorRequests);
    }

    public boolean hasRequests() {
        return elevatorRequests.size() > 0;
    }
}
