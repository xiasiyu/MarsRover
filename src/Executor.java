import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Executor {
    private InputStreamReader inputStreamReader;
    private BufferedReader bufferedReader;
    private CommandParser commandParser;
    private CommandInvoker commandInvoker;
    private String input;

    public Executor() {
        inputStreamReader = new InputStreamReader(System.in);
        bufferedReader = new BufferedReader(inputStreamReader);
        commandInvoker = new CommandInvoker();
        commandParser = new CommandParser();

    }

    public void execute() throws IOException {
        System.out.println("Please input command:\n");
        prepareForPlateau();
        while (true) {
            input = bufferedReader.readLine();
            if (input.equals("XXX")) {
                dispatchCommand(commandInvoker, commandParser, input);
                break;
            }
            input += bufferedReader.readLine();
            dispatchCommand(commandInvoker, commandParser, input);
        }
    }

    private void prepareForPlateau() throws IOException {
        input = bufferedReader.readLine();
        dispatchCommand(commandInvoker, commandParser, input);
    }

    private static void dispatchCommand(CommandInvoker commandInvoker, CommandParser commandParser, String input) {
        Command command;
        command = commandParser.commandParser(input);
        commandInvoker.setCommand(command);
        commandInvoker.action();
    }
}
