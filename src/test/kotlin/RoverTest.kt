import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoverTest {
    @Test
    internal fun `Should Create A Rover at initial starting point`() {
        val y = 1
        val x = 1

        val rover = Rover(x,y)

        assertThat(rover.x).isEqualTo(x)
        assertThat(rover.y).isEqualTo(y)
    }
}