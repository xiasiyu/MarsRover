import java.util.Iterator;
import java.util.LinkedList;

public class MarsRover {
    private Postion postion = new Postion(0,0);
    private DirectionState direction;

    public MarsRover(int xPos, int yPos, DirectionState direction) {
        postion.setXpos(xPos);
        postion.setYpos(yPos);
        this.direction = direction;
    }

    public void execCommand(LinkedList<MoveType> movements) {
        Iterator itr = movements.iterator();
        MoveType moveType;
        while (itr.hasNext()) {
            moveType = (MoveType) itr.next();
            switch (moveType) {
                case L:
                    direction = direction.getLeftDirection();
                    break;
                case R:
                    direction = direction.getRightDirection();
                    break;
                case M:
                    postion.add(direction.move());
                    System.out.println(getCurrentPosition());
                    break;
                default:
                    break;
            }
        }
    }

    public String getCurrentPosition() {
        return postion.toPrintString() + " " + direction.toPrintString();
    }

    public int getXPos() {
        return postion.getXpos();
    }

    public int getYPos() {
        return postion.getYpos();
    }

    public void setXPos(int xPos) {
        postion.setXpos(xPos);
    }

    public void setYPos(int yPos) {
        postion.setYpos(yPos);
    }
}
