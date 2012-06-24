import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Map map = new Map();
        Invoker invoker = new Invoker();
        CommandParser commandParser = new CommandParser();

        String input = "";
        System.out.println("Please input command:\n");
        input = bufferedReader.readLine();
        Command command = new CmdSetMap(map, input.charAt(0) - '0', input.charAt(1) - '0');
        invoker.setCommand(command);
        invoker.action();

        while( !input.equals("OVER") ){
            input = bufferedReader.readLine();
            input += bufferedReader.readLine();
            command = commandParser.commandParser(input);
            invoker.setCommand(command);
            invoker.action();
        }


//        Context context = new Context();
//        context.setDirectionState(new DirectionEast());
//
//        MarsRover marsRover = new MarsRover(3, 3, context.getDirectionState());
//        LinkedList<MoveType> move = new LinkedList<MoveType>();
//        move.add(MoveType.M);
//        move.add(MoveType.M);
//        move.add(MoveType.R);
//        move.add(MoveType.M);
//        move.add(MoveType.M);
//        move.add(MoveType.R);
//        move.add(MoveType.M);
//        move.add(MoveType.R);
//        move.add(MoveType.R);
//        move.add(MoveType.M);
//        marsRover.execCommand(move);
//        System.out.println(marsRover.getCurrentPosition());

    }
}
