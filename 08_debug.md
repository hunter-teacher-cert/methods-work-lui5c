# Test-Driven Code Development

In this activity, you will be writing code and testing it at the same time. In order to do this, we'll be using Java's `assert`.

Assert is very similar to `if` statements, except that if the condition is false, the assertion fails and the program exits. 

`assert 1 == 1;` is a valid line of Java code. 

This snippet shows how you would test the behavior of a function called `add` using `assert`. You can also read more about assert here https://www.geeksforgeeks.org/assertions-in-java/#
```java
public class Main{
	public int add(int x, int y){
		return x + y;
	}
	
	public static void main(String[] args){
		assert add(3,4) == 7;
	}
}
```

**Step 1:** Write a test for what `swap()` should do.

**Step 2:** Implement `swap()` and see if it passes your tests.
- if it fails: is it `swap()`'s fault? or your tests' fault?

**Step 3:** Write a test for what getSmallestIndexBetweenXandY() should do.

**Step 4:** Implement `getSmallestIndexBetweenXandY()` and see if it
				passes your tests. 

**Step 5:** Write a test for what `selectionSort()` should do.

**Step 6:** See if `selectionSort()` passes your tests.


Starter Code:
```java
import java.util.*;

class Main {
	/*
 			private int[] swap(int a, int b)

	this function should swap the elements at indexes a and b
 	of myArray.
	int[] myArray = new int[]{25, 2, 18, 9};
 	swap(myArray, 0, 1);
	System.out.println(myArray);
 				=> "[2, 25, 18, 9]"

	 Hint: you will proabably need a temporary variable.

 	Hint #2: you should be able to do this with 3 lines of code.
						every line should have an equals sign. 
 	*/
	private static void swap(int[] array, int a, int b){
		// your code here
	}// end swap()

	
	/* 
 			private int getSmallestIndexBetweenXandY()

	this method searches for the smallest element between
 	indices x and y (including x but not including y) and
 	returns the index of that smallest element.

			inputs: int[] array, int x, int y
	x is the lower bound of the search (inclusive)
	y is the upper bound of the search (exclusive)
    array is the array you're looking through

 example:
 int[] myArray = new int[]{1, 2, 3, 4, 5};
 int j = getSmallestIndexBetweenXandY(myArray, 2, 5);
 System.out.println(j);
 => "3"
	
	*/
	private static int getSmallestIndexBetweenXandY(int[] array, int x, int y){
		// here, create a variable called minIndex that will store 
		// the index of the smallest index.

		// write a loop that will compare the value 
		// of every element FROM index x TO y with the value
		// of the element at minIndex. if the loop finds an 
		// element that is smaller than the element at minIndex,
		// it should overwrite minIndex with that element's index.

		// .... delete me and write a loop here...
	
		return minIndex;//
	} // end getSmallestIndex

	/* 
 			DON'T MODIFY THIS!
			See if you can understand what each part of the code is doing.
			This method uses the methods you wrote to sort an array.
 */

	private static void selectionSort(int[] array){
		int i = 0;
		while (i < array.length){
			swap(array, i, getSmallestIndexBetweenXandY(array, i, array.length));
			i++;
		} // end while loop
	} // end selectionSort
	
  public static void main(String[] args) {

		/* DRIVER CODE

 		There are 2 parts to this assignment: 
	 		1. swap 
		 	2. getSmallestIndexBetweenXandY
		These methods are declared above, but you need to complete them.
		

		Step 1: Write a test for what swap() should do.
		Step 2: Implement swap() and see if it passes your tests.
			- if it fails: is it swap()'s fault? or your tests' fault?
	 	
	 	Step 3: Write a test for what getSmallestIndexBetweenXandY() should do.
	 	Step 4: Implement getSmallestIndexBetweenXandY() and see if it
	 					passes your tests. 

		Step 5: Write a test for what selectionSort() should do.
		Step 6: See if selectionSort() passes your tests.

 		*/

		
		
  }
}
```