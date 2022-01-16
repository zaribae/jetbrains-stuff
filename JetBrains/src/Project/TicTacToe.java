package Project;

import java.util.Scanner;

public class TicTacToe {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		 System.out.print("Enter cells: ");
	     String stage = in.nextLine();
	        // write your code here
	     int index = 0;
	     System.out.println("---------");
	     for(int i=1;i<=3;i++){
	         System.out.print("| ");
	         for(int j=1;j<=3;j++){
	            System.out.print(stage.charAt(index++)+" ");
	         }
	         System.out.println("|");
	     }
	     System.out.println("---------");
	}
	

}
