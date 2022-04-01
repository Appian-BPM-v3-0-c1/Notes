# StringBuilder

The StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an
immutable sequence of characters, the StringBuilder class provides an alternative to String Class, as it creates a
mutable sequence of characters. The function of StringBuilder is very much similar to the StringBuffer class, as both of
them provide an alternative to String Class by making a mutable sequence of characters. However the StringBuilder class
differs from the StringBuffer class on the basis of synchronization. The StringBuilder class provides no guarantee of
synchronization whereas the StringBuffer class does. Therefore this class is designed for use as a drop-in replacement
for StringBuffer in places where the StringBuffer was being used by a single thread (as is generally the case). Where
possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most
implementations. Instances of StringBuilder are not safe for use by multiple threads. If such synchronization is
required then it is recommended that StringBuffer be used. Class Hierarchy:

<pre>
java.lang.Object
 ↳ java.lang
    ↳ Class StringBuilder
</pre>

## Constructors in Java StringBuilder:

- `StringBuilder sb = new StringBuilder()`: Constructs a string builder with no characters in it and an initial capacity
  of 16 characters.


- `StringBuilder sb = new StringBuilder(int capacity)`: Constructs a string builder with no characters in it and an
  initial capacity specified by the capacity argument.


- `StringBuilder sb = new StringBuilder(CharSequence seq)`: Constructs a string builder that contains the same
  characters as the specified CharSequence.


- `StringBuilder sb = new StringBuilder(String str)`: Constructs a string builder initialized to the contents of the
  specified string.

# StringBuffer

StringBuffer is a peer class of String that provides much of the functionality of strings. The string represents
fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.
StringBuffer may have characters and substrings inserted in the middle or appended to the end. It will automatically
grow to make room for such additions and often has more characters pre-allocated than are actually needed, to allow room
for growth.

Do keep in mind while applying so which are as follows:

- java.lang.StringBuffer extends (or inherits from) Object class.


- All Implemented Interfaces of StringBuffer class: Serializable, Appendable, CharSequence.


- public final class StringBuffer extends Object implements Serializable, CharSequence, Appendable.


- String buffers are safe for use by multiple threads. The methods can be synchronized wherever necessary so that all
  the operations on any particular instance behave as if they occur in some serial order.


- Whenever an operation occurs involving a source sequence (such as appending or inserting from a source sequence) this
  class synchronizes only on the string buffer performing the operation, not on the source. - It inherits some of the
  methods from the Object class which such as clone(), equals(), finalize(), getClass(), hashCode(), notifies(),
  notifyAll().

## Constructors of StringBuffer class

1. StringBuffer(): It reserves room for 16 characters without reallocation

`StringBuffer s = new StringBuffer();`

2. StringBuffer( int size): It accepts an integer argument that explicitly sets the size of the buffer.

`StringBuffer s = new StringBuffer(20);`

3. StringBuffer(String str): It accepts a string argument that sets the initial contents of the StringBuffer object and
   reserves room for 16 more characters without reallocation.

`StringBuffer s = new StringBuffer("exampleString");`

# File I/O - FileInputStream/FileReader/FileWriter

Java brings various Streams with its I/O package that helps the user to perform all the input-output operations. These
streams support all the types of objects, data-types, characters, files etc to fully execute the I/O operations.

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20191126125125/Java-Input-Output-Stream.jpg">

Before exploring various input and output streams lets look at 3 standard or default streams that Java has to provide
which are also most common in use:

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20191127113736/Java-Basic-input-output1.png">

## FileInputStream

### Constructors of FileInputStream Class

FileInputStream class is useful to read data from a file in the form of sequence of bytes. FileInputStream is meant for
reading streams of raw bytes such as image data. For reading streams of characters, consider using FileReader.

1. `FileInputStream(File file)`: Creates an input file stream to read from the specified File object.


2. `FileInputStream(FileDescriptor fdobj)`:Creates an input file stream to read from the specified file descriptor.


3. `FileInputStream(String name)`: Creates an input file stream to read from a file with the specified name.

### Example

<pre>
import java.io.FileInputStream;

public class DataStreamExample {  
    public static void main (String args[]) {    
        try {    
            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
            int i = fin.read();  
            System.out.print((char) i);    
  
            fin.close();    
          } catch(Exception e) {
              System.out.println(e);
        }    
    }    
}  
</pre>

## FileReader

Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.

It is character-oriented class which is used for file handling in java.

### Constructors of FileReader class

- `FileReader(String file)` It gets filename in string. It opens the given file in read mode. If file doesn't exist, it
  throws FileNotFoundException.


- `FileReader(File file)` It gets filename in file instance. It opens the given file in read mode. If file doesn't
  exist, it throws FileNotFoundException.

### Example

<pre>
package com.revature.file_reader;  
      
import java.io.FileReader;  

  public class FileReaderExample {

    public static void main(String args[])throws Exception {

      FileReader fr=new FileReader("D:\\testout.txt");

      int i = 0;
      while((i=fr.read())!=-1) System.out.print((char)i);

      fr.close();    
    }    
}    
</pre>

## FileWriter

This class inherits from the OutputStreamWriter class. The class is used for writing streams of characters.

This class has several constructors to create required objects. Following is a list.

### Constructor & Description

- `FileWriter(File file)`: This constructor creates a FileWriter object given a File object.


- `FileWriter(File file, boolean append)`: This constructor creates a FileWriter object given a File object with a
  boolean indicating whether or not to append the data written.


- `FileWriter(FileDescriptor fd)`: This constructor creates a FileWriter object associated with the given file
  descriptor.


- ` FileWriter(String fileName)`: This constructor creates a FileWriter object, given a file name.


- `FileWriter(String fileName, boolean append)`: This constructor creates a FileWriter object given a file name with a
  boolean indicating whether or not to append the data written.

### Example

<pre>
import java.io.*;
public class FileRead {

   public static void main(String args[])throws IOException {
      File file = new File("Hello1.txt");
      
      // creates the file
      file.createNewFile();
      
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file); 
      
      // Writes the content to the file
      writer.write("This\n is\n an\n example\n"); 
      writer.flush();
      writer.close();

      // Creates a FileReader Object
      FileReader fr = new FileReader(file); 
      char [] a = new char[50];
      fr.read(a);   // reads the content to the array
      
      for(char c : a)
         System.out.print(c);   // prints the characters one by one
      fr.close();
   }
}
</pre>

# Serialization

Java provides a mechanism, called object serialization where an object can be represented as a sequence of bytes that
includes the object's data as well as information about the object's type and the types of data stored in the object.

After a serialized object has been written into a file, it can be read from the file and deserialized that is, the type
information and bytes that represent the object and its data can be used to recreate the object in memory.

Most impressive is that the entire process is JVM independent, meaning an object can be serialized on one platform and
deserialized on an entirely different platform.

Classes **ObjectInputStream** and **ObjectOutputStream** are high-level streams that contain the methods for serializing
and deserializing an object.

The ObjectOutputStream class contains many write methods for writing various data types, but one method in particular
stands out −

<pre>public final void writeObject(Object x) throws IOException</pre>

The above method serializes an Object and sends it to the output stream. Similarly, the ObjectInputStream class contains
the following method for deserializing an object −

<pre>public final Object readObject() throws IOException, ClassNotFoundException</pre>


This method retrieves the next Object out of the stream and deserializes it. The return value is Object, so you will
need to cast it to its appropriate data type.

To demonstrate how serialization works in Java, I am going to use the Employee class that we discussed. Suppose that we
have the following Employee class, which implements the Serializable interface −

### Example

<pre>
public class Employee implements java.io.Serializable {
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   
   public void mailCheck() {
      System.out.println("Mailing a check to " + name + " " + address);
   }
}</pre>

Notice that for a class to be serialized successfully, two conditions must be met −

- The class must implement the java.io.Serializable interface.

- All the fields in the class must be serializable. If a field is not serializable, it must be marked transient.

## Serializing an Object

The ObjectOutputStream class is used to serialize an Object. The following SerializeDemo program instantiates an
Employee object and serializes it to a file.

When the program is done executing, a file named employee.ser is created. The program does not generate any output, but
study the code and try to determine what the program is doing.

### Example

<pre>
import java.io.*;
public class SerializeDemo {

   public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Bao Duong";
      e.address = "1234 S Something St. Denver CO";
      e.SSN = 11122333;
      e.number = 101;
      
      try {
         FileOutputStream fileOut =
         new FileOutputStream("/tmp/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}</pre>

## Deserializing an Object

The following DeserializeDemo program deserializes the Employee object created in the SerializeDemo program. Study the
program and try to determine its output −

<pre>
import java.io.*;
public class DeserializeDemo {

   public static void main(String [] args) {
      Employee e = null;
      try {
         FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Employee) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Number: " + e.number);
   }
}</pre>