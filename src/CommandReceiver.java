import java.util.ArrayList;

public abstract class CommandReceiver {
    public abstract void actionSetBorder(int x, int y);

    public abstract void actionDeployMarsRover(Position position, DirectionState direction, ArrayList<MoveType> movements);

    public abstract Object actionTurnLeft(DirectionState directionState);

    public abstract Object actionTurnRight(DirectionState directionState);

    public abstract void actionMove(Position position);
}
