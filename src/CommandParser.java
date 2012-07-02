import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommandParser {
    private Map<String, MoveType> moveCommandMap = new HashMap<String, MoveType>();
    private Map<String, DirectionState> directionMap = new HashMap<String, DirectionState>();
    private MarsRoverController marsRoverController = new MarsRoverController();

    public Command commandParser(String input) {
        moveCommandMap = createMoveCommandMap();
        directionMap = createDirectionMap();

        if(input.equals("OVER")){
            return new CmdPrintAll(marsRoverController);
        }
        else if(input.length() > 2){
            return createCommandForDeployMarsRover(input);
        }
        return createCommandForSetPlateau(input);

    }

    private CmdSetMap createCommandForSetPlateau(String input) {
        char[] in = input.toCharArray();
        return new CmdSetMap(new Plateau(), Character.getNumericValue(in[0]), Character.getNumericValue(in[1]));
    }

    private CmdDeployMarsRover createCommandForDeployMarsRover(String input) {
        ArrayList<MoveType> movements = parseCommandList(input);
        Position position = parseMarsRoverPosition(input);
        DirectionState directionState = getDirectionStateFromInput(input);
        return new CmdDeployMarsRover(marsRoverController, position, directionState, movements);
    }

    private Position parseMarsRoverPosition(String input) {
        char[] in = input.substring(0, 3).toCharArray();
        int xpos = Character.getNumericValue(in[0]);
        int ypos = Character.getNumericValue(in[1]);
        return new Position(xpos,ypos);
    }

    private Map<String, MoveType> createMoveCommandMap() {
        moveCommandMap.put("L", MoveType.L);
        moveCommandMap.put("R", MoveType.R);
        moveCommandMap.put("M", MoveType.M);
        return moveCommandMap;
    }

    private Map<String, DirectionState> createDirectionMap() {
        directionMap.put("E", DirectionEnum.EAST);
        directionMap.put("W", DirectionEnum.WEST);
        directionMap.put("S", DirectionEnum.SOUTH);
        directionMap.put("N", DirectionEnum.NORTH);
        return directionMap;
    }

    private ArrayList<MoveType> parseCommandList(String input) {
        String[] in = input.substring(4).split("");
        ArrayList<MoveType> movements = new ArrayList<MoveType>();
        for (String s : in) {
            if(moveCommandMap.get(s) != null){
                movements.add(moveCommandMap.get(s));
            }
        }
        return movements;
    }

    public DirectionState getDirectionStateFromInput(String input) {
        char firstLetter = input.charAt(3);
        return directionMap.get(Character.toString(firstLetter));

    }

}
