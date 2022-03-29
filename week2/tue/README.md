# Pillars of OOP

## Abstraction

Abstraction is the process of showing only essential/necessary features of an entity/object to the outside world and
hide the other irrelevant information. For example to open your TV we only have a power button, It is not required to
understand how infra-red waves are getting generated in TV remote control.

## Encapsulation

Encapsulation means wrapping up data and member function (Method) together into a single unit i.e. class. Encapsulation
automatically achieve the concept of data hiding providing security to data by making the variable as private and expose
the property to access the private data which would be public.

## Inheritance

The ability of creating a new class from an existing class. Inheritance is when an object acquires the property of
another object. Inheritance allows a class (subclass) to acquire the properties and behavior of another class (
super-class). It helps to reuse, customize and enhance the existing code. So it helps to write a code accurately and
reduce the development time.

## Polymorphism

Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So
polymorphism means "many forms". A subclass can define its own unique behavior and still share the same functionalities
or behavior of its parent/base class. A subclass can have their own behavior and share some of its behavior from its
parent class not the other way around. A parent class cannot have the behavior of its subclass.

# Casting

Type casting is when you assign a value of one primitive data type to another type.

- Widening Casting (automatically) - converting a smaller type to a larger type size
    - `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`


- Narrowing Casting (manually) - converting a larger type to a smaller size type
    - `double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`

## Widening Casting

```
public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}
```

## Narrowing Casting

```
public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
```

## Upcasting

Casting from a subclass to a superclass is called upcasting. Typically, the upcasting is implicitly performed by the
compiler.

Upcasting is closely related to inheritance — another core concept in Java. It’s common to use reference variables to
refer to a more specific type. And every time we do this, implicit upcasting takes place.

To demonstrate upcasting, let’s define an Animal class:

```
public class Animal {

    public void eat() {
        // ... 
    }
}
```

Now let’s extend Animal:

```
public class Cat extends Animal {

    public void eat() {
         // ... 
    }

    public void meow() {
         // ... 
    }

}
```

Now we can create an object of Cat class and assign it to the reference variable of type Cat:

```
Cat cat = new Cat();
```

And we can also assign it to the reference variable of type Animal:

```
Animal animal = cat;
```

In the above assignment, implicit upcasting takes place.

# Object class

Object class is present in java.lang package. Every class in Java is directly or indirectly derived from the Object
class. If a class does not extend any other class then it is a direct child class of Object and if extends another class
then it is indirectly derived. Therefore the Object class methods are available to all Java classes. Hence Object class
acts as a root of inheritance hierarchy in any Java Program.

## Using Object Class Methods

There are methods in the Object class:

1. toString(): The toString() provides a String representation of an object and is used to convert an object to String.
   The default toString() method for class Object returns a string consisting of the name of the class of which the
   object is an instance, the at-sign character `@’, and the unsigned hexadecimal representation of the hash code of the
   object. In other words, it is defined as:


2. hashCode(): For every object, JVM generates a unique number which is hashcode. It returns distinct integers for
   distinct objects. A common misconception about this method is that the hashCode() method returns the address of the
   object, which is not correct. It converts the internal address of the object to an integer by using an algorithm. The
   hashCode() method is native because in Java it is impossible to find the address of an object, so it uses native
   languages like C/C++ to find the address of the object.


3. equals(Object obj): It compares the given object to “this” object (the object on which the method is called). It
   gives a generic way to compare objects for equality. It is recommended to override the equals(Object obj) method to
   get our own equality condition on Objects. For more on override of equals(Object obj) method refer – Overriding
   equals method in Java


4. getClass(): It returns the class object of “this” object and is used to get the actual runtime class of the object.
   It can also be used to get metadata of this class. The returned Class object is the object that is locked by static
   synchronized methods of the represented class. As it is final so we don’t override it.


5. finalize() method: This method is called just before an object is garbage collected. It is called the Garbage
   Collector on an object when the garbage collector determines that there are no more references to the object. We
   should override finalize() method to dispose of system resources, perform clean-up activities and minimize memory
   leaks. For example, before destroying Servlet objects web container, always called finalize method to perform
   clean-up activities of the session.


6. clone(): It returns a new object that is exactly the same as this object. For clone() method refer Clone().

The remaining three methods **wait()**, **notify()** **notifyAll()** are related to Concurrency. in Java for details.

# Abstract classes

What are Abstract Classes? An Abstract class acts as a way to define methods and variables that can be inherited to form
a specific relationship. Abstract classes are a powerful aspect of Object Oriented Programing, as they allow us to
define a single super class which has key traits necessary for multiple subclasses, but unlike normal inheritance an
Abstract class by itself cannot be an Object. In addition to Abstract Classes, we will also be discussing a close
relative of Abstract Classes known as Interfaces, which are very similar to Abstract Classes but with a few key
differences.

Following are some important observations about abstract classes in Java.

- An instance of an abstract class can not be created.
- Constructors are allowed.
- We can have an abstract class without any abstract method.
- Abstract classes can not have final methods because when you make a method final you can not override it but the
  abstract methods are meant for overriding.
- We are not allowed to create object for any abstract class.
- We can define static methods in an abstract class

## Abstract Class Use

Abstract Classes are defined in code as follows:

```
abstract class Shape {

   protected Point position;

   abstract double computeArea();

   public Point getPosition() {
      return this.position;
   }

   public void setPosition(Point position) {
      this.position = position;
   }

   public void movePositionRelative(Point position) {
      double x = this.position.getX() + position.getX();
      double y = this.position.getY() + position.getY();

      this.position.setX(x);
      this.position.setY(y);
   }
}
```

Abstract classes act similarly to inheritance, but are defined differently and include methods labeled as abstract.

The computeArea() method has the word abstract before it, which tells the system that when another class inherits from
the Shape class, that class will complete any method labeled as abstract in the Shape class.

This property allows you to define methods needed by any class inheriting from your abstract class, but gives the
subclass the task of completing the method in a way that makes sense for that subclass.

For example, let’s say we have 3 subclasses, inheriting from the above Shape class: Circle, Square, Triangle. All 3 of
these shapes have unique way of computing their area, pi*r^2, side^2, (1/2)*base*height, respectively. By making a
method to compute area abstract, we force the user to define their own version of computeArea, potentially avoiding
accidentally forgetting to define computeArea or trying to use values defined in shape that the subclass may not have
access to. The purpose of an abstract class is to build a base outline for a class which can include some code, but
really serves to relate multiple subclasses together.

So how do you define an abstract class? The first step of an abstract class is its definition. Below is the simple
outline of an abstract class.

Rather than using public class example we replace the public with abstract. The class also has two abstract methods and
a normal method. When a class inherits from this abstract class, the subclass will be expected to complete the abstract
methods with their definitions as written, meaning if it takes any parameters then the subclass’s version will need to
take the same parameters.

```
abstract class example{ //abstract class
    abstract int exampleMethod(double requiredInput);
    abstract int NoInputMethod();
    public int regularMethod(){
        return 0;
    }

} 

public class inheritor extends example{ //normal class extending an abstract class
    public int exampleMethod(double requiredInput){
        return (int) (requiredInput/2);
    }
    public int NoInputMethod(){
        return 0;
    }
}
```

# Interfaces

Interfaces are quite similar to abstract classes with a few differences. First and foremost, the definition of an
interface is a little different rather than using public/abstract class name, as interfaces use public interface name.

Second, rather than using the extends keyword, a class using an interface uses the keyword implements. Finally, a class
can implement multiple interfaces, rather than just one inheritance. Below is an example of defining an interface.

```
public interface exampleInterface{
    public static final double pi = 3.14;
    public double circumference();
}
public class exampleClass implements exampleInterface{
    public double circumference(){
        return 2*pi*(6);
    }
} 
```

The interface here provides a sample method required by any implementing class, but it also defines a variable pi.

Unlike an abstract class, an interface can declare global static variables that can be implemented without any problem.

If you tried to perform this using an abstract class, the Java compiler would throw an error.

An interface is a powerful tool to use when you want to define a simple outline/blueprint for classes that may share key
traits. It allows you to define common methods needed for shared functionality across multiple classes. When a class
implements an interface, that class is making a contract with the interface saying that it will write all the provided
methods in the interface, within the class itself.

## Part 3 Key Differences between Interfaces and Abstract Classes

Now at first glance, both of these types of classes sound quite similar, but there are some key differences between the
two.

Interfaces:

- Can be implemented any number of times as long as one does not overwrite another’s method
- Allow you to include public static final global variables
- Should only include abstract methods - no implemented methods

Abstract Classes:

- Can include both abstract and non-abstract methods
- May contain non-final variables
- Can provide implementation of interface

For example, if you have a superclass called Shape, and you implement the Comparable interface, then all subclasses of
Shape will be required to complete the Comparable interfaces methods, allowing you to effectively inherit multiple
interfaces without the need to include it in each individual subclass.