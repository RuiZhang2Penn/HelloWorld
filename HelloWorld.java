package hw7;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		/*
		 * Prints "Hello World!".
		 */
		
		System.out.println("Hello, World!");
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		
		/*
		 * Say Hello
		 * Gets input of full name (first name and last name, separated by a space).
		 * Prints "Hello, <full name>!".
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your full name (first name and last name separated by a space): ");
		String fullName = scanner.nextLine().trim();
		System.out.println("Hello, " + fullName + "!");
			
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		
		/*
		 * Add Five Numbers
		 * Gets input of numbers (ints or doubles), and prints the sum (as a double) of all the numbers each time.
		 */
		
		System.out.println("Enter a total of 5 numbers (ints or doubles), and hit enter after each"
				+ " to get the sum: ");
		
		int count = 0;
		double sum = 0.0;
		
		while(count < 5) {
			double num = scanner.nextDouble();
			sum += num;
			count++;
			
			System.out.println("Sum: " + sum);
		}
		
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		
		/*
		 * Even or Odd
		 * Gets integer input and prints if it's even or odd.
		 */
		
		System.out.println("Enter an integer to see if it's even or odd: ");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {	
			System.out.println(num + " is odd");
		}
		
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		
		/*
		 * Prime or Composite
		 * Gets positive integer input and prints if it's prime, composite, or 1.
		 * 
		 * Note: You can test with prime numbers:
		 * 2, 3, 5, 7, 11, 13, 17, 19, 23,
		 * 29, 31, 37, 41, 43, 47, 53, 59,
		 * 61, 67, 71, 73, 79, 83, 89, 97,
		 * 101, 103, 107, 109, 113, 127,
		 * 131, 137, 139, 149, 151, 157,
		 * 163, 167, 173, 179, 181
		 */
		
		//Get input of positive integer
		System.out.println("Enter a positive integer to see if it's prime or composite: ");
		int positiveInt = scanner.nextInt();
		
		//Determine if prime or composite
		boolean isPrime = true;
		if (positiveInt > 1) {
			for (int i = 2; i < positiveInt; i++) {
				if (positiveInt % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		//If prime
		if (isPrime) {
			System.out.println(positiveInt + " is prime");	
		//Else, if composite
		} else {
			System.out.println(positiveInt + " is composite");
		}
		
		//If 1
		if (positiveInt == 1) {
			System.out.println("1");
		}
				
		System.out.println("");
		System.out.println("----------");
		System.out.println("");

		
		/*
		 * Convert Seconds to Time
		 * Gets input of some number of seconds (as an int) and converts it to hours:minutes:seconds.
		 * If input seconds is 0, print output in the format: 0:0:0
		 * If input seconds is negative, print output in the format: -1:-1:-1  
		 */
		
		System.out.println("Enter a number of seconds (as an int) to convert it to hours:minutes:seconds: ");
		int seconds = scanner.nextInt();
		
		String result = "";
		if (seconds < 0) {
	    	result = "-1:-1:-1";
	    	System.out.println(result);
		}
		
		int p1 = seconds % 60; //seconds
		int p2 = seconds / 60; //minutes
		int p3 = p2 % 60; //remaining minutes
		
		p2 = p2 / 60; //hours
		result = p2 + ":" + p3 + ":" + p1; //full time
		System.out.println(result);
		
		scanner.close();
		
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		
		/*
		 * Say Goodbye
		 * Prints "goodbye, <full name>!".
		 */
		
		System.out.println("Goodbye, " + fullName + "!");
	}
}