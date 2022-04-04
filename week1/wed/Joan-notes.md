## Git Review

* **Git** is a version control system. **GitHub** is a cloud storage service.
* `git pull origin main` is used to pull data from GitHub's main branch.
* `git push origin <BRANCH NAME>` is used to push data back onto a given branch in GitHub.

## Java

* Java is both a programming language and a platform.
* Java is a high-level, robust, object-oriented and secure programming language.
* A **platform** is any hardware or software environment in which a program can run.
  * Java is a platform because it has a runtime environment (called "JRE") and an API.
* Four types of applications that can be created using Java programming:
  * **Standalone applications**, also known as desktop applications or "window-based" applications. AWT and Swing are used to create standalone applications.
  * **Web applications**, applications that run on the server side (usually on the internet) and create dynamic pages. Servlet, JSP, Struts, Spring, Hibernate, and JSF are technologies used to create web applications.
  * **Enterprise applications**, applications that are distributed in nature, such as for banking. They take advantage of high-level security, load balancing, and clustering. EJB is used for creating enterprise applications.
  * **Mobile applications**, applications created for mobile devices. Android and Java ME are used for creating mobile applications.
* Four platforms or editions of Java:
  * **Java SE (Java Standard Edition)** is a Java programming platform and includes Java programming APIs such as java.lang, java.io, java.net, java.util, java.sql, and java.math. Includes core topics like OOPs, String, Regex, Exception, Inner classes, Multithreading, I/O Stream, Networking, AWT, Swing, Reflection, Collection, etc.
  * **Java EE (Java Enterprise Edition)** is an enterprise platform used to develop web and enterprise applications. It is built on top of the Java SE platform. It includes topics like Servlet, JSP, Web Services, EJB, and JPA.
  * **Java ME (Java Micro Edition)** is a micro-platform used to develop mobile applications.
  * **JavaFX** is used to develop rich internet applications and uses a light-weight user interface API.

### Object-Oriented Programming (OOP)

**Object-oriented programming (OOP)** is a computer programming model that organizes software design around data, or objects, rather than around functions and logic.
* An **object** is a data field that has unique attributes and behavior.
* OOP is well-suited for programs that are large, complex, and actively updated or maintained (such as programs for manifacturing and design or mobile applications).

### JDK, JRE, and JVM

* The **JDK** (or the **Java Development Kit**)  is used to compile and create Java programs.
  * It takes your Java code and converts it into a format that the JRE and JVM can execute.
  * Includes debuggers for testing and for finding errors in your code and the Java Compiler for compiling that code.
* The **JRE** (or the **Java Runtime Environment**) runs Java programs. Can also be called "java runtime."
  * Includes the libraries that come with Java and the Java Launcher.
  * Also includes the JVM (*see below*).
* The **JVM** (or the **Java Virtual Machine**) is a part of the JRE and converts bytecode to machine code. It is effectively an abstract computing machine.

### My First Java Program

* `public static void main(String[] args)` is the most important Java method. The Java main method is the entry point of any Java program.
  * A **method** is a function. Code is written inside a method.
  * **Public** is the access modifier of the main method. It must be public so that java runtime can execute the method.
  * When a member is declared **static**, it can be accessed before any objects of its class are created.

### Methods and Parameters

A **parameter** is a value that you can pass to a method in Java. The method can then use the parameter as though it were a local variable initialized with the value of the variable passed to it by the calling method. For example:

```java
public int getRandomNumber() {
    return (int)(Math.random() * 10) +1;
        }
```

A **method** is a behaviors. A method takes in a parameter. Some methods take in no parameters, such as in the previous example.

**Camel-casing** is when Java methods are named by concatenated, capitalized words:

```java
public String finalBoss () {}
```

**Snake-casing** is when underscores are used instead:

```java
public String final_boss() {}
```