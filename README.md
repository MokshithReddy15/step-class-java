# step-class-java

This repository contains five Java practice programs organized in a simple package structure.

## Project Structure

- src/main/java/com/example/practice/DuplicateSeatChecker.java
- src/main/java/com/example/practice/TypingAccuracyChecker.java
- src/main/java/com/example/practice/TrafficSignalAnalyzer.java
- src/main/java/com/example/practice/WarehouseInventory.java
- src/main/java/com/example/practice/WordLengthProfiler.java

## How to Run

Compile the project with:

```bash
javac -d target/classes $(find src/main/java/com/example/practice -name "*.java")
```

Run any class with:

```bash
java -cp target/classes com.example.practice.ClassName
```

Example:

```bash
java -cp target/classes com.example.practice.DuplicateSeatChecker
```

## Purpose

These programs demonstrate basic Java concepts such as:
- arrays
- loops
- string handling
- conditional logic
- simple console output
