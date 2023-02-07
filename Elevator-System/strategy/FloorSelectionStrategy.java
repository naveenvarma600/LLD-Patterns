package strategy;

import model.ElevatorRequest;

import java.util.Queue;

public interface FloorSelectionStrategy {

    public ElevatorRequest getNextFloor(Queue<ElevatorRequest> elevatorRequests);
}
