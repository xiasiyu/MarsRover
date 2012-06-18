public enum Direction {
    WEST('W'), EAST('E'), SOUTH('S'), NORTH('N');

    private char direction;

    private Direction( char direction ){
        this.direction = direction;
    }

    public Direction getLeftDirection() {
        switch (this) {
            case NORTH:
                return WEST;
            case WEST:
                return SOUTH;
            case SOUTH:
                return EAST;
            case EAST:
                return NORTH;
        }
        return null;
    }

    public char getValue() {
        return this.direction;
    }


    public Direction getRightDirection() {
        switch (this) {
            case NORTH:
                return EAST;
            case EAST:
                return SOUTH;
            case SOUTH:
                return WEST;
            case WEST:
                return NORTH;
        }
        return null;
    }
}
