import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_return_right_position_after_execute_command() {
        DirectionNorth direction = new DirectionNorth();
        Position position = new Position(1, 2);
        MarsRover marsRover = new MarsRover(position, direction);
        ArrayList<MoveType> moves = createDefaultCommand();
        marsRover.execCommand(moves);

        assertThat(marsRover.getCurrentPosition(), is("13 N"));

    }

    private ArrayList<MoveType> createDefaultCommand() {
        ArrayList<MoveType> moves = new ArrayList<MoveType>();
        moves.add(MoveType.L);
        moves.add(MoveType.M);
        moves.add(MoveType.L);
        moves.add(MoveType.M);
        moves.add(MoveType.L);
        moves.add(MoveType.M);
        moves.add(MoveType.L);
        moves.add(MoveType.M);
        moves.add(MoveType.M);
        return moves;
    }
}
