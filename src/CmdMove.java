public class CmdMove implements Command {
    private CommandReceiver commandReceiver;
    private Position position;

    public CmdMove(DirectionState directionState, Position position) {
        commandReceiver = directionState;
        this.position = position;
    }

    @Override
    public void execute() {
        commandReceiver.actionMove(position);
    }
}
