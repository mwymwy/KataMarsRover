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
}