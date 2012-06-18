import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        CommandIntercepter commandIntercepter = new CommandIntercepter();
        MarsRoverController marsRoverController = new MarsRoverController();
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String input = "";
        System.out.println("Please input command:\n");
        input = bufferedReader.readLine();
        while( !input.equals("OVER") ){
            commandIntercepter.getInput(input);
            marsRoverController.setCommand(commandIntercepter.getCommandInfo(), commandIntercepter.getCommandType());
            marsRoverController.execCommand();
            input = bufferedReader.readLine();
        }
        marsRoverController.printMarsRoverPosition();
    }
}
