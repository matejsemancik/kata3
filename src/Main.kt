package dev.matsem.kata3

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if (args.isEmpty()) {
                println("No input file, you need to specify FILEPATH variable in make run target")
                return
            } else {
                GameOfLife().run(args[0])
            }
        }
    }
}