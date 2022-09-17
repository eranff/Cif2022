Homework #2
===========

Question #1
^^^^^^^^^^^

In this problem we will practice writing some lambda.
In Question1.java you should add implementation of the Supplier
interface and print the first element that is returned by the
Supplier.
You can read about Supplier at https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html
The question has one example.
For each of the following you should create an implementation of the 
Supplier interface that returns the specified value.
In the Question1 class you will print the value returned from the supplier and
from a lambda that implements the supplier.
An example is provided in that class.
# A supplier that randomize two numbers and check whether they are equal or not.
# Current time in nano seconds from epoch (check the System class).
# A supplier that returns the current working directory (Use Paths.get("").toAbsolutePath()).
# A Random number. (Use the Math class)
# A supplier that returns the time in millisecond from epoch

Question #2
^^^^^^^^^^^

Repeat Question #1 but now use a Runnable instead of a supplier to achieve the same goal and out put. 
In addition, you will use a lambda as a veriable rather than inline it.
A scaffold is provided.
