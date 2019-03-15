# Kotlin Workshop on Maven

## Installing Maven

 * download Maven directly from the [Apache Maven homepage](http://maven.apache.org/download.html)
 * install and configure your system as described in [the installation section](http://maven.apache.org/download.html#Installation)

## Compiling/Testing/Running the example

If you have maven on your path, simple type:

	mvn test
	
It will compile:
 * src/main/kotlin/Hello.kt into target/classes/hello/HelloKt.class
 * src/test/kotlin/HelloTest.kt into target/test-classes/hello/tests/HelloTest.class

Then run tests, and finally run your main HelloKt class.

## Only running the example

Once you compiled the sources with previous 'mvn test' command, you can run the application by typing:

	mvn exec:java
	
## Setting up before workshop

Import project in IDEA IntelliJ as a Maven project. Once it is set-up, you'll be able to run any entry point (`main` function) or any test using a green triangle on the right to this function or test.  