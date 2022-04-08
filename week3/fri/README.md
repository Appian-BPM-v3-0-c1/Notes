# Cursors

A database cursor can be thought of as a pointer to a specific row within a query result. The pointer can be moved from
one row to the next. Depending on the type of cursor, you may be even able to move it to the previous row.

Think of it this way:  a SQL result is like a bag, you get to hold a whole bunch of rows at once, but not any of them
individually; whereas, a cursor is like a pair of tweezers. With it, you can reach into the bag and grab a row, and then
move onto the next.

## Why Database Cursors are Used

The reason you may need to use a database cursor is that you need to perform actions on individual rows.

For example, consider this update statement:


<pre>
UPDATE esqlSalesPerson
SET    City = 'Saline'
WHERE  SalesPersonID < 10031
</pre>

It updates every row in the table esqlSalesPerson where the SalesPersonID is less than 10031. If, during the update
operation, there is an error, then no rows are updated. The entire update is treated as a transaction.

Now by using a cursor, we can iterate or move from one row to the next and updating rows as we go. If we encounter an
error, try something else, or skip the operation. The difference is, that when you use cursors, you can act on each row.

Also, if the cursor is defined as SCROLLABLE we can even move back to the previous row.

## Example Database Cursors in SQL

The purpose of this example isn’t to go full detail on how to build a cursor, we’ll do that in a later article, rather,
it’s to show you an example so you’ll be able to recognize them.

Consider the following select statement. We’ll use this for the basis of our cursor.

<pre>
SELECT BusinessEntityID,
       FirstName,
       LastName
FROM   Person.Person
</pre>

### Here are the general steps we do to set up a cursor:

- Declare Variables
- Declare Cursor
- Fetch values into variables
- Test Status and Loop
- Close Cursor
- Deallocate Cursor

<pre>
DECLARE @businessEntityID as INT;
DECLARE @firstName as NVARCHAR(50),
        @lastName as NVARCHAR(50);
DECLARE @personCursor as CURSOR;

SET @personCursor = CURSOR FOR
    SELECT BusinessEntityID,
           FirstName,
           LastName
    FROM  Person.Person
    OPEN @personCursor
FETCH NEXT FROM @personCursor INTO @businessEntityID, 
                                   @firstName,
                                   @lastName
WHILE @@FETCH_STATUS = 0
BEGIN
   PRINT cast(@BusinessEntityID as VARCHAR (50)) 
         + ' - ' + @firstName
         + ' ' + @lastName;
   FETCH NEXT FROM @personCursor INTO @businessEntityID, 
                                      @firstName, 
                                      @lastName
END
CLOSE @personCursor;
DEALLOCATE @personCursor;
</pre>

<br>

# Triggers

A trigger is a stored procedure in database which automatically invokes whenever a special event in the database occurs.
For example, a trigger can be invoked when a row is inserted into a specified table or when certain table columns are
being updated.

<pre>
create trigger [trigger_name] 
[before | after]  
{insert | update | delete}  
on [table_name]  
[for each row]  
[trigger_body] 
</pre>

### Explanation of syntax:

- create trigger [trigger_name]: Creates or replaces an existing trigger with the trigger_name.
- [before | after]: This specifies when the trigger will be executed.
- {insert | update | delete}: This specifies the DML operation.
- on [table_name]: This specifies the name of the table associated with the trigger.
- [for each row]: This specifies a row-level trigger, i.e., the trigger will be executed for each row being affected.
- [trigger_body]: This provides the operation to be performed as trigger is fired

### Example

SQL Trigger to problem statement.

<pre>
create trigger stud_marks
before INSERT
on
Student
for each row
set Student.total = Student.subj1 + Student.subj2 + Student.subj3, Student.per = Student.total * 60 / 100;
</pre>

Above SQL statement will create a trigger in the student database in which whenever subjects marks are entered, before
inserting this data into the database, trigger will compute those two values and insert with the entered values. i.e.,

<br>