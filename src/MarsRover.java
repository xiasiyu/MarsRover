public class MarsRover {
    private char xPos;
    private char yPos;
    private Direction direction;
    private String moveCommand;

    public void setxPos(char x){
        this.xPos = x;
    }

    public void setyPos(char y){
        this.yPos = y;
    }

    public int getxPos(){
        return xPos-'0';
    }

    public int getyPos(){
        return yPos-'0';
    }
    public MarsRover(char x, char y, char ori) {
        xPos = x;
        yPos = y;
        setCurrentDirection(ori);
    }

    private void setCurrentDirection(char direction) {
        switch (direction){
            case 'W':
                this.direction = Direction.WEST;
                break;
            case 'E':
                this.direction = Direction.EAST;
                break;
            case 'S':
                this.direction = Direction.SOUTH;
                break;
            case 'N':
                this.direction = Direction.NORTH;
        }
    }

    public String getCurrentPosition() {
        return "" + xPos + yPos + " " + direction.getValue();  //To change body of created methods use File | Settings | File Templates.
    }


    public String getMoveCommand() {
        return moveCommand;  //To change body of created methods use File | Settings | File Templates.
    }

    public void setMoveCommand(String moveCommand) {
        this.moveCommand = moveCommand;
    }

    public void execCommand() {
        int i = 0;
        while(i < moveCommand.length()){
            switch (moveCommand.charAt(i)){
                case 'L':
                    direction = direction.getLeftDirection();
                    break;
                case 'R':
                    direction = direction.getRightDirection();
                    break;
                case 'M':
                    move();
                    break;
            }
            i++;
        }
    }

    public String getCurrentDirection() {
        return direction.getValue() +"";
    }

    public void turnLeft() {
        this.direction = direction.getLeftDirection();
    }

    public void turnRight() {
        this.direction = direction.getRightDirection();
    }

    public void move() {
        switch (direction){
            case WEST:
                --xPos;
                break;
            case NORTH:
                ++yPos;
                break;
            case EAST:
                ++xPos;
                break;
            case SOUTH:
                --yPos;
                break;
        }
    }
}
