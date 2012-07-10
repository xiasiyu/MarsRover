import java.util.ArrayList;

public class Plateau extends CommandReceiver {
    private static int xBorder;
    private static int yBorder;
    private static Position pos = new Position(0, 0);

    @Override
    public void actionSetBorder(int x, int y) {
        xBorder = x;
        yBorder = y;
    }

    public static Position isMarsRoverOutOfPlateau(MarsRover marsRover) {
        if (marsRover.getPosition().getXpos() > xBorder) {
            pos.setXpos(xBorder - marsRover.getPosition().getXpos());
        }
        if (marsRover.getPosition().getYpos() > yBorder) {
            pos.setYpos(yBorder - marsRover.getPosition().getYpos());
        }
        return pos;
    }

    @Override
    public void actionDeployMarsRover(Position position, DirectionState direction, ArrayList<MoveType> movements) {
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


}
