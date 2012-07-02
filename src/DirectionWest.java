public class DirectionWest extends DirectionState{

    @Override
    public DirectionState getLeftDirection() {
        return DirectionEnum.SOUTH;
    }

    @Override
    public DirectionState getRightDirection() {
        return DirectionEnum.NORTH;
    }

    @Override
    public Position move() {
        return new Position(-1, 0);
    }

    @Override
    public String toPrintString() {
        return "W";
    }
}
