public class CmdTurnLeft implements Command{
    private CommandReceiver commandReceiver;
    private DirectionState directionState;
    private CmdMove cmdMove;

    public CmdTurnLeft(DirectionState directionState){
        commandReceiver = directionState;
        cmdMove = new CmdMove(directionState, new Position(0,0));
    }

    @Override
    public Object execute() {
        DirectionState dir = (DirectionState) commandReceiver.actionTurnLeft(directionState);
        this.commandReceiver = dir;
        cmdMove.setCommandReceiver(dir);
        return dir;
    }
}
