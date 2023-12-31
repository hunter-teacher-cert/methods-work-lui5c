# Lesson 01

## Clearly Stated Learning Goal

1. SWBAT explain recursion
2. SWBAT write recursive implementations of functions that can be written recursively

## Small Warm Up Activity

Students' warm-up activity is to write a function, <code>echoBack()</code>, which takes in a String and prints out chunks of it, decaying until there is nothing left, like this:

```java
echoBack("testing!");
/* 
$ java Main
testing!
testing
testin
testi
test
tes
te
t
$
*/
```
Students should be able to implement this functionality in several ways by now, while loops and for loops are totally fine. 

A slide will be on the board showing the following potentially useful information:

```java
String temp = "hello world!";

temp.substring(0, 2); // "he"
temp.substring(2, 5); // "llo"

```

## Teacher Delivered Content

To start with, plainly write on the board that recursion is when a function calls itself.

Teacher will do a live coding example of the following pieces of code to explain what a recursive function is. 

First example: (infinite loop)
```java


public void foo(String input){
    System.out.println(input);
    foo(input);
}

public static void main(String[] args){
    foo("um");
}

```
1. Students should talk to their tables/neighbors to predict what this code will do when it is run. 
2. After students have enough time to discuss, ask students for an answer and make sure it is clear that this program runs forever, and why.
3. Is this a recursive function? _yes_.

Second example: (infinite loop)
```java


public void foo(int input){
    System.out.println(input);
    foo(input - 1);
}

public static void main(String[] args){
    foo(10); 
}

```
1. Students should talk to their tables/neighbors to predict what this code will do when it is run. 
2. After students have enough time to discuss, ask students for an answer and make sure it is clear that this program runs forever, and why.
3. Is this a recursive function? _yes_.
4. How could you make this function stop counting when it reaches 0? Talk to your tables/neighbors.
5. Once students have had enough time, explain that a simple if statement in <code>foo</code> would allow the function to stop at 0.
Explain that this if statement is what is called a base case, and that all recursive functions that ever finish running have to have a base case. 

Third example: (count up to 100 recursively)
```java


public void foo(int input){
    System.out.println(input);
    if (input < 100){
        foo(input + 1);
    }
}

public static void main(String[] args){
    foo(10); 
}

```
1. Students should talk to their tables/neighbors to predict what this code will do when it is run. 
2. After students have enough time to discuss, ask students for an answer and make sure it is clear that this program counts up to 100 from any number.
3. Is this a recursive function? _yes_.


## Student-Centered Activity

- __Part 1: Code Tracing__ (5-10 mins)

Students should get into groups and choose either fibonacci or factorial functions to represent visually. Diagrams should show each time a new function is called and show clearly when each function reaches its base case. 

- __Part 2: Coding__ (rest of class / can be homework)

DELIVERABLE:

In a single file called Recursion.java, write three __recursive__ methods:

1. __<code>factorial</code>__
This function should implement the factorial function. <code>factorial</code> should return an int.
```java
factorial(3) //  returns 6
factorial(4) //  returns 24
factorial(0) //  returns 1
```

2. __<code>fibonacci</code>__
This function should implement the Fibonacci sequence. The fibonacci sequence is a sequence of numbers where each number is found by adding the last two numbers in the sequence together. The first two numbers are 0 and 1. It goes 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
<code>fibonacci</code> should return an int.
```java
fibonacci(0) //  returns 0
fibonacci(1) //  returns 1
fibonacci(4) //  returns 3
fibonacci(7) //  returns 13
```


3. __<code>echoBack</code>__
This is the function from our warm up activity! It should behave exactly like the warm up activity specifies. Remember that Java has String.length() and String.substring(startIndex, endIndex) methods. 
```java
echoBack("hello");
echoBack("Woohoo!");
/*
hello
hell
hel
he
h
Woohoo!
Woohoo
Wooho
Wooh
Woo
Wo
W
*/
```


Early finishers can work on:
1. <code>isPalindrome()</code> - recursively checks the ends and middle of a string to return <code>true</code> or <code>false</code>.
2. <code>isLowercase()</code> - recursive function that tells you if every 



## Description of Intended Student Audience
This lesson plan is intended for students at the end of AP CS A, when they are going to be learning recursion. 

## List of Methods Used and explanation why
1. __Code Tracing__ - it's really important to be able to understand recursive functions visually, and also for teachers to know how students are conceptualizing recursion in their heads. Code Tracing is a great way for teachers to check in on and enrich students' understandings of recursion. The Code Tracing in this lesson also introduces the code that students will be required to implement, so it sets them up for success later by giving them a strong foundation upon which to write the implementation later. 
2. __Group Work__ - since this is is a new concept that is not a new method, having students go back and forth and inquire about how recursive functions can be controlled so that they don't run forever is a great opportunity for group work. This lesson has students checking in with each other a lot and as a result makes sure no one is left in the dust on a concept that is so important to understand. 

## slides/content