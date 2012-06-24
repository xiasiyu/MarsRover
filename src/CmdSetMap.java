public class CmdSetMap implements Command{
    private Receiver receiver;
    private int xBorder;
    private int yBorder;

    public CmdSetMap(Receiver recv, int x, int y){
        this.receiver = recv;
    }

    public void execute() {
        receiver.actionSetBorder(xBorder, yBorder);
    }
}
