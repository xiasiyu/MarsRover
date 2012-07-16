public class CmdTurnRight implements Command {

    private CommandReceiver commandReceiver;

    public CmdTurnRight(MarsRover marsRover) {
        commandReceiver = marsRover;
    }

    @Override
    public void execute() {
        commandReceiver.actionTurnRight(((MarsRover)commandReceiver).getDirection());
    }
}
