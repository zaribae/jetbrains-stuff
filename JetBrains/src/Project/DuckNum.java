package Project;

import java.util.Scanner;

public class DuckNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        long userNumber = scanner.nextLong();
        
        if (userNumber <= 0) {
        	System.out.println("This number is not natural!");
        } else {
        	System.out.println("Properties of " + userNumber);
            evenNumbers(userNumber);
            oddNumbers(userNumber);
            buzzNum(userNumber);
            duckNum(userNumber);
        }
       
	}
	//NANTI GANTI LAGI KE INT YA!!!!
	static void evenNumbers(long number) {
        if (number % 2 == 0 && number >= 0) {
            System.out.println("\teven: true");
        } else {
        	System.out.println("\teven: false");
        }
        
    }
	
	static void oddNumbers(long number) {
		if (number % 2 != 0 && number >= 1) {
			System.out.println("\t odd: true");
		} else {
			System.out.println("\t odd: false");
		}
	}
	
	static void buzzNum(long number) {
		if (number % 10 == 7 && number % 7 == 0 && number >= 0) {
            System.out.println("\tbuzz: true");
        } else if (number % 7 == 0 && number >= 0) {
            System.out.println("\tbuzz: true");
        } else if (number % 10 == 7 && number >= 0) {
            System.out.println("\tbuzz: true");
        } else if (number % 7 != 0 && number % 10 != 7 && number >= 0) {
            System.out.println("\tbuzz: false");
        }
	}
	
	static void duckNum(long number) {
		
		if(String.valueOf(number).contains("0") && number > 0) {
			System.out.println("\tduck: true");
		} else {
			System.out.println("\tduck: false");
		}
	}

}
