public class CmdTurnRight implements Command {

    private CommandReceiver commandReceiver;
    private DirectionState directionState;

    public CmdTurnRight(DirectionState directionState) {
        commandReceiver = directionState;
        this.directionState = directionState;
    }

    @Override
    public void execute() {
        commandReceiver.actionTurnRight(directionState);
    }
}
