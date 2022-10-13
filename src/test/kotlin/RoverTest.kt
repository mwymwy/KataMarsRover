import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class RoverTest {
    @Test
    internal fun `should create a rover at initial starting point and with a facing direction`() {
        val point = Point(x = 1, y = 1)
        val direction = Direction.NORTH

        val rover = Rover(point, direction)

        assertThat(rover.point).isEqualTo(point)
        assertThat(rover.direction).isEqualTo(direction)
    }

    @Test
    internal fun `the rover should receive an array of commands`(){
        val rover = Rover(Point(1, 1), Direction.NORTH)
        val command2 = DummyCommand()
        val command1 = DummyCommand()

        assertThatThrownBy {
            rover.receive(command1, command2)
        }.doesNotThrowAnyException()
    }

}