import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MarsRover {
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
            System.out.println(movement);
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
        moveCommandMap.put(MoveType.L, new CmdTurnLeft(direction));
        moveCommandMap.put(MoveType.R, new CmdTurnRight(direction));
        moveCommandMap.put(MoveType.M, new CmdMove(direction, position));
        return moveCommandMap;
    }

}
