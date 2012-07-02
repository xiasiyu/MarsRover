import java.util.ArrayList;

public class MarsRover {
    private Position position = new Position(0,0);
    private DirectionState direction;

    public MarsRover(Position position, DirectionState direction) {
        this.position = position;
        this.direction = direction;
    }


    public void execCommand(ArrayList<MoveType> movements) {
        for (MoveType movement : movements) {
            switch (movement) {
                case L:
                    direction = direction.getLeftDirection();
                    break;
                case R:
                    direction = direction.getRightDirection();
                    break;
                case M:
                    position.add(direction.move());
                    break;
                default:
                    break;
            }
        }
    }

    public Position getPosition(){
        return position;
    }

    public String getCurrentPosition() {
        return position.toPrintString() + " " + direction.toPrintString();
    }

}
