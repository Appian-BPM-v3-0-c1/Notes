# Control flow statements

Java compiler executes the code from top to bottom. The statements in the code are executed according to the order in
which they appear. However, Java provides statements that can be used to control the flow of Java code. Such statements
are called control flow statements. It is one of the fundamental features of Java, which provides a smooth flow of
program.

Java provides three types of control flow statements.

- Decision-Making statements
    - if statements
    - switch statement


- Loop statements
    - do while loop
    - for loop
    - for-each loop


- Jump statements
    - break statement
    - continue statement

## Decision-Making Statements

### If-Else Statement

In Java, the "if" statement is used to evaluate a condition. The control of the program is diverted depending upon the
specific condition. The condition of the If statement gives a Boolean value, either true or false. In Java, there are
four types of if-statements given below.

```
if (condition) {

  /* Do something if condition is TRUE */
  
} else {

  /* Do something if condition is FALSE */
  
}
```

### If-Else If Statement

```
if (condition) {

  /* Do something if condition is TRUE */
  
} else if (another condition) {

  /* Do something if another condition is true */
  
} else {
  
  /* Do something is neither of those conditions */
  
}
```

## Loop Statements

The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is
recommended to use for loop.

### Java Simple for Loop

A simple for loop is the same as C/C++. We can initialize the variable, check condition and increment/decrement value.
It consists of four parts:

- **Initialization**: It is the initial condition which is executed once when the loop starts. Here, we can initialize
  the variable, or we can use an already initialized variable. It is an optional condition.
- **Condition**: It is the second condition which is executed each time to test the condition of the loop. It continues
  execution until the condition is false. It must return boolean value either true or false. It is an optional
  condition.
- **Increment/Decrement**: It increments or decrements the variable value. It is an optional condition.
- **Statement**: The statement of the loop is executed each time until the second condition is false.

```
for (initialization; condition; increment/decrement) {

  /* statement or code to be executed */
      
}
```

**Example**

```
for (int i = 0; i < 10; i++) {

  System.out.println(i);
  
}

output:

/* 
 * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 */ 
```

### Java for-each Loop

The for-each loop is used to traverse array or collection in Java. It is easier to use than simple for loop because we
don't need to increment value and use subscript notation.

It works on the basis of elements and not the index. It returns element one by one in the defined variable.

```
int arr[] = {12, 23, 44, 56, 78};

for (int n : arr) {
  System.out.println(n);
}
```

### While Loop

The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true.
As soon as the Boolean condition becomes false, the loop automatically stops.

The while loop is considered as a repeating if statement. If the number of iteration is not fixed, it is recommended to
use the while loop.

```
while (condition is true) {     

  /* Keep doing this while loop */
  
}    
```