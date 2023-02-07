package strategy;

import model.ElevatorRequest;

import java.util.Queue;

public class DefaultFloorSelectionStrategy implements FloorSelectionStrategy{

    @Override
    public ElevatorRequest getNextFloor(Queue<ElevatorRequest> elevatorRequests) {
        if (elevatorRequests.size() == 0) {
            System.out.println("No Request in Queue");
            return null;
        }
        return elevatorRequests.poll();
    }
}
