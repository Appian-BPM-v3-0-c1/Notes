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