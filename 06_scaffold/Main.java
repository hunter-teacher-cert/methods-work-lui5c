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
		

		Part 1: swap (instructions above)
		To test, set testPart1 = true below.

 		Part 2: getSmallestIndexBetweenXandY (instructions)
	 	To test, set testPart2 = true below.

 		*/

		boolean testPart1 = false;
		boolean testPart2 = false;

		
		/* DON'T TOUCH CODE BELOW HERE */
		if (testPart1){
			int[] arr1 = new int[]{0, 1, 2};
			swap(arr1, 0, 2);
			System.out.print("arr1 - should say [2, 1, 0]: ");
			System.out.println(Arrays.toString(arr1));
	
		}
		if (testPart2){
			int[] arr2 = new int[]{1, 55, 43, 9, 76, 24};
			int leftMin = getSmallestIndexBetweenXandY(arr2, 0, 3);
			int rightMin = getSmallestIndexBetweenXandY(arr2, 3, 6);
			System.out.print("leftMin and rightMin (should be 0 and 3): ");
			System.out.println(leftMin + " " + rightMin);

			int[] tester = new int[]{5, 4, 3, 2, 1};
			System.out.println(Arrays.toString(tester));
			selectionSort(tester);
			System.out.println(Arrays.toString(tester));
		
		}
		if (!testPart1 && !testPart2){
			System.out.println("Go down to main() and read the instructions fully.");
		}
  }
}