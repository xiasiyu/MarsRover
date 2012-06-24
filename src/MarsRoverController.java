import java.util.Iterator;
import java.util.LinkedList;

public class MarsRoverController extends Receiver {
    private Map map;
    private LinkedList<MarsRover> marsRovers = new LinkedList<MarsRover>();

    @Override
    public void actionDeployMarsRover(int x, int y, DirectionState direction, LinkedList<MoveType> movements) {
        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRovers.add(marsRover);
        marsRover.execCommand(movements);
    }

    public void printAllMarsRover() {
        int i = 0;
        MarsRover marsRover;
        Iterator itr = marsRovers.iterator();
        while (itr.hasNext()) {
            marsRover = (MarsRover) (itr.next());
            map.isOutOfMap(marsRover);
            System.out.println(marsRover.getCurrentPosition());
            i++;
        }
    }

}
