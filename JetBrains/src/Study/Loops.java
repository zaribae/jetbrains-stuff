package Study;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int max = 0;
		int[] scan = new int[12];
		
		for (int i = 0; i < scan.length; i++) {
			scan[i] = in.nextInt();
			
			if(scan[i] % 4 == 0 && scan[i] > scan[max]) {
				max = i;
			}
		}
		
		System.out.println(max);
		
		/*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        double sum = 0;
        double rata = 0;
        
        for (double i = a; i <= b; i++) {
        	if (i % 3 == 0) {
        		sum+=i;
        		c++;
        	}
        }
        rata = sum / c;
        System.out.println(rata);*/
		//gcd(3, 7);
		//Scanner scanner = new Scanner(System.in);

	    // use this program as a source of inspiration for your method

	    //System.out.println(fullName("John", "Lennon"));
	//}
	


	/*public static int gcd(int a, int b) {
	    while (b > 0) {
	        int c = a % b;
	        a = b;
	        b = c;
	    }
	    return a;
	}
	
	public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }*/
		/*long num = 9223372036854775807, reversed = 0;

	    // run loop until num becomes 0
	    while(num != 0) {
	    
	      // get last digit from num
	      long digit = num % 10;
	      reversed = reversed * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }*/
		
	    
}}
