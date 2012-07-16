import java.util.ArrayList;

public class CmdDeployMarsRover implements Command{
    private CommandReceiver commandReceiver;
    private Position position;
    private DirectionState direction;
    private ArrayList<MoveType> movements;

    public CmdDeployMarsRover(CommandReceiver commandReceiver, Position position, DirectionState directionState, ArrayList<MoveType> movements){
        this.commandReceiver = commandReceiver;
        this.position = position;
        this.direction = directionState;
        this.movements = movements;
    }


    public void execute() {
        commandReceiver.actionDeployMarsRover(position, direction, movements);
    }
}
