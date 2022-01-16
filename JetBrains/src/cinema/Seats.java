package cinema;

import java.util.Scanner;

public class Seats {
    private String[][] arr;
	private int rowNumber = 0;
	private int purchasedSeats = 0;
	private int currentIncome = 0;
	
	public Seats(int numOfRows, int numOfSeats) {
		arr = new String[numOfRows][numOfSeats];
		fillSeats(arr);
	}
	
	public void start() {
		Scanner in = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.println("\n1. Show the seats\r\n"
					+ "2. Buy a ticket\r\n"
					+ "3. Statistics\r\n"
					+ "0. Exit");
			int pick = in.nextInt();
			
			if (pick == 1) {
				showSeats(arr);
				continue;
				
			} else if (pick == 2) {
				while (true){
					try {
						System.out.print("\nEnter a row number: ");
						int rowNum = in.nextInt();
						rowNumber = rowNum;
						System.out.print("Enter a seat number in that row: ");
						int seatNum = in.nextInt();

						if (arr[rowNum - 1][seatNum - 1] != "B") {
							System.out.println("\nTicket price : $" + seatPrice(arr, rowNum));
							purchasedSeats++;
							currentIncome += seatPrice(arr, rowNumber);
							buyedSeats(arr, rowNum, seatNum);
							break;
						} else if (arr[rowNum - 1][seatNum - 1] == "B") {
							System.out.println("\nThat ticket has already been purchased!");
						}
					
					} catch (Exception e) {
						System.out.println("\nWrong input!");
					}
				}
			
			} else if (pick == 3) {
				printStatistic(arr, rowNumber);
				
			} else if (pick == 0) {
				break;
			} else {
				System.out.println("Enter a correct number!");
			}
				
		}
	}
	
	private void fillSeats(String[][] arr) {
	       for (int row = 0; row < arr.length; row++) {
	           for (int seat = 0; seat < arr[row].length; seat++) {
	               arr[row][seat] = "S";
	           }
	       }
	}
	
	private void showSeats(String[][] arr) {
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
	
	private int seatPrice(String[][] arr, int rowNumber) {
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
	
	private String buyedSeats(String [][] arr, int rowNum, int seatNum) {
		return arr[rowNum - 1][seatNum - 1] = "B";
	}

	private float percentageBuyed(String[][] arr) {
		int total = arr.length * arr[0].length;
		float result = ((float) purchasedSeats / total) * 100;
		return result;
	}

	private int totalIncome(String[][] arr, int rowNum) {
		int frontRows = 0;
		int backRows = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr.length * arr[0].length <= 60) {
					frontRows++;
				} else {
					if (i < Math.floor(arr.length / 2)) {
						frontRows++;
					} else {
						backRows++;
					}
				}
			}
		}
		
		int totalIncome = (frontRows * 10) + (backRows * 8);

		return totalIncome;
	}
	
	private void printStatistic(String[][] arr, int rowNumber) {
		System.out.println("\nNumber of purchased tickets : " + purchasedSeats);
		System.out.printf("Percentage: %.2f%%", percentageBuyed(arr));
		System.out.println("\nCurrent income: $" + currentIncome);
		System.out.println("Total income: $" + totalIncome(arr, rowNumber));

	}
}
