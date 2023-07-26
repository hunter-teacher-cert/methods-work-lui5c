# Lesson 0
2. Intended for students of an AP CS A class.
3. Lesson 00 will be day 2 of arrays. On day 1 of arrays, we will have introduced and done proof-of-concept exit tickets for accessing indexes in arrays, initializing arrays, and doing simple for loops of arrays. students only need to be comfortable accessing elements in the array. the lesson will be a lab where we implement a caesar cipher using an array of letters.
methods i'll use for lesson 00:
live coding
scaffolding
I think the program complexity will still be relatively low, so I think each student should be doing their own coding. live coding will be demoing the modulo operator and reviewing accessing strings using charAt OR making a String[] array of one-letter Strings and accessing that array.

## Learning Goal
SWBAT confidently navigate 0-based indexing to reference, manipulate, and create their own strings. 

SWBAT apply their understandings of the Caesar cipher and String indexing to create a program
that encrypts plaintexts under a customizable Caesar cipher.


### Small warm-up activity
Students will be asked to create a program that takes a String, <code>plaintext</code>, and prints each character from that String on its own line. This hint will be on the screen:

```java
System.out.println("ABC".charAt(0)); // prints "C"
```

Early finishers can wrap this functionality in a function and pass plaintext to that function.

Review warm-up activity together and make sure that students all have a minimum working example that does the required task.

Completed code should resemble:
```java
public class Main{
    public static void main(String[] args){
        String plaintext = "hello world!";
        
        for (int i = 0; i < plaintext.length(); i++){
            System.out.println(plaintext.charAt(i));
        }
    }
}
```

### Teacher delivered content
Teacher showcases important stepping stones of the solution without showing the solution. Each example will include several practice examples that students must participate in.
1. how a Caesar cipher works - [video](https://www.youtube.com/watch?v=l6jqKRXSShI)
2. <code>charAt()</code>
```java
String a = "Acknowledgements";
String b = "Moo";

// how do I use a to print the letter k?

// what will the line below print?
System.out.println(b.charAt(b.length()-1));
// what will happen if i run the line below?
System.out.println(b.charAt(3));
```
3. <code>indexOf()</code>
```java
String a = "Acknowledgements";

int myInt = a.indexOf("A"); // myInt = ?
myInt += 10;                // myInt = ?
char c = a.charAt(myInt);   // c = ?
```
4. showcase of working program - working code [here](https://replit.com/@LuisCollado1/lesson0001#Solution00.java)


### Student-centered activity
DELIVERABLE:
A program that will shift each letter in a plaintext String by a certain amount of letters. It should be easy to change how many letters your program shifts by. You can assume that the shifts will only be between -25 and 25. Your program is only required to do one word each time that it is run.

__Resources__:
- [charAt()](https://www.w3schools.com/java/ref_string_charat.asp)
- [indexOf()](https://www.w3schools.com/java/ref_string_indexof.asp)
- [Java String methods](https://www.w3schools.com/java/java_ref_string.asp)
- [Modulo](https://www.javatpoint.com/java-modulo)
- [Caesar Cipher Video](https://www.youtube.com/watch?v=l6jqKRXSShI)

__How to test your code:__
- shifting "a" by 1 should be "b"
- shifting "b" by -1 should be "a"
- shifting "a" by -1 should be "z"
- plug your output back in as input and you should get your original input

__Exceeding Expectations__:
Have your program implement features seen in the example, such as:
- create a REPL inside of your program, with a simple prompt
- have your program be able to shift by any integer