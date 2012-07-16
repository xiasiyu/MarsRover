public class CmdTurnRight implements Command {

    private CommandReceiver commandReceiver;
    private DirectionState directionState;

    public CmdTurnRight(DirectionState directionState) {
        commandReceiver = directionState;
        this.directionState = directionState;
    }

    @Override
    public Object execute() {
        return commandReceiver.actionTurnRight(directionState);
    }
}
