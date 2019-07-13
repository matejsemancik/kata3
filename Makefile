all: install build run

install:
	brew install kotlin

# -nowarn option to suppress experimental inline class warning
build:
	kotlinc -nowarn src/*.kt -d game.jar

run:
	@kotlin -classpath game.jar dev.matsem.kata3.Main $(FILEPATH)