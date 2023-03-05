source=ensiie/ast
destination=bin


all: main

main:
	javac ${source}/Main.java -d ${destination}
	java -classpath .;${destination} ensiie.ast.Main
