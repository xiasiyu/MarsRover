public class CmdMove implements Command {
    private CommandReceiver commandReceiver;
    private Position position;

    public CmdMove(MarsRover marsRover) {
        commandReceiver = marsRover;
    }

    @Override
    public void execute() {
        commandReceiver.actionMove(((MarsRover)commandReceiver).getPosition());
    }
}
