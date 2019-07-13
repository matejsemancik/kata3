all: install build run

install:
	brew install kotlin

build:
	kotlinc src/*.kt -d game.jar

run:
	@kotlin -classpath game.jar dev.matsem.kata3.Main $(FILEPATH)
