package dev.matsem.kata3

class Universe(
    var cells: Array<Array<Cell>>,
    val width: Int,
    val height: Int
) {

    fun nextGeneration() {
        val nextGeneration = Array(height) { Array(width) { Cell(false) } }

        for (y in 0 until height) {
            for (x in 0 until width) {
                val neighborCount = neighborCount(y, x)

                nextGeneration[y][x] = when {
                    cells[y][x].isAlive && neighborCount == 2 -> Cell(true)
                    cells[y][x].isAlive && neighborCount == 3 -> Cell(true)
                    !cells[y][x].isAlive && neighborCount == 3 -> Cell(true)
                    else -> Cell(false)
                }
            }
        }

        cells = nextGeneration
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

    private fun neighborCount(atY: Int, atX: Int): Int {
        var count = 0
        for (y in (atY - 1)..(atY + 1)) {
            for (x in (atX - 1)..(atX + 1)) {
                // If out of bounds
                if (y < 0 || x < 0 || y >= height || x >= width) {
                    continue
                }

                // If this cell
                if (y == atY && x == atX) {
                    continue
                }

                if (cells[y][x].isAlive) {
                    count++
                }
            }
        }

        return count
    }
}