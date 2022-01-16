package Study;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        // start coding here
		int input;
        boolean asc = true;
        
        do {
        	input = in.nextInt();
        	if (input - 1 < input + 1) {
        		asc = false;
        	} else {
        		asc = true;
        	}
        } while (input != 0);
        
        System.out.println(asc);
	}

}
