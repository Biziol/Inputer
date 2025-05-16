# TO DEVELOPERS
Inputer is located under the directory: "src/com/biziol/Inputer.java"

Once you have made the changes, compile the class

go to the build folder and run this command: 
* **`cd bin && jar cvf ../InputerLibrary.jar com/biziol/Inputer.class`:**
this will create the library needed by users.

# Inputer Library - User Guide

This library, `Inputer`, provides a convenient way to read various types of input from the console in Java.

## Installation

1.  Place the `InputerLibrary.jar` file into the `lib` folder of your Java project.
2.  Import library via
   ```java
   import com.biziol.Inputer
   ```

## Usage

To use the `Inputer` class in your project, import it:

```java
import com.biziol.Inputer;
```
Then, create an instance of the Inputer class:


```java
Inputer inputer = new Inputer();
```
## Functions

### readLine(String prompt)
Description: Displays a prompt and reads a line of text from the console.

Parameters:

prompt (String): The prompt to display to the user.
Return Value: A String containing the line read from the console, or null if the end of the stream is reached.

**Example:**

```java
String name = inputer.readLine("Enter your name: ");
System.out.println("Your name is: " + name);
```

### readInteger(String prompt)
Description: Displays a prompt and reads an integer from the console.

Parameters:

prompt (String): The prompt to display to the user.
Return Value: An Integer value, or null if the input is not a valid integer.

Error Handling: If the input is not a valid integer, an error message is printed to System.err.

**Example:**

```java
Integer age = inputer.readInteger("Enter your age: ");
if (age != null) {
    System.out.println("Your age is: " + age);
}
```

### readDouble(String prompt)
Description: Displays a prompt and reads a double from the console.

Parameters:

prompt (String): The prompt to display to the user.
Return Value: A Double value, or null if the input is not a valid double.

Error Handling: If the input is not a valid double, an error message is printed to System.err.

Example:

```Java

Double price = inputer.readDouble("Enter the price");
if (price != null) {
    System.out.println("The price is: " + price);
}
```

### clearScreen()
Description: Clears the console screen.

Example:

```Java

Inputer.clearScreen();
```

# Error Handling
The readInteger() and readDouble() methods handle NumberFormatException by printing an error message to System.err and returning null. You should check for null after calling these methods to handle invalid input.

