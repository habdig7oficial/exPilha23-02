params = -d ./classes

lib:
	javac $(params) ./tad/*.java

exs:
	javac $(params) ./ex/*.java

# program="./ex/Ex1.java"
run: lib exs
	java -cp ./classes $(program)