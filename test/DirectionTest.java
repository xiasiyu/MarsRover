import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DirectionTest{
    @Test
    public void should_return_left_direction_of_current() {
        Direction direction = Direction.WEST;

        assertThat(direction.getLeftDirection(), is(Direction.SOUTH));

    }

    @Test
    public void should_return_right_direction_of_current() {
        Direction direction = Direction.EAST;

        assertThat(direction.getRightDirection(), is(Direction.SOUTH));
    }
}
