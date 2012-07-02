import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlateauTest {


    @Test
    public void should_set_mars_rover_position_by_border_when_overcross(){
        Plateau plateau = new Plateau();
        plateau.actionSetBorder(5,5);
        Position position = new Position(7, 6);
        MarsRover marsRover = new MarsRover(position, DirectionEnum.EAST);

        Position pos = Plateau.isMarsRoverOutOfPlateau(marsRover);

        assertThat(pos.getXpos(), is(-2));
        assertThat(pos.getYpos(), is(-1));


    }
}
