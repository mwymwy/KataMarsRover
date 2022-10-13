import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CommandTest {

    @Test
    fun `execute should return a rover`() {
        val command = Command()

        val res = command.execute(aRover())

        assertThat(res).isEqualTo(aRover())
    }

    @Test
    internal fun `should move forward when rover receive forward`() {
        val command = ForwardCommand()
        val rover = aRover(point = Point(1, 1), direction = Direction.NORTH)

        val res = command.execute(rover)

        assertThat(res).isEqualTo(aRover(point = Point(1, 2), direction = Direction.NORTH))
    }

}