# Introduction to JDBC

JDBC API is a Java API that can access any kind of tabular data, especially data stored in a Relational Database. JDBC
works with Java on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX.

## Why use JDBC?

JDBC stands for Java Database Connectivity, which is a standard Java API for database-independent connectivity between
the Java programming language and a wide range of databases.

The JDBC library includes APIs for each of the tasks mentioned below that are commonly associated with database usage.

- Making a connection to a database.

- Creating SQL or MySQL statements.

- Executing SQL or MySQL queries in the database.

- Viewing & Modifying the resulting records.

<br>

# Properties files

The Properties class represents a persistent set of properties. The Properties can be saved to a stream or loaded from a
stream. It belongs to java.util package. Properties define the following instance variable. This variable holds a
default property list associated with a Properties object.

### Features of Properties class:

- Properties is a subclass of Hashtable.
- It is used to maintain a list of values in which the key is a string and the value is also a string i.e; it can be
  used to store and retrieve string type data from the properties file.
- Properties class can specify other properties list as it’s the default. If a particular key property is not present in
  the original Properties list, the default properties will be searched.
- Properties object does not require external synchronization and Multiple threads can share a single Properties object.
- Also, it can be used to retrieve the properties of the system.

## Advantage of a Properties file

In the event that any data is changed from the properties record, you don’t have to recompile the java class. It is
utilized to store data that is to be changed habitually.

### Example

**db.properties**

<pre>
url=jdbc:postgresql://localhost:5432/postgres?currentSchema=(your schema)
username = postgres
password = (your password)
</pre>

**Code**

<pre>
// Java program to demonstrate Properties class to get
// information from the properties file
  
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception
    {
        // create a reader object on the properties file
        FileReader reader = new FileReader("db.properties");
  
        // create properties object
        Properties p = new Properties();
  
        // Add a wrapper around reader object
        p.load(reader);
  
        // access properties data
        System.out.println(p.getProperty("url"));
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
    }
}
</pre>

<br>

# Prepared Statements

The PreparedStatement interface is a subinterface of Statement. It is used to execute parameterized query. This class is
from JDBC

### Example

Now select records of table_name by the code given below:

<pre>
Connection con = DriverManager.getConnection("jdbc url")

PreparedStatement ps = con.prepareStatement("SELECT * FROM table_name");
</pre>



<br>

# ResultSet

A JDBC ResultSet contains records. Each records contain a set of columns. Each record contains the same amount of
columns, although not all columns may have a value. A column can have a null value. Here is an illustration of a JDBC
ResultSet:

<img src="https://jenkov.com/images/java-jdbc/result-set-1.png">

**ResultSet example - records with columns**

This ResultSet has 3 different columns (Name, Age, Gender), and 3 records with different values for each column.

## Creating a ResultSet

<pre>
PreparedStatement statement = connection.prepareStatement("select * from people");

ResultSet result = statement.executeQuery();
</pre>

<br>

# Sub-queries

A sub-query is a SQL query nested inside a larger query.

- A sub-query may occur in:
    - A SELECT clause
    - A FROM clause
    - A WHERE clause


- The sub-query can be nested inside a SELECT, INSERT, UPDATE, or DELETE statement or inside another subquery.


- A sub-query is usually added within the WHERE Clause of another SQL SELECT statement.


- You can use the comparison operators, such as >, <, or =. The comparison operator can also be a multiple-row operator,
  such as IN, ANY, or ALL.


- A sub-query is also called an inner query or inner select, while the statement containing a sub-query is also called
  an outer query or outer select.


- The inner query executes first before its parent query so that the results of an inner query can be passed to the
  outer query.

<br>

# Database joins

SQL JOIN is a clause that is used to combine multiple tables and retrieve data based on a common field in relational
databases. Database professionals use normalizations for ensuring and improving data integrity. In the various
normalization forms, data is distributed into multiple logical tables. These tables use referential constraints –
primary key and foreign keys – to enforce data integrity in SQL Server tables. In the below image, we get a glimpse of
the database normalization process.

<img style="width:60%" src="https://s38063.pcdn.co/wp-content/uploads/2021/09/image3-1.png">
<br>

# Set operations

Set operators are used to join the results of two (or more) SELECT statements.The SET operators available in Oracle 11g
are UNION,UNION ALL,INTERSECT,and MINUS.

The UNION set operator returns the combined results of the two SELECT statements.Essentially,it removes duplicates from
the results i.e. only one row will be listed for each duplicated result.To counter this behavior,use the UNION ALL set
operator which retains the duplicates in the final result.INTERSECT lists only records that are common to both the
SELECT queries; the MINUS set operator removes the second query's results from the output if they are also found in the
first query's results. INTERSECT and MINUS set operations produce unduplicated results.

All the SET operators share the same degree of precedence among them.Instead,during query execution, Oracle starts
evaluation from left to right or from top to bottom.If explicitly parentheses are used, then the order may differ as
parentheses would be given priority over dangling operators.

Points to remember -

- Same number of columns must be selected by all participating SELECT statements.Column names used in the display are
  taken from the first query.


- Data types of the column list must be compatible/implicitly convertible by oracle. Oracle will not perform implicit
  type conversion if corresponding columns in the component queries belong to different data type groups.For example, if
  a column in the first component query is of data type DATE, and the corresponding column in the second component query
  is of data type CHAR,Oracle will not perform implicit conversion, but raise ORA-01790 error.


- Positional ordering must be used to sort the result set. Individual result set ordering is not allowed with Set
  operators. ORDER BY can appear once at the end of the query. For example,


- UNION and INTERSECT operators are commutative, i.e. the order of queries is not important; it doesn't change the final
  result.

  
- Performance wise, UNION ALL shows better performance as compared to UNION because resources are not wasted in
  filtering duplicates and sorting the result set.


- Set operators can be the part of sub queries.


- Set operators can't be used in SELECT statements containing TABLE collection expressions.


- The LONG, BLOB, CLOB, BFILE, VARRAY,or nested table are not permitted for use in Set operators.For update clause is
  not allowed with the set operators.