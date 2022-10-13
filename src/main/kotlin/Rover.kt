class Rover(val point: Point, val direction: Direction) {
    fun receive(vararg command: DummyCommand) {
        command.forEach { it.execute(this) }
    }
}
