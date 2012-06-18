import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MarsRoverTest {
    private MarsRoverController marsRoverController;
    private MarsRover marsRover;

    @Before
    public void setUp() {
        marsRoverController = new MarsRoverController();
        marsRoverController.createMarsRover("12 N");
        marsRover = marsRoverController.getMarsRover(0);

    }

    @Test
    public void should_get_move_command_by_controller(){
        marsRoverController.setCommand("LMLMLMLMM", Command.MOVE);
        marsRoverController.passMoveCommand(marsRover);

        assertThat(marsRover.getMoveCommand(), is("LMLMLMLMM"));
    }

    @Test
    public void should_return_current_state() {
        assertThat(marsRover.getCurrentPosition(), is("12 N"));
        assertThat(marsRover.getCurrentDirection(), is("N"));
    }

    @Test
    public void should_return_current_direction_when_turnMove() {
        marsRover.turnLeft();
        assertThat(marsRover.getCurrentDirection(), is("W"));

        marsRover.turnRight();
        assertThat(marsRover.getCurrentDirection(), is("N"));
    }

    @Test
    public void should_return_current_position_when_move_forward() {
        marsRover.move();

        assertThat(marsRover.getCurrentPosition(), is("13 N"));
    }

}
