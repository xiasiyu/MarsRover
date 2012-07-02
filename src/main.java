import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = prepareBufferRead();
        CommandInvoker commandInvoker = new CommandInvoker();
        CommandParser commandParser = new CommandParser();

        System.out.println("Please input command:\n");
        String input = bufferedReader.readLine();
        dispatchCommand(commandInvoker, commandParser, input);

        while(true){
            input = bufferedReader.readLine();
            if(input.equals("OVER")){
                dispatchCommand(commandInvoker, commandParser, input);
                break;
            }
            input += bufferedReader.readLine();
            dispatchCommand(commandInvoker, commandParser, input);
        }
    }

    private static BufferedReader prepareBufferRead() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        return new BufferedReader(inputStreamReader);
    }

    private static void dispatchCommand(CommandInvoker commandInvoker, CommandParser commandParser, String input) {
        Command command;
        command = commandParser.commandParser(input);
        commandInvoker.setCommand(command);
        commandInvoker.action();
    }
}
