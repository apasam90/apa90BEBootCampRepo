//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] value = {1, 5, 2, 8, 13, 6};

		
		// 2. Print out the first element in the array
		System.out.println(value[1]);
	
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(value.length);
		
		// 4. Print out the element in the array at position 6, what happens?
		// When System.out.println(value[6]); an exception occurs

		
		// 5. Print out the element in the array at position -1, what happens?
		// When System.out.println(value [-1]); an exception occurs

			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i=0; i<value.length; i++) {
			System.out.println(value[i]);
		}
	
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int val: value) {
			System.out.println(val);
		}

		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int val: value) {
		sum +=val;
		System.out.println(sum);
		}

			
		// 9. Create a new variable called average and assign the average value of the array to it
		int average = sum %= value.length;
		System.out.println(average);

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int val: value) {
			if (!(val % 2==0)) {
			System.out.println(val);
			}
		}
		

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] firstName = {"Sam", "Sally", "Thomas", "Robert"} ;

		
		// 12. Calculate the sum of all the letters in the new array
		int sumOfFirstName=0;
		for (String fName: firstName) {
			sumOfFirstName +=fName.length();
		}System.out.println(sumOfFirstName);

		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		greet("Kyle");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println(greet2 ("Ethan"));

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		//13 requires no sysout to print but isn't as versatile in application as 14
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		int num =6;
		String string = "Strings";
		System.out.println(greaterThanInt(string, num));
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println(existInArray(firstName, "Sally"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println(whatsMin(value));
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] numbersToAverage = { 0.1,2.4,8.16,32.64,128.256};
		System.out.println(average(numbersToAverage));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int[] nameLength = measureStringLengths(firstName);
		for (int name : nameLength) {
			System.out.println(name);
		}

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println(checkEvenGreater(firstName));
		

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println(isPalindrome("civic"));

		
		
	}
	
// Write Methods below this line. Test Methods above it.
	
	// 13. Write and test a method that takes a String name and prints out a greeting. 
	//			This method returns nothing.
	public static void greet (String name) {
		System.out.println("Hello " + name + "!");
	}
	


	// 14. Write and test a method that takes a String name and  
	//			returns a greeting.  Do not print in the method.
	public static String greet2 (String name) {
		return "Hi " + name + "!";
	}
	
	// 15. Write and test a method that takes a String and an int and 
	//			returns true if the number of letters in the string is greater than the int
	public static boolean greaterThanInt (String string, int num) {
		if (string.length()>num) {
			return true;
		} else {
			return false;
		}
	}

	
	// 16. Write and test a method that takes an array of string and a string and 
	//			returns true if the string passed in exists in the array
	public static boolean existInArray (String[] array, String string) {
		for (String str : array)
			if (str.equals(string)) {
				return true;
			}
			return false;
	}
	
	// 17. Write and test a method that takes an array of int and 
	//			returns the smallest number in the array
	public static int whatsMin (int[] numbers) {
		int min = numbers [0];
		for (int number : numbers) {
			if (number < min) {
				min = number;
			}
		}
		return min;
		
	}

	
	// 18. Write and test a method that takes an array of double and 
	//			returns the average
	public static double average (double [] numbers) {
		double sum = 0;
		for (double number: numbers) {
			sum += number;
		} return sum / numbers.length; 
	}

	
	// 19. Write and test a method that takes an array of Strings and 
	//			returns an array of int where each element
	//			matches the length of the string at that position
	public static int[] measureStringLengths(String[] strings) {
		int[] length = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			length[i] = strings[i].length();
		}
		return length;
	}

	
	// 20. Write and test a method that takes an array of strings and 
	//			returns true if the sum of letters for all strings with an even amount of letters
	//			is greater than the sum of those with an odd amount of letters.
	public static boolean checkEvenGreater(String[] input) {
		int evenLetters = 0;
		int oddLetters = 0;
		for (String words : input) {
			if (words.length() % 2 == 0) {
				evenLetters += words.length();
			}else {
				oddLetters += words.length();
			}
		} 
		if (evenLetters > oddLetters) {
			return true;
		} else {
			return false;
		}
	}

	
	
	// 21. Write and test a method that takes a string and 
	//			returns true if the string is a palindrome
	public static boolean isPalindrome (String str) {
		String rev = "";
		for (int i = str.length() -1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		} if (str.equals(rev)) {
		 return true;
		} else {
			return false;
		}
		
	}

}