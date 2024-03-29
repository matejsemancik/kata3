package dev.matsem.kata3

import java.io.IOException

class GameOfLife {
    fun run(filePath: String) {

        val universe: Universe = try {
            FileParser.fileToUniverse(filePath)
        } catch (e: IOException) {
            println(e.message)
            return
        }

        println("Zygote")
        println(universe)

        for (i in 1..10) {
            println("Generation: $i")
            universe.nextGeneration()
            println(universe)
        }
    }
}