import java.util.LinkedList;

public class CmdDeployMarsRover implements Command{
    private Receiver receiver;
    private int x;
    private int y;
    private DirectionState direction;
    private LinkedList<MoveType> movements;

    public CmdDeployMarsRover(Receiver receiver, int x, int y, DirectionState directionState, LinkedList<MoveType> movements){
        this.receiver = receiver;
        this.x = x;
        this.y = y;
        this.direction = directionState;
        this.movements = movements;
    }


    public void execute() {
        receiver.actionDeployMarsRover(x, y, direction, movements);
    }
}
