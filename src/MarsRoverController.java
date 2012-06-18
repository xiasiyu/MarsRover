import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MarsRoverController {
    private int mapXBorder;
    private int mapYBorder;
    private List<MarsRover> marsRovers;
    private String command;
    private Command commandType;
    private int currentMarsRoverIndex;

    public MarsRoverController() {
        marsRovers = new ArrayList<MarsRover>();
    }

    public void execCommand() {
        switch (commandType) {
            case FIXMAP:
                setMapBoreder(command.charAt(0) - '0', command.charAt(1) - '0');
                break;
            case CREATE:
                createMarsRover(command);
                break;
            case MOVE:
                passMoveCommand(marsRovers.get(currentMarsRoverIndex));
                marsRovers.get(currentMarsRoverIndex).execCommand();
                break;
            default:
                break;
        }
    }

    public void createMarsRover(String command) {
        MarsRover marsRover = new MarsRover(command.charAt(0), command.charAt(1), command.charAt(3));
        marsRovers.add(marsRover);
        currentMarsRoverIndex = marsRovers.indexOf(marsRover);
    }

    public MarsRover getMarsRover(int index) {
        return marsRovers.get(index);  //To change body of created methods use File | Settings | File Templates.
    }

    public void setMapBoreder(int max_x, int max_y) {
        mapXBorder = max_x;
        mapYBorder = max_y;
    }

    public Integer getMapBorderX() {
        return mapXBorder;  //To change body of created methods use File | Settings | File Templates.
    }

    public Integer getMapBorderY() {
        return mapYBorder;  //To change body of created methods use File | Settings | File Templates.
    }

    public void passMoveCommand(MarsRover marsRover) {
        marsRover.setMoveCommand(this.command);
    }

    public void setCommand(String inputCommand, Command commandType) {
        this.command = inputCommand;
        this.commandType = commandType;
    }

    public void printMarsRoverPosition() {
        int i = 0;
        MarsRover marsRover;
        Iterator itr = marsRovers.iterator();
        while (itr.hasNext()) {
            marsRover = (MarsRover)(itr.next());
            if (marsRover.getxPos() > mapXBorder || marsRover.getyPos() > mapYBorder) {
                if (marsRover.getxPos() > mapXBorder) {
                    marsRover.setxPos((char) (mapXBorder + '0'));
                } else {
                    marsRover.setyPos((char) (mapYBorder + '0'));
                }
            }
            System.out.println(marsRover.getCurrentPosition());
            i++;
        }
    }
}
