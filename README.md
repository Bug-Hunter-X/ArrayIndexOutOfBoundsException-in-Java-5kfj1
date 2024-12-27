# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`.  The `Bug.java` file contains code that throws this exception. The `BugSolution.java` file provides a corrected version.  This is a crucial error to understand when working with arrays in Java.

## How to reproduce:

1. Clone this repository.
2. Compile `Bug.java` using a Java compiler (e.g., `javac Bug.java`).
3. Run the compiled code (e.g., `java Bug`).  You will see the exception.
4. Compare the solution in `BugSolution.java` to see how to prevent this error.

## Learning Points:

* Arrays in Java are zero-indexed.
* Always check array boundaries before accessing elements to avoid `ArrayIndexOutOfBoundsException`.
* Use appropriate exception handling mechanisms (try-catch blocks) to gracefully handle potential exceptions.