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

    @Test
    public void should_return_right_position_after_execute_command1() {
        DirectionEast direction = new DirectionEast();
        Position position = new Position(3, 3);
        MarsRover marsRover = new MarsRover(position, direction);
        ArrayList<MoveType> moves = createDefaultCommand1();
        marsRover.execCommand(moves);

        assertThat(marsRover.getCurrentPosition(), is("51 E"));

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

    private ArrayList<MoveType> createDefaultCommand1() {
        ArrayList<MoveType> moves = new ArrayList<MoveType>();
        moves.add(MoveType.M);
        moves.add(MoveType.M);
        moves.add(MoveType.R);
        moves.add(MoveType.M);
        moves.add(MoveType.M);
        moves.add(MoveType.R);
        moves.add(MoveType.M);
        moves.add(MoveType.R);
        moves.add(MoveType.R);
        moves.add(MoveType.M);
        return moves;
    }
}
