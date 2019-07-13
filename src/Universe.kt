package dev.matsem.kata3

class Universe(
    var cells: Array<Array<Cell>>,
    val width: Int,
    val height: Int
) {

    fun nextGeneration() {

    }

    fun print() {
        cells.forEach { row ->
            println(row.joinToString(
                separator = "",
                transform = { cell ->
                    "${cell.character}"
                }
            ))
        }
    }
}