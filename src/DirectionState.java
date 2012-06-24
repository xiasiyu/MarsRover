public abstract class DirectionState {
    protected Context context;


    public void setContext(Context context){
        this.context = context;
    }

    public abstract DirectionState getLeftDirection();
    public abstract DirectionState getRightDirection();
    public abstract Postion move();

    public abstract String toPrintString();
}
