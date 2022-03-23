### Definitions

**Git** is a version control system. **GitHub** is a cloud storage service.

`git pull origin main` is used to pull data from GitHub.

`git push origin <branch name>` is used to push data back onto GitHub.

We use **Java** because it is an object-oriented language that organizes software design around data (or objects) rather than around functions and logic. This approach is great for programs that are large, complicated, and actively-updated or maintained.

* The **JDK** (or the **Java Development Kit**)  is used to compile and create Java programs.
* The **JRE** (or the **Java Runtime Environment**) runs Java programs. Can also be called "java runtime."
* The **JVM** (or the **Java Virtual Machine**) is a part of the JRE and converts bytecode to machine code, allowing you to run other operating systems on an abstract computing machine.

### Java

* When creating a new Java project, you must create a main Java class.
* A method is a function. A `public static void main` method is needed for a class to work as a function.
* Always write code inside a method.

**Intelli-J** can be used to start a new Java project.

The most important Java method, as described above, is `public static void main(String[] args)`. It is the entry point of any Java program.

* `public` is the access modifier of the main method. It *must* be public so that the JRE can execute this method.
  * Other access modifiers include `private` and `protected`.
* `static` is a declaration that states that this member should be accessed before any objects in its class are created.

#### Methods and Parameters

Methods are behaviors. A method takes in a parameter, a value that is assigned to a class.

Some methods take in no parameters:

```
public int getRandomNumber() {
  return (int)(Math.random() * 10) + 1; 
}
```

**Camel-casing** is when Java methods are named by concatenated, capitalized words:

```
public String finalBoss () {}
```

**Snake-casing** is when underscores are used instead:

```
public String final_boss() {}
```

Conditional statements are used by using `if`, `elseif`, and `else` statements.

Loops are used to iterate a program more than once. If the number of iterations is fixed, it's okay to use a loop.

```
for (initialization; condition; increment/decrement) {
    /* statement or code to be executed */
}
```

* **Initialization** is the initial condition executed at the start of the loop.
* **Condition** is the second condition executed each time the loop iterates.
* **Increment/Decrement** is the optional condition that says *how* the increment/decrement of the value should occur.
* **Statement** is executed each time until the second condition becomes false.

A **for-each** loop is used to traverse any array or collection in Java. We don't need to use increments because the values are already present.

```
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