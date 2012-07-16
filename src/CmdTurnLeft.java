public class CmdTurnLeft implements Command{
    private CommandReceiver commandReceiver;

    public CmdTurnLeft(MarsRover marsRover){
        commandReceiver = marsRover;
    }

    @Override
    public void execute() {
        commandReceiver.actionTurnLeft(((MarsRover)commandReceiver).getDirection());
    }
}
