# Assignment 1 

## Part 1
### **Problem Statement**  
Implement a menu-driven Java program to implement different input methods in JAVA.

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
- ```Main.java``` : The main class accesses the methods of other 2 classes. This class contains the do-while loop which runs to generate menu to the user until the users chooses to stop the program. The different options offered to user are the different input methods that Java offers. The user can select which method they want to give input. All the different input methods are stored in input.java, all the methods returns a number to the main class upon getting input from user. Then factorial is performed on it, the factorial method is stored in the factorial.java class.
- ```input.java``` : This class has all the input methods stored in it. The input methods return an integer value to the main class. The class also has ```inputChoice()``` method which returns an integer, this method is used to take input from user for the menu driven program.
- ```factorial.java``` : This class calculates the factorial of a number using recursion. The calculate method in the class takes an integer as input and returns an double as result.

## Part 2
### **Problem Statement**  
Implement a simple menu driven calculator in java to implement add, sub, mul, div, sqrt, power, mean, variance. Implement a separate Calculator class to include all related function inside that class.(mean calculation : program reads numbers from the keyboard, summing them in the process until the user enters the string "end". It then stops input & displays the avg. of numbers).


### **Description**  
This program focuses on implementing a simple menu-driven calculator commandline application. The main focus is on taking multiple inputs from user until user enter "end" which is when the program should stop taking the input. The multiple inputs are taken in form of a string and then converted to double using wrapper class. The different operations offered are: 
1. Additon: It takes 2 doubles as input and gives a double as result.
2. Subtraction: It takes 2 doubles as input and gives a double as result.
3. Multiplication:  It takes 2 doubles as input and gives a double as result.
4. Division:  It takes 2 doubles as input and gives a double as result.
5. Power:  It takes 2 doubles as input and gives a double as result.
6. Square root:  It takes 1 double as input and gives a double as result.
7. Mean: It takes an array of double and gives a double as result.
8. Variance: It takes an array of double and gives a double as result

### **Working**  
In this there are 3 different class:
- ```Main.java``` : The main class accesses the methods of other 2 classes. This class contains the do-while loop which runs to generate menu to the user until the users chooses to stop the program. The user can select to perfrom any provided mathematical operation, once the user selects a option it leads to entering the two numbers or array of numbers on which the operation needs to be performed. Once the number are entered the mathematical method from ```calculator.java``` class is called which returns the result in double format and the result is displayed to the user.
- ```input.java``` : The input class has all the input methods stored in it. There are 3 methods in this which are used according to the user needs. The first is the ```inputChoice()``` method which is used to take the option for the menu, it returns an integer to the main class. The second method is the ```inputNumbers()``` which takes 2 doubles and returns thoose 2 in form of an array of size 2. The third method is the ```inputString()``` methods which is used to take more than two numbers until user enters 'end'. It takes input in form of string and then using wrapper class to convert it to an array of double.
- ```calculator.java```: The calculator class is the class which contains all the methods for mathematical operations. The different methods in this class takes array of doubles as input and returns the result according to the mathematical operation as a double. 
