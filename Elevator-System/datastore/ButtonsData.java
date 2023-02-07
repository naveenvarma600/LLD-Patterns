package datastore;

import model.Button;
import model.ElevatorButton;
import model.FloorButton;

import java.util.ArrayList;
import java.util.List;

public class ButtonsData {
    List<Button> elevatorButtons;
    List<Button> floorButtons;

    public ButtonsData(int floors) {
        this.elevatorButtons = new ArrayList<>();
        this.floorButtons = new ArrayList<>();
        for (int i = 0; i < floors; i++) {
            elevatorButtons.add(new ElevatorButton(i));
            floorButtons.add(new FloorButton(i));
        }
    }

    public void illuminateFloorButton(int floor) {
        floorButtons.get(floor).illuminate();
    }

    public void illuminateElevatorButton(int floor) {
        elevatorButtons.get(floor).illuminate();
    }

    public void doNotIlluminateFloorButton(int floor) {
        floorButtons.get(floor).doNotIlluminate();
    }

    public void doNotIlluminateElevatorButton(int floor) {
        elevatorButtons.get(floor).doNotIlluminate();
    }

    public List<Integer> getIlluminatedElevatorButtons() {
        List<Integer> buttons = new ArrayList<>();
        for (Button button : elevatorButtons) {
            if (button.isIndicator()) {
                buttons.add(((ElevatorButton)button).getFloorNo());
            }
        }
        return buttons;
    }

    public List<Integer> getIlluminatedFloorButtons() {
        List<Integer> buttons = new ArrayList<>();
        for (Button button : floorButtons) {
            if (button.isIndicator()) {
                buttons.add(((FloorButton)button).getFloor());
            }
        }
        return buttons;
    }
}
