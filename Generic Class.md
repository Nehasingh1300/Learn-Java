# Generic Class : 
It makes the code stable by detecting the bugs at compile time.

Advantages : TYPE SAFE ; Type casting is not required ;  Compile-Time Checking

**packages used are for my system**

```
Code:   Creating Generic Class
```
```
public class GenericClass<T> {
	T member;
	public void setMember(T value) {
		member = value;
	}
	public T getMember() {
		return member;
	}
	public static void main(String arg[]) {
		GenericClass<Integer> ob1 = new GenericClass<Integer>();
		ob1.setMember(10);
		System.out.println("Member is:"+ob1.getMember());
		GenericClass<Double> ob2 = new GenericClass<Double>();
		ob2.setMember(20.55);
		System.out.println("Member is:"+ob2.getMember());
		GenericClass<String> ob3 = new GenericClass<String>();
		ob3.setMember("OSOS");
		System.out.println("Sum is:"+ob3.getMember());
	}
}

/*
Member is:10
Member is:20.55
Sum is:OSOS
*/
```
```
Code : Showing same generic class foro different Datatype
```
```
package advJava;

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
	      Integer[] intArray = { 6,3,9,6 };
	      Double[] doubleArray = { 0.0,5.5,0.0,5.5,7.7,9.9};
	      Character[] charArray = { 'N','E','H','A' };

	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);   // pass a Character array
	   }
	}
output : 
Array integerArray contains:
6 3 9 6 

Array doubleArray contains:
0.0 5.5 0.0 5.5 7.7 9.9 

Array characterArray contains:
N E H A 
```

```
Code : general comparision
```
```
package advJava;


public class MaximumTest {
	   // determines the largest of three Comparable objects
	   
	   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	      T max = x;   // assume x is initially the largest
	      
	      if(y.compareTo(max) > 0) {
	         max = y;   // y is the largest so far
	      }
	      
	      if(z.compareTo(max) > 0) {
	         max = z;   // z is the largest now                 
	      }
	      return max;   // returns the largest object   
	   }
	   
	   public static void main(String args[]) {
	      System.out.printf("Max of %d, %d and %d is %d\n\n", 
	         3, 4, 5, maximum( 3, 4, 5 ));

	      System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
	         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

	      System.out.printf("Max of %s, %s and %s is %s\n","pear",
	         "apple", "orange", maximum("pear", "apple", "orange"));
	   }
	}
  
  output : 
  Max of 3, 4 and 5 is 5

Max of 6.6,8.8 and 7.7 is 8.8

Max of pear, apple and orange is pear
```
