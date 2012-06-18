import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class CommandIntercepterTest {

    private CommandIntercepter commandIntercepter;
    private MarsRoverController marsRoverController;

    @Before
    public void setUp() {
        commandIntercepter = new CommandIntercepter();
        marsRoverController = new MarsRoverController();
    }

    @Test
    public void should_fix_map_when_input_only_digits() {
        commandIntercepter.getInput("55\n");
        marsRoverController.setCommand(commandIntercepter.getCommandInfo(), commandIntercepter.getCommandType());
        marsRoverController.execCommand();

        assertThat(marsRoverController.getMapBorderX(), is(5));
        assertThat(marsRoverController.getMapBorderY(), is(5));

    }

    @Test
    public void should_create_mars_rover_when_input_digits_and_chars(){
        commandIntercepter.getInput("12 N\n");
        marsRoverController.setCommand(commandIntercepter.getCommandInfo(),commandIntercepter.getCommandType());
        marsRoverController.execCommand();

        assertThat(marsRoverController.getMarsRover(0), notNullValue());
        assertThat(marsRoverController.getMarsRover(0).getCurrentPosition(), is("12 N"));
    }

    @Test
    public void should_move_mars_rover_when_input_only_chars() {
        commandIntercepter.getInput("12 N\n");
        marsRoverController.setCommand(commandIntercepter.getCommandInfo(),commandIntercepter.getCommandType());
        marsRoverController.execCommand();

        commandIntercepter.getInput("LMLMLMLMM");
        marsRoverController.setCommand(commandIntercepter.getCommandInfo(), commandIntercepter.getCommandType());
        marsRoverController.execCommand();
        marsRoverController.getMarsRover(0).execCommand();

        assertThat(marsRoverController.getMarsRover(0), notNullValue());
    }
}
