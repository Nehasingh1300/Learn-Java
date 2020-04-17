Comparator Interface in Java with Examples<br>
Comparator interface is used to order the objects of user-defined classes. A comparator object is capable of comparing two objects of two different classes. Following function compare obj1 with obj2<br><br>

Syntax:<br>

public int compare(Object obj1, Object obj2):
<br>Suppose we have an array/arraylist of our own class type, containing fields like rollno, name, address, DOB etc and we need to sort the array based on Roll no or name?
<br><br>



Method 1: One obvious approach is to write our own sort() function using one of the standard algorithms. This solution requires rewriting the whole sorting code for different criterion like Roll No. and Name.
<br><br>
Method 2: Using comparator interface- Comparator interface is used to order the objects of user-defined class. This interface is present in java.util package and contains 2 methods compare(Object obj1, Object obj2) and equals(Object element). Using comparator, we can sort the elements based on data members. For instance it may be on rollno, name, age or anything else.
<br><br>
Method of Collections class for sorting List elements is used to sort the elements of List by the given comparator.
