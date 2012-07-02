public class DirectionSouth extends DirectionState{

    @Override
    public DirectionState getLeftDirection() {
        return DirectionEnum.EAST;
    }

    @Override
    public DirectionState getRightDirection() {
        return DirectionEnum.WEST;
    }

    @Override
    public Position move() {
        return new Position(0, -1);
    }

    @Override
    public String toPrintString() {
        return "S";
    }
}
