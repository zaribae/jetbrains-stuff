package Study;

import java.util.Scanner;

public class MultiDimenArray {

	public static void main(String[] args) {
//		int[][] arr = {
//				{0,0,9,9},
//				{1,2,3,4},
//				{5,6,7,8},
//		};
//		
//		reverseArrayElement2D(arr);
		availableSeats();
//		Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[][] arr = new int[n][n];
//        
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = Math.abs(i - j);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
	}
	
	public static void reverseRowColumnArray2D() {
		Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr2D = new int[row][col];
        int[][] arr2dRot = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr2dRot[i][j] = arr2D[row - j - 1][i];
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr2dRot[i][j] + " ");
            }
            System.out.println();
        }
	}
	
	public static void reverseArrayElement2D(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	
	public static void availableSeats() {
		Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int count = 0;
        
        int[][] array = new int[row][col];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = in.nextInt();
            }
        }
        
        int k = in.nextInt();
        
        for (int i = 0; i < array.length; i++) {
        	for (int j = 0; j < array[i].length; j++) {
        		System.out.print(array[i][j] + " ");
        	}
        	System.out.println();
        }
	}

}
