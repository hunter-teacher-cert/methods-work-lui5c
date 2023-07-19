# swap() and getSmallestIndexBetweenXandY()

### Description of your learning objective

SWBAT demonstrate their understanding of for loops, arrays, conditionals, and integers in a cumulative short project that culminates in helper functions for selection sort. 

### An explanation of why you kept/removed code in your scaffolded file.

I removed all of the code from two functions but kept the function declarations and heavily scaffolded the inside and definition of the methods. Main() only has two flags for students to set to true or false.


### Examples of what you might add/delete
I might add slightly more scaffolding to the methods, or more room for challenging early finishers. 

#### There are 2 parts to this assignment: 
##### 1. swap 
this function should swap the elements at indexes a and b of myArray.
```
int[] myArray = new int[]{25, 2, 18, 9};
swap(myArray, 0, 1);
System.out.println(myArray);
            => "[2, 25, 18, 9]"
```

Hint: you will proabably need a temporary variable.

Hint #2: you should be able to do this with 3 lines of code.
                    every line should have an equals sign. 

##### getSmallestIndexBetweenXandY
this method searches for the smallest element between indices x and y (including x but not including y) and returns the index of that smallest element.

inputs: int[] array, int x, int y
x is the lower bound of the search (inclusive)
y is the upper bound of the search (exclusive)
array is the array that you're searching in

 example:
 int[] myArray = new int[]{1, 2, 3, 4, 5};
 int j = getSmallestIndexBetweenXandY(myArray, 2, 5);
 System.out.println(j);
 => "3"



Part 1: swap (instructions above)
To test, set testPart1 = true below.

Part 2: getSmallestIndexBetweenXandY (instructions)
To test, set testPart2 = true below.


```java

```