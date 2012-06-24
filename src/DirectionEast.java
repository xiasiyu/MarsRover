public class DirectionEast extends DirectionState{

    @Override
    public DirectionState getLeftDirection() {
        super.context.setDirectionState(Context.NORTH);
        return super.context.getDirectionState();
    }

    @Override
    public DirectionState getRightDirection() {
        super.context.setDirectionState(Context.SOUTH);
        return super.context.getDirectionState();
    }

    @Override
    public Postion move() {
        return new Postion(1, 0);
    }

    @Override
    public String toPrintString() {
        return "E";
    }
}
