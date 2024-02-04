# Assignment 1 

## Part 1
### **Problem Statement**  
Implement a menu-driven Java program (like fib or factorial) to implement these input methods in JAVA.

### **Description**  
This program shows the different input methods which are availabe in JAVA. There are multiple ways by which input can be taken from user in JAVA and this programs tends to focus on thoose various methods.
There are 5 ways in which the input can be taken from user, they are as follows:

1. Scanner: This is the most common and reliable method for taking small as well as large input from the user. 
2. Command Line args: This is used when an argument is passed during initial running of the JAVA program. 
3. BufferedReader: This creates a buffering character input stream which is mostly used for efficient reading of characters, arrays, and lines.
4. DataInputStream: This creates an underlying input stream in a machine-independent way.
5. Console: This class provides methods to access the character-based console device.

### **Working**  
In this there are 3 different classes:
- ```Main.java```: The main class which access the functions of other 2 classes. This class contains the do-while loop which runs to generate menu to the user until the users chooses to stop the program. The different options offered to user are the different input methods that Java offers. The user can select which method they want to give input. All the different input methods are stored in input.java, all the methods returns a number to the main class upon getting input from user. Then factorial is performed on it, the factorial method is stored in the factorial.java class.
- ```input.java```: This class has all the input methods stored in it. The input methods return an integer value to the main class.
- ```factorial.java```: This class calculates the factorial of a number using recursion. The calculate method in the class takes an integer as input and returns an double as result.
