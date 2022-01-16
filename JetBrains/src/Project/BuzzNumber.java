package Project;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		//Buzz number adalah angka yang dapat dibagi 7 dan berakhiran 7

		Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a natural number:");
        int num = in.nextInt();
        
        checkEvenOdd(num);
        checkBuzzNum(num);
	}
	
	
	static void checkEvenOdd(int num) {
        if(num % 2 == 0) {
        	System.out.println("This number is Even.");
        }
        else if (num < 0) {
            System.out.println("This number is not a natural.");
        } else {
        	System.out.println("This number is Odd.");
        }
        
    }
	
	static void checkBuzzNum(int number) {
		if (number % 10 == 7 && number % 7 == 0 && number >= 1) {
            System.out.println("It is a Buzz number");
            System.out.println("Explanation: ");
            System.out.println(number + " is divisible by 7 and ends with 7");
        } else if (number % 7 == 0 && number >= 1) {
            System.out.println("It is a Buzz number");
            System.out.println("Explanation: ");
            System.out.println(number + " is divisible by 7");
        } else if (number % 10 == 7 && number >= 1) {
            System.out.println("It is a Buzz number");
            System.out.println("Explanation: ");
            System.out.println(number + " ends with 7");
        } else if (number % 7 != 0 && number % 10 != 7 && number >= 1) {
            System.out.println("It is not a Buzz Number");
            System.out.println("Explanation: ");
            System.out.println(number + " is neither divisible by 7 nor does it end with 7");
        }
	}
	
}
