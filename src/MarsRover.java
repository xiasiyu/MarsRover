import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MarsRover extends CommandReceiver {
    private Position position = new Position(0,0);
    private DirectionState direction;
    private Map<MoveType, Command> moveCommandMap = new HashMap<MoveType, Command>();


    public MarsRover(Position position, DirectionState direction) {
        this.position = position;
        this.direction = direction;
        moveCommandMap = createMovetypeMap();
    }


    public void execCommand(ArrayList<MoveType> movements) {
        CommandInvoker commandInvoker = new CommandInvoker();
        for (MoveType movement : movements) {
           commandInvoker.setCommand(moveCommandMap.get(movement));
           commandInvoker.action();
        }
    }

    public Position getPosition(){
        return position;
    }

    public String getCurrentPosition() {
        return position.toPrintString() + " " + direction.toPrintString();
    }

    private Map<MoveType, Command> createMovetypeMap(){
        //TODO:receiver create hash map:  everycall return the same results
        moveCommandMap.put(MoveType.L, new CmdTurnLeft(this));
        moveCommandMap.put(MoveType.R, new CmdTurnRight(this));
        moveCommandMap.put(MoveType.M, new CmdMove(this));
        return moveCommandMap;
    }

    @Override
    public Object actionTurnLeft(DirectionState directionState) {
        direction = directionState.getLeftDirection();
        return direction;
    }

    @Override
    public Object actionTurnRight(DirectionState directionState) {
        direction = directionState.getRightDirection();
        return direction;
    }

    @Override
    public void actionMove(Position position) {
        position.add(direction.move());
    }

    public DirectionState getDirection() {
        return direction;
    }

    @Override
    public void actionSetBorder(int x, int y) {
    }

    @Override
    public void actionDeployMarsRover(Position position, DirectionState direction, ArrayList<MoveType> movements) {
    }
}
