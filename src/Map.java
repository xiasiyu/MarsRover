public class Map extends Receiver{
    private int xBorder = 5;
    private int yBorder = 5;

    @Override
    public void actionSetBorder(int x, int y) {
        xBorder = x;
        yBorder = y;
    }

    public boolean isOutOfMap(MarsRover marsRover){
        if( marsRover.getXPos() > xBorder ){
            marsRover.setXPos(xBorder);
        }
        else if(marsRover.getYPos() > yBorder){
            marsRover.setYPos(yBorder);
        }
        else{
           return false;
        }
        return true;
    }

}
