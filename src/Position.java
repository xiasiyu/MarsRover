import java.util.ArrayList;

public class Position extends CommandReceiver {
    private int xpos;
    private int ypos;

    public Position(int x, int y) {
        this.xpos = x;
        this.ypos = y;
    }


    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public String toPrintString() {
        return Integer.toString(xpos) + Integer.toString(ypos);
    }

    public void add(Position move) {
        xpos = xpos + move.getXpos();
        ypos = ypos + move.getYpos();
    }

    @Override
    public void actionMove(Position position) {
    }

    @Override
    public void actionSetBorder(int x, int y) {
    }

    @Override
    public void actionDeployMarsRover(Position position, DirectionState direction, ArrayList<MoveType> movements) {
    }

    @Override
    public Object actionTurnLeft(DirectionState directionState) {
        return null;
    }

    @Override
    public Object actionTurnRight(DirectionState directionState) {
        return null;
    }
}
