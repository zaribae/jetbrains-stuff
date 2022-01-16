package cinema;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int numOfRows = in.nextInt();
		System.out.print("Enter the number of seats in each row: ");
		int numOfSeats = in.nextInt();
		
		Seats cinema = new Seats(numOfRows, numOfSeats);
		cinema.start();
		
	}
	
}
