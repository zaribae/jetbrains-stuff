package Project;

import java.util.Scanner;

public class GapfulNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean running = true;
		
		System.out.println("Welcome to Amazing Numbers!");
		System.out.println();
		System.out.println("Supported requests:"); 
		System.out.println("- enter a natural number to know its properties;" + 
						   "\n- enter two natural numbers to obtain the properties of the list:" +
					       "\n  * the first parameter represent a starting number;" + 
						   "\n  * the second parameters show how many consecutive numbers are to be processed;" + 
					       "\n- separate the parameters with one space;" + 
						   "\n- enter 0 to exit.");
		START :
		while(running) {
			System.out.println("Enter a request: ");
			String req = in.nextLine();
			String[] input = req.split("\\s+");
			if(input.length == 1) {
				
			}
		}
		
		
	}
	
	static boolean evenNumbers(int number) {
        if (number % 2 == 0 && number >= 1) {
            return true;
        } else {
        	return false;
        }
        
    }
	
	static boolean oddNumbers(int number) {
		if (number % 2 != 0 && number >= 1) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean buzzNum(int number) {
		if (number % 10 == 7 && number % 7 == 0 && number >= 1) {
			return true;
        } else if (number % 7 == 0 && number >= 1) {
        	return true;
        } else if (number % 10 == 7 && number >= 1) {
        	return true;
        } else {
        	return false;
        }
		
	}
	
	static boolean duckNum(int number) {
		
		if(String.valueOf(number).contains("0") && number > 1) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean palinNum(int number) {
		int sum = 0, r;
		int temp = number;
		while (number > 0) {
			r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}
	
	static int firstDigit(int number) {
		int firstD = 0;
		
		while(number != 0) {
			firstD = number % 10;
			number = number / 10;
		}
		return firstD;
	}
	
	static int lastDigit(int number) {
		int lastD = 0;
		lastD = number % 10;
		
		return lastD;
	}
	
	static boolean gapNum(int number) {
		int first = firstDigit(number);
		int last = lastDigit(number);
		
		int concatenation = first * 10 + last;
		
		return (number % concatenation == 0);
	}

}
