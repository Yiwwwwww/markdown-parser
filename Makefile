
MarkdownParse.class: MarkdownParse.java
		javac MarkdownParse.java

MarkdownParseTest.class:MarkdownParse.java MarkdownParseTest.class
		javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java

test: MarkdownParseTest.class
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseTest 