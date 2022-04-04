**Conditional statements** are used by using `if`, `elseif`, and `else` statements.

**Loops** are used to iterate a program more than once. If the number of iterations is fixed, it's okay to use a loop.

```java
for (initialization; condition; increment/decrement) {
    /* statement or code to be executed */
}
```

* **Initialization** is the initial condition executed at the start of the loop.
* **Condition** is the second condition executed each time the loop iterates.
* **Increment/Decrement** is the optional condition that says *how* the increment/decrement of the value should occur.
* **Statement** is executed each time until the second condition becomes false.

A **for-each loop** is used to traverse any array or collection in Java. We don't need to use increments because the values are already present.

```java
int arr[] = {12, 23, 44, 56, 78};

for (int n : arr) {
    System.out.println(n);
}
```

Whiles and loops can be used interchangeably. My trainer likes to use whiles when using indices or nested loops.

```
while (condition is true) {
    /* keep doing this while loop */
}
```

### Variable Scopes

The **scope** of a variable is the part of the program where the variable is accessible. In Java, all identifiers are lexically (or statically) scoped. The scope of a variable can be determined at compile time and is independent of function call stack.

Java programs are organized in the form of classes. Every class is part of some package. Java scope rules can be covered under the following categories.

```java
public class Test {
    /* All variables defined directly inside a class are member variables. */
  int a;
  String b;
  
  public void method1() {
      /* Local variable (Method level scope) */
    int x;
    char c;
  }
  
  public char method2() {
      /* Notice you can access int a but not int x. That's because they're not in hte same scope. */
    char c;
    return c;
  }
}
```

###Review

* Methods are the behaviors of classes.
* Variable scopes are the space within which a variable can be called.
  * A parent cannot call a child's variables.
  * A child can access all of its parents' variables.

### Classes and Objects

* Classes are blueprints for objects.
* An object is an instantiation of a class.
* Encapsulation are access modifiers (e.g., public, private, protected).
  * We want encapsulation for security.
  * Allow certain classes to be accessed in a package.

|                                | default | private | protected | public |
|--------------------------------|---------|---------|-----------|--------|
| Same Class                     | Yes     | Yes     | Yes       | Yes    |
| Same package subclass          | Yes     | No      | Yes       | Yes    |
| Same package non-subclass      | Yes     | No      | Yes       | Yes    |
| Different package subclass     | No      | No      | Yes       | Yes    |
| Different package non-subclass | No      | No      | No        | Yes    |

