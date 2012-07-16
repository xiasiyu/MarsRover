public class CmdPrintAll implements Command{

    private MarsRoverController marsRoverController;

    public CmdPrintAll(MarsRoverController marsRoverController){
        this.marsRoverController = marsRoverController;
    }

    @Override
    public void execute() {
        marsRoverController.printAllMarsRoverPosition();
    }
}
