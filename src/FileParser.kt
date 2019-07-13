package dev.matsem.kata3

import java.io.File
import java.io.IOException

class FileParser {
    companion object {
        @Throws(IOException::class)
        fun fileToUniverse(filePath: String): Universe {
            return File(filePath)
                .useLines {
                    val lines = it.toList()
                    val width = lines[0].length
                    val height = lines.size
                    val cells = Array(
                        size = height,
                        init = { row ->
                            Array(width) { col ->
                                Cell.from(lines[row][col])
                            }
                        }
                    )

                    Universe(cells, width, height)
                }
        }
    }
}