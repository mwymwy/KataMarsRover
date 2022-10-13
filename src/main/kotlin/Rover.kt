data class Rover(val point: Point, val direction: Direction) {
    fun receive(vararg command: Command) {
        command.forEach { it.execute(this) }
    }
}
