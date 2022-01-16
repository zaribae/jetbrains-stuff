package Project;

import java.util.Scanner;

public class CinemaSeats {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");int numOfRows = in.nextInt();
		System.out.print("Enter the number of seats in each row: ");int numOfSeats = in.nextInt();
		
		String[][] arr = new String[numOfRows][numOfSeats];
		fillCinemaSeats(arr);
		
		int choice;
		do {
			System.out.println("\n1. Show the seats");
			System.out.println("2. Buy a ticket");
			System.out.println("0. Exit");
			choice = in.nextInt();
			
			if (choice == 1) {
				printCinemaLayout(arr);
			} else if (choice == 2) {
				System.out.print("Enter a row number: ");
				int rowNum = in.nextInt();
				
				System.out.print("Enter a seat number in that row: ");
				int seatNum = in.nextInt();
				
				System.out.println("\nTicket price: $" + seatPrice(arr, rowNum));
				bookedSeat(arr, rowNum, seatNum);
			}
		} while (choice != 0);
	}
	
	public static void printCinemaLayout(String[][] arr) {
        System.out.println("\nCinema:");
        for (int i = 0; i < arr[0].length + 1; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int row = 0; row < arr.length; row++) {
            System.out.print(row + 1 + " ");
            for (int seat = 0; seat < arr[row].length; seat++) {
                System.out.print(arr[row][seat] + " ");
            }
            System.out.println();
        }
    }
	
	public static void fillCinemaSeats(String[][] arr) {
	       for (int row = 0; row < arr.length; row++) {
	           for (int seat = 0; seat < arr[row].length; seat++) {
	               arr[row][seat] = "S";
	           }
	       }
	}
	
	public static void bookedSeat(String[][] arr, int rowNumber, int seatNumber) {
		arr[rowNumber - 1][seatNumber - 1] = "B";
    }
	
	public static int seatPrice(String[][] arr, int rowNumber) {
	       int price = 0;

	       if (arr.length * arr[0].length <= 60) {
	           price = 10;
	       } else {
	           if (rowNumber <= arr.length / 2) {
	        	   price = 10;
	           } else {
	               price = 8;
	           }
	       }

	       return price;
	}
	
	

}
