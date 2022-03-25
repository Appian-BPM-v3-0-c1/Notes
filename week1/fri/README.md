# Class vs Object

There are many differences between object and class. A list of differences between object and class are given below:

1. Object is an **instance** of a class. Class is a **blueprint or template** from which objects are created.


2. Object is a **real world entity** such as pen, laptop, mobile, bed, keyboard, mouse, chair etc. Class is a **group of
   similar objects**.


3. Object is a **physical** entity. Class is a **logical** entity.


4. Object is created through **new keyword** mainly e.g. Student s1=new Student(); Class is declared using **class
   keyword**
   e.g. class Student{}


5. Object is created **many times** as per requirement. Class is declared **once**.


6. Object **allocates memory when it is created**. Class **doesn't allocate memory when it is created**.


7. There are many ways to **create object** in java such as new keyword, newInstance() method, clone() method, factory
   method and deserialization. There is only **one way to define class** in java using class keyword.

<br>

**Examples**
<br>
Let's see some real life example of class and object in java to understand the difference well:

**Class**: Human Object: Man, Woman

**Class**: Fruit Object: Apple, Banana, Mango, Guava wtc.

**Class**: Mobile phone Object: iPhone, Samsung, Moto

**Class**: Food Object: Pizza, Burger, Samosa

# Access modifiers

Java provides a number of access modifiers to set access levels for classes, variables, methods, and constructors. The
four access levels are −

- Visible to the package, the default. No modifiers are needed.
- Visible to the class only (private).
- Visible to the world (public).
- Visible to the package and all subclasses (protected).

## Private Access Modifier - Private

Methods, variables, and constructors that are declared private can only be accessed within the declared class itself.

Private access modifier is the most restrictive access level. Class and interfaces cannot be private.

Variables that are declared private can be accessed outside the class, if public getter methods are present in the
class.

Using the private modifier is the main way that an object encapsulates itself and hides data from the outside world.

**Example**

```
public class Logger {
   /* this attribute is private */
   private String format;
   
   /* getter and setter to get private attribute */
   public String getFormat() {
      return this.format;
   }

   public void setFormat(String format) {
      this.format = format;
   }
}
```

## Public Access Modifier - Public

A class, method, constructor, interface, etc. declared public can be accessed from any other class. Therefore, fields,
methods, blocks declared inside a public class can be accessed from any class belonging to the Java Universe.

However, if the public class we are trying to access is in a different package, then the public class still needs to be
imported. Because of class inheritance, all public methods and variables of a class are inherited by its subclasses.

**Example**

```
/* this class is public */
public class Dog {

   /* this method is public */
   public void bark() {
      System.out.println("WOOF WOOF!");
   }
}
```

## Protected Access Modifier - Protected

Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the
subclasses in other package or any class within the package of the protected members' class.

The protected access modifier cannot be applied to class and interfaces. Methods, fields can be declared protected,
however methods and fields in a interface cannot be declared protected.

Protected access gives the subclass a chance to use the helper method or variable, while preventing a nonrelated class
from trying to use it.

**Example**

```
class AudioPlayer {
   /* this method is protected */
   protected boolean openSpeaker(Speaker sp) {
      // implementation details
   }
}

class StreamingAudioPlayer extends AudioPlayer {
   boolean openSpeaker(Speaker sp) {
      // implementation details
   }
}
```

# Non-access modifiers

Java provides a number of non-access modifiers to achieve many other functionalities.

- The static modifier for creating class methods and variables.

- The final modifier for finalizing the implementations of classes, methods, and variables.

- The abstract modifier for creating abstract classes and methods.

## The Static Modifier

### Static Variables

The static keyword is used to create variables that will exist independently of any instances created for the class.
Only one copy of the static variable exists regardless of the number of instances of the class.

Static variables are also known as class variables. Local variables cannot be declared static.

### Static Methods

The static keyword is used to create methods that will exist independently of any instances created for the class.

Static methods do not use any instance variables of any object of the class they are defined in. Static methods take all
the data from parameters and compute something from those parameters, with no reference to variables.

Class variables and methods can be accessed using the class name followed by a dot and the name of the variable or
method.

## The Final Modifier

### Final Variables

A final variable can be explicitly initialized only once. A reference variable declared final can never be reassigned to
refer to a different object.

However, the data within the object can be changed. So, the state of the object can be changed but not the reference.

With variables, the final modifier often is used with static to make the constant a class variable.

### Final Methods

A final method cannot be overridden by any subclasses. As mentioned previously, the final modifier prevents a method
from being modified in a subclass.

The main intention of making a method final would be that the content of the method should not be changed by any
outsider.

### Final Classes

The main purpose of using a class being declared as final is to prevent the class from being subclassed. If a class is
marked as final then no class can inherit any feature from the final class.

## The abstract Modifier

### Abstract Class

An abstract class can never be instantiated. If a class is declared as abstract then the sole purpose is for the class
to be extended.

A class cannot be both abstract and final (since a final class cannot be extended). If a class contains abstract methods
then the class should be declared abstract. Otherwise, a compile error will be thrown.

An abstract class may contain both abstract methods as well normal methods.

### Abstract Methods

An abstract method is a method declared without any implementation. The methods body (implementation) is provided by the
subclass. Abstract methods can never be final or strict.

Any class that extends an abstract class must implement all the abstract methods of the super class, unless the subclass
is also an abstract class.

If a class contains one or more abstract methods, then the class must be declared abstract. An abstract class does not
need to contain abstract methods.

The abstract method ends with a semicolon. Example: public abstract sample();