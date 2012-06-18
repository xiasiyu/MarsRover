import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class MarsRoverControllerTest {
    private MarsRoverController marsRoverController;

    @Before
    public void setUp() {
        marsRoverController = new MarsRoverController();
    }

    @Test
    public void should_initialize_map_when_input_command() {
        marsRoverController.setMapBoreder(5, 5);

        assertThat(marsRoverController.getMapBorderX(), is(5));
        assertThat(marsRoverController.getMapBorderY(), is(5));
    }

//    @Test
//    public void should_get_position_when_input_command() {
//                marsRoverController.execCommand("12 N\n");
//
//        assertThat(marsRoverController.getMarsRover(0).getCurrentPosition(), is("13 N\n"));
//    }

    @Test
    public void should_deploy_mars_rover_when_input_command() {
        marsRoverController.createMarsRover("12 N");

        assertThat(marsRoverController.getMarsRover(0), notNullValue());
        assertThat(marsRoverController.getMarsRover(0).getCurrentPosition(), is("12 N"));
    }

    @Test
    public void should_pass_mars_rover_move_command_when_input_command() {
        marsRoverController.createMarsRover("12 N");
        marsRoverController.setCommand("LMLMLMLMM", Command.MOVE);
        marsRoverController.passMoveCommand(marsRoverController.getMarsRover(0));

        assertThat(marsRoverController.getMarsRover(0).getMoveCommand(), is("LMLMLMLMM"));

    }

    @Test
    public void should_get_mars_rover_final_position() {
        marsRoverController.createMarsRover("12 N");
        marsRoverController.setCommand("LMLMLMLMM", Command.MOVE);
        marsRoverController.execCommand();

        assertThat(marsRoverController.getMarsRover(0).getCurrentPosition(), is("13 N"));
    }




}
