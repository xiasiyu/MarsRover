public class DirectionEast extends DirectionState{

    @Override
    public DirectionState getLeftDirection() {
        return DirectionEnum.NORTH;
    }

    @Override
    public DirectionState getRightDirection() {
        return DirectionEnum.SOUTH;
    }

    @Override
    public Position move() {
        return new Position(1, 0);
    }

    @Override
    public String toPrintString() {
        return "E";
    }
}
