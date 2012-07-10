public class CmdTurnLeft implements Command{
    private CommandReceiver commandReceiver;
    private DirectionState directionState;

    public CmdTurnLeft(DirectionState directionState){
        commandReceiver = directionState;
    }

    @Override
    public void execute() {
        commandReceiver.actionTurnLeft(directionState);
    }
}
