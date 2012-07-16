import java.util.ArrayList;
import java.util.LinkedList;

public class MarsRoverController extends CommandReceiver {
    private LinkedList<MarsRover> marsRovers = new LinkedList<MarsRover>();
    private Position adjustMove = new Position(0,0);

    public void printAllMarsRoverPosition(){
        for (MarsRover marsRover : marsRovers) {
            adjustMove = Plateau.isMarsRoverOutOfPlateau(marsRover);
            if(!adjustMove.equals(new Position(0,0))){
                marsRover.getPosition().add(adjustMove);
            }
            System.out.println(marsRover.getCurrentPosition());
        }
    }

    @Override
      public void actionDeployMarsRover(Position position, DirectionState direction, ArrayList<MoveType> movements) {
          MarsRover marsRover = new MarsRover(position, direction);
          marsRovers.add(marsRover);
          marsRover.execCommand(movements);
      }

    @Override
    public Object actionTurnLeft(DirectionState directionState) {
        return null;
    }

    @Override
    public Object actionTurnRight(DirectionState directionState) {
        return null;
    }

    @Override
    public void actionMove(Position position) {
    }

    @Override
    public void actionSetBorder(int x, int y) {
    }
}
