public class CmdMove implements Command {
    private CommandReceiver commandReceiver;
    private Position position;

    public CmdMove(DirectionState directionState, Position position) {
        commandReceiver = directionState;
        this.position = position;
    }

    public void setCommandReceiver(CommandReceiver recv){
        this.commandReceiver = recv;
    }

    @Override
    public Object execute() {

        commandReceiver.actionMove(position);
        return null;
    }
}
