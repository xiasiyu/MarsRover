import java.util.LinkedList;

public class CommandParser {


    public Command commandParser(String input){
        System.out.println(input);
        int xpos = input.charAt(0)-'0';
        int ypos = input.charAt(1)-'0';
        DirectionState directionState = getDirectionStateFromInput(input.charAt(3));
        LinkedList<MoveType> movements = new LinkedList<MoveType>();
        int i = 4;
        MoveType mov = MoveType.L;
        while(i < input.length()){
            switch(input.charAt(i)){
                case 'L':
                    mov = MoveType.L;
                    break;
                case 'M':
                    mov = MoveType.M;
                    break;
                case 'R':
                    mov = MoveType.R;
                    break;
                default:
                    break;
            }
            movements.add(mov);
            i++;
        }
        MarsRoverController marsRoverController = new MarsRoverController();
        return new CmdDeployMarsRover(marsRoverController, xpos, ypos, directionState, movements);
    }

    public DirectionState getDirectionStateFromInput(char ch){
        Context context = new Context();
        switch(ch){
            case 'E':
                context.setDirectionState(new DirectionEast());
                break;
            case 'W':
                context.setDirectionState(new DirectionWest());
                break;
            case 'N':
                context.setDirectionState(new DirectionNorth());
                break;
            case 'S':
                context.setDirectionState(new DirectionSouth());
                break;
            default:
                break;
        }
        return context.getDirectionState();
    }

}
