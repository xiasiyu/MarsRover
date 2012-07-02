import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CommandParserTest {
    private static final char default_direction = 'E';
    private static final String default_input_for_deploy_mars_rover = "12 NLMLMLMLMM";
    public static final String default_ending_tag = "OVER";
    public static final String default_input_for_set_plateau = "55";
    private CommandParser commandParser;

    @Before
    public void setUp() {
        commandParser = new CommandParser();
    }

    @Test
    public void should_parse_command_for_deploy_mars_rover() {

        assertThat(commandParser.commandParser(default_input_for_deploy_mars_rover), is(CmdDeployMarsRover.class));
    }

    @Test
    public void should_parse_command_for_print_all() {
        assertThat(commandParser.commandParser(default_ending_tag), is(CmdPrintAll.class));
    }

    @Test
    public void should_parse_command_for_set_plateau() {
        assertThat(commandParser.commandParser(default_input_for_set_plateau), is(CmdSetMap.class));
    }

}
