package dev.matsem.kata3

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if (args.isEmpty()) {
                println("No input file")
                return
            } else {
                GameOfLife().run(args[0])
            }
        }
    }
}