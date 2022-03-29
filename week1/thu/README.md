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

# Arrays

An array is a container object that holds a fixed number of values of a single type. The length of an array is
established when the array is created. After creation, its length is fixed. You have seen an example of arrays already,
in the main method of the "Hello World!" application. This section discusses arrays in greater detail.

<img src="https://docs.oracle.com/javase/tutorial/figures/java/objects-tenElementArray.gif">

Each item in an array is called an element, and each element is accessed by its numerical index. As shown in the
preceding illustration, numbering begins with 0. The 9th element, for example, would therefore be accessed at index 8.

The following program, ArrayDemo, creates an array of integers, puts some values in the array, and prints each value to
standard output.

```
class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
    }
} 
```

The output from this program is:

```
Element at index 0: 100
Element at index 1: 200
Element at index 2: 300
Element at index 3: 400
Element at index 4: 500
Element at index 5: 600
Element at index 6: 700
Element at index 7: 800
Element at index 8: 900
Element at index 9: 1000
```


# Package and imports

A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to
avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

- preventing naming conflicts. For example there can be two classes with name Employee in two packages,
  college.staff.cse.Employee and college.staff.ee.Employee
- Making searching/locating and usage of classes, interfaces, enumerations and annotations easier
- Providing controlled access: protected and default have package level access control. A protected member is accessible
  by classes in the same package and its subclasses. A default member (without any access specifier) is accessible by
  classes in the same package only.
- Packages can be considered as data encapsulation (or data-hiding).

# Constructors

Java constructors or constructors in Java is used to construct something in our programs. A constructor in Java is a
special method that is used to initialize objects. The constructor is called when an object of a class is created. It
can be used to set initial values for object attributes.

```
public class Dog {

  /* Attributes */
  String breed;
  String color;
  String size;
  String hair;
  
  /* Default constructor */
  public Dog() { }
    
  /* Set the class attribute */
  public Dog(String breed, String color, String size, String hair) {
    this.breed = breed;
    this.color = color;
    this.size = size;
    this.hair = hair;
  }
} 
```