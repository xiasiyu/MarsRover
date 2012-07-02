public abstract class DirectionState {
    protected DirectionEnum directionEnum;

    public abstract DirectionState getLeftDirection();
    public abstract DirectionState getRightDirection();
    public abstract Position move();
    public abstract String toPrintString();
}
