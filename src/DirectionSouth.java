public class DirectionSouth extends DirectionState{

    @Override
    public DirectionState getLeftDirection() {
        super.context.setDirectionState(Context.EAST);
        return super.context.getDirectionState();
    }

    @Override
    public DirectionState getRightDirection() {
        super.context.setDirectionState(Context.WEST);
        return super.context.getDirectionState();
    }

    @Override
    public Postion move() {
        return new Postion(0, -1);
    }

    @Override
    public String toPrintString() {
        return "S";
    }
}
