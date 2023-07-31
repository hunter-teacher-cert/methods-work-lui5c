public class Solution01{
	
	public static int factorial(int input){
		// base case
		if (input <= 1){
			return 1;
		}
		return input * factorial(input - 1);
	}

	public static void echoBack(String input){
		// this is like the base case
		if (input.length() > 0){
			System.out.println(input);
			echoBack(input.substring(0, input.length() - 1));
		}
	}

	public static int fibonacci(int i){
		// return i <= 1 ? i : fibonacci(i - 1) + fibonacci(i - 2); 

		// base case 
		if (i <= 1){
			return i;
		}
		int oneBefore = fibonacci(i - 1);
		int twoBefore = fibonacci(i - 2);
		return oneBefore + twoBefore;
	}

	public static boolean isPalindrome(String input){
		if (input.length() <= 1){
			return true;
		}
		boolean middle = isPalindrome(input.substring(1, input.length()-1));
		return input.charAt(0) == input.charAt(input.length()-1) && middle;
	}

	public static void main(String[] args){
		// System.out.println(factorial(3)); // prints "6"
		// System.out.println(factorial(4)); // prints "24"
		// System.out.println(factorial(0)); // prints "1"
				
		echoBack("hello");
		echoBack("Woohoo!");
		
		// System.out.println(fibonacci(0)); // prints "0"
		// System.out.println(fibonacci(1)); // prints "1"
		// System.out.println(fibonacci(4)); // prints "3"
		// System.out.println(fibonacci(7)); // prints "13"
	
		// System.out.println(isPalindrome("test"));
		// System.out.println(isPalindrome("wow"));
		// System.out.println(isPalindrome("racecar"));
		// System.out.println(isPalindrome("wttw"));
	}
	
}