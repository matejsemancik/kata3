package dev.matsem.kata3

inline class Cell(val isAlive: Boolean) {
    companion object {
        const val CHARACTER_ALIVE = '*'
        const val CHARACTER_DEAD = '.'

        fun from(char: Char) = Cell(isAlive = char == CHARACTER_ALIVE)
    }

    val character: Char
        get() = if (isAlive) CHARACTER_ALIVE else CHARACTER_DEAD
}