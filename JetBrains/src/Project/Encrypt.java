package Project;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a == b && a == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}
}
