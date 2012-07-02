public class CmdSetMap implements Command{
    private CommandReceiver commandReceiver;
    private int xBorder;
    private int yBorder;

    public CmdSetMap(CommandReceiver recv, int x, int y){
       commandReceiver = recv;
       xBorder = x;
       yBorder = y;
    }

    public void execute() {
        commandReceiver.actionSetBorder(xBorder, yBorder);
    }
}
