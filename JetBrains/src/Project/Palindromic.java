package Project;

import java.util.Scanner;

public class Palindromic extends DuckNum {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean running = true;
		
		System.out.println("Welcome to Amazing Numbers!");
		System.out.println();
		System.out.println("Supported request:"); 
		System.out.println("- enter a natural number to know its properties");
		System.out.println("- enter 0 to exit.");
		START:
		while(running) {
			System.out.print("\nEnter a request: ");
			long userNum = in.nextLong();
			if (userNum < 0) {
				System.out.println("The first parameter should be a natural number or zero.");
			} else if (userNum > 0) {
				System.out.println("\nProperties of " + userNum);
	            evenNumbers(userNum);
	            oddNumbers(userNum);
	            buzzNum(userNum);
	            duckNum(userNum);
	            palinNum(userNum);
	            continue START;
			} else {
				System.out.println("Goodbye!");
				break;
			}
		}
	}
	
	static void palinNum(long number) {
		long sum = 0, r;
		long temp = number;
		while (number > 0) {
			r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}
		if (temp == sum) {
			System.out.println(" palindromic: true");
		} else {
			System.out.println(" palindromic: false");
		}
	}

}
