public class DirectionNorth extends DirectionState{

    @Override
    public DirectionState getLeftDirection() {
        return DirectionEnum.WEST;
    }

    @Override
    public DirectionState getRightDirection() {
        return DirectionEnum.EAST;
    }

    @Override
    public Position move() {
        return new Position(0, 1);
    }

    @Override
    public String toPrintString() {
        return "N";
    }
}
