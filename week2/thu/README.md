# Generic

It would be nice if we could write a single sort method that could sort the elements in an Integer array, a String
array, or an array of any type that supports ordering.

Java Generic methods and generic classes enable programmers to specify, with a single method declaration, a set of
related methods, or with a single class declaration, a set of related types, respectively.

Generics also provide compile-time type safety that allows programmers to catch invalid types at compile time.

Using Java Generic concept, we might write a generic method for sorting an array of objects, then invoke the generic
method with Integer arrays, Double arrays, String arrays and so on, to sort the array elements.

## Generic Methods

You can write a single generic method declaration that can be called with arguments of different types. Based on the
types of the arguments passed to the generic method, the compiler handles each method call appropriately. Following are
the rules to define Generic Methods −

- All generic method declarations have a type parameter section delimited by angle brackets (< and >) that precedes the
  method's return type ( < E > in the next example).

- Each type parameter section contains one or more type parameters separated by commas. A type parameter, also known as
  a type variable, is an identifier that specifies a generic type name.

- The type parameters can be used to declare the return type and act as placeholders for the types of the arguments
  passed to the generic method, which are known as actual type arguments.

- A generic method's body is declared like that of any other method. Note that type parameters can represent only
  reference types, not primitive types (like int, double and char).

### Example

Following example illustrates how we can print an array of different type using a single Generic method −

<pre>
public class GenericMethodTest {
   // generic method printArray
   public static < E > void printArray( E[] inputArray ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

   public static void main(String args[]) {
      // Create arrays of Integer, Double and Character
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println("Array integerArray contains:");
      printArray(intArray);   // pass an Integer array

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);   // pass a Double array

      System.out.println("\nArray characterArray contains:");
      printArray(charArray);   // pass a Character array
   }
}
</pre>

### Output

<pre>
Array integerArray contains:
1 2 3 4 5 

Array doubleArray contains:
1.1 2.2 3.3 4.4 

Array characterArray contains:
H E L L O
</pre>

# Iterator interface

Java Iterator Interface of java collections allows us to access elements of the collection and is used to iterate over
the elements in the collection(Map, List or Set). It helps to easily retrieve the elements of a collection and perform
operations on each element. Iterator is a universal iterator as it can be applied to any Collection object. We can
traverse only in the forward direction using iterator. Using ListIterator which extends Iterator, can traverse in both
directions. Both read and remove operations can be performed by the iterator interface.

# Comparable interface

Java Comparable interface is used to order the objects of the user-defined class. This interface is found in java.lang
package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e., you can
sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.

## compareTo(Object obj) method

public int compareTo(Object obj): It is used to compare the current object with the specified object. It returns

- positive integer, if the current object is greater than the specified object.
- negative integer, if the current object is less than the specified object.
- zero, if the current object is equal to the specified object.

We can sort the elements of:

- String objects
- Wrapper class objects
- User-defined class objects

## Collections class

Collections class provides static methods for sorting the elements of collections. If collection elements are of Set or
Map, we can use TreeSet or TreeMap. However, we cannot sort the elements of List. Collections class provides methods for
sorting the elements of List type elements.

## Method of Collections class for sorting List elements

public void sort(List list): It is used to sort the elements of List. List elements must be of the Comparable type.

# Comparator interface

Java Comparator interface is used to order the objects of a user-defined class.

This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object
element).

It provides multiple sorting sequences.

## Collections class

Collections class provides static methods for sorting the elements of a collection. If collection elements are of Set or
Map, we can use TreeSet or TreeMap. However, we cannot sort the elements of List. Collections class provides methods for
sorting the elements of List type elements also.

## Method of Collections class for sorting List elements

public void sort(List list, Comparator c): is used to sort the elements of List by the given Comparator.

# Annotations

Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate
some additional information which can be used by java compiler and JVM.

Annotations in Java are used to provide additional information, so it is an alternative option for XML and Java marker
interfaces.

First, we will learn some built-in annotations then we will move on creating and using custom annotations.

## Built-In Java Annotations used in Java code

- @Override
- @SuppressWarnings
- @Deprecated

Built-In Java Annotations used in other annotations

- @Target
- @Retention
- @Inherited
- @Documented

## Understanding Built-In Annotations

Let's understand the built-in annotations first.

### @Override

@Override annotation assures that the subclass method is overriding the parent class method. If it is not so, compile
time error occurs.

Sometimes, we do the silly mistake such as spelling mistakes etc. So, it is better to mark @Override annotation that
provides security that method is overridden.

<pre>
class Animal {  
  void eatSomething() {
    System.out.println("eating something");
  }  
}  
      
class Dog extends Animal {  

  @Override  
  void eatSomething() {
    System.out.println("eating foods");} //should be eatSomething
  }  
      
  class TestAnnotation1 {
    public static void main(String args[]) {
      Animal a=new Dog();  
      a.eatSomething();  
  }
}  
</pre>

### @SuppressWarnings

@SuppressWarnings annotation: is used to suppress warnings issued by the compiler.

### @Deprecated

@Deprecated annotation marks that this method is deprecated so compiler prints warning. It informs user that it may be
removed in the future versions. So, it is better not to use such methods.

# Garbage Collection

Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs
compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM,
objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no
longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

## What is Garbage Collection?

In C/C++, a programmer is responsible for both the creation and destruction of objects. Usually, programmer neglects the
destruction of useless objects. Due to this negligence, at a certain point, sufficient memory may not be available to
create new objects, and the entire program will terminate abnormally, causing **OutOfMemoryErrors**.

But in Java, the programmer need not care for all those objects which are no longer in use. Garbage collector destroys
these objects. The main objective of Garbage Collector is to free heap memory by destroying unreachable objects. The
garbage collector is the best example of the Daemon thread as it is always running in the background.

## How Does Garbage Collection in Java works?

Java garbage collection is an automatic process. Automatic garbage collection is the process of looking at heap memory,
identifying which objects are in use and which are not, and deleting the unused objects. An in-use object, or a
referenced object, means that some part of your program still maintains a pointer to that object. An unused or
unreferenced object is no longer referenced by any part of your program. So the memory used by an unreferenced object
can be reclaimed. The programmer does not need to mark objects to be deleted explicitly. The garbage collection
implementation lives in the JVM. 