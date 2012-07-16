import java.util.ArrayList;

public class DirectionState extends CommandReceiver {
    protected DirectionEnum directionEnum;

    public DirectionState getLeftDirection() {
        return null;
    }

    public DirectionState getRightDirection() {
        return null;
    }

    public Position move() {
        return null;
    }

    public String toPrintString() {
        return null;
    }

    @Override
    public void actionSetBorder(int x, int y) {
    }

    @Override
    public void actionDeployMarsRover(Position position, DirectionState direction, ArrayList<MoveType> movements) {
    }

    @Override
    public Object actionTurnLeft(DirectionState directionState) {
        return this.getLeftDirection();
    }

    @Override
    public Object actionTurnRight(DirectionState directionState) {
        return this.getRightDirection();
    }

    @Override
    public void actionMove(Position position) {
        position.add(this.move());
        System.out.println(position.toPrintString());
    }
}
