public class Context {
    public final static DirectionEast EAST = new DirectionEast();
    public final static DirectionWest WEST = new DirectionWest();
    public final static DirectionSouth SOUTH = new DirectionSouth();
    public final static DirectionNorth NORTH = new DirectionNorth();

    private DirectionState directionState;

    public DirectionState getDirectionState() {
        return directionState;
    }

    public void setDirectionState(DirectionState directionState) {
        this.directionState = directionState;
        this.directionState.setContext(this);
    }

    public DirectionState getLeftDirection() {
        return this.directionState.getLeftDirection();
    }

    public DirectionState getRightDirection() {
        return this.directionState.getRightDirection();
    }

}
