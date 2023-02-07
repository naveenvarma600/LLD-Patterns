import controller.ElevatorController;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        ElevatorController elevatorController = new ElevatorController(10);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            String[] commands = line.split(" ");
            switch (commands[0]) {
                case "move":
                    elevatorController.move();
                    break;
                case "add" :
                    if (commands[1].equals("floor")) {
                        elevatorController.pressFloorButton(Integer.parseInt(commands[2]));
                    } else {
                        elevatorController.pressElevatorButton(Integer.parseInt(commands[2]));
                    }
                    break;
                case "get" :
                    elevatorController.getIlluminatedButtons();
            }
        }
    }
}
