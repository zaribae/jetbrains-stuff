package battleship;

import java.util.Scanner;

public class Gameplay {
	private char[][] map;
	
	
	public Gameplay() {
		map = new char[10][10];
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = '~';
			}
		}
	}
	
	public void setShip(Ship ship) {
		Scanner in = new Scanner(System.in);
		int[] coordinates = null;
		boolean isCoordinatesValid = false;
		
		System.out.printf("Enter the coordinates of the %s (%d cells):\n",
                ship.getPrintName(), ship.getLength());
		while (!isCoordinatesValid) {
            coordinates = toDigitCoordinates(in.nextLine());
            try {
                isCoordinatesValid = validateCoordinates(ship, coordinates);
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage() + " Try again:");
            }
        }
		for (int i = Math.min(coordinates[0], coordinates[2]); i <= Math.max(coordinates[0], coordinates[2]); i++) {
            for (int j = Math.min(coordinates[1], coordinates[3]); j <= Math.max(coordinates[1], coordinates[3]) ; j++) {
                map[i][j] = 'O';
            }
        }
	}
	
	public void printMap() {
		char alphabet = 'A';
		
		System.out.println("  1 2 3 4 5 6 7 8 9 10");
		for (int i = 0; i < map.length; i++) {
			System.out.print(alphabet++);
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(" " + map[i][j]);
			}
			System.out.println();
		}
	}
	
	public void attackShip(Ship ship) {
		
	}
	
	private int[] toDigitCoordinates(String coordinates) {
        int[] result = new int[4];
        result[0] = coordinates.split(" ")[0].charAt(0) - 65;
        result[1] = Integer.parseInt(coordinates.split(" ")[0].substring(1)) - 1;
        result[2] = coordinates.split(" ")[1].charAt(0) - 65;
        result[3] = Integer.parseInt(coordinates.split(" ")[1].substring(1)) - 1;
        return result;
    }
	
	private boolean validateCoordinates(Ship ship, int[] coordinates) throws IllegalAccessException {
        boolean isValid = true;

        if ((coordinates[0] == coordinates[2]) == (coordinates[1] == coordinates[3])) {
            throw new IllegalAccessException("Error! Wrong ship location!");
        }
        if (Math.abs((coordinates[0] - coordinates[2]) - (coordinates[1] - coordinates[3])) + 1 != ship.getLength()) {
            throw new IllegalAccessException("Error! Wrong length of the " + ship.getPrintName() + "!");
        }
        for (int i = Math.min(coordinates[0], coordinates[2]); i <= Math.max(coordinates[0], coordinates[2]); i++) {
            for (int j = Math.min(coordinates[1], coordinates[3]); j <= Math.max(coordinates[1], coordinates[3]) ; j++) {
                if (checkNeighbors(i, j)) {
                    throw new IllegalAccessException("Error! You placed it too close to another one.");
                }
            }
        }

        return isValid;
    }
	
	private boolean checkNeighbors(int row, int col) {
        if (map[row][col] == 'O') {
            return true;
        }
        if (col > 0) {
            if (map[row][col - 1] == 'O') {
                return true;
            }
            if (row > 0) {
                if (map[row - 1][col] == 'O') {
                    return true;
                }
                if (map[row - 1][col - 1] == 'O') {
                    return true;
                }
            }
            if (row < 9) {
                if (map[row + 1][col] == 'O') {
                    return true;
                }
                if (map[row + 1][col - 1] == 'O') {
                    return true;
                }
            }
        }
        if (col < 9) {
            if (map[row][col + 1] == 'O') {
                return true;
            }
            if (row > 0) {
                if (map[row - 1][col] == 'O') {
                    return true;
                }
                if (map[row - 1][col + 1] == 'O') {
                    return true;
                }
            }
            if (row < 9) {
                if (map[row + 1][col] == 'O') {
                    return true;
                }
                if (map[row + 1][col + 1] == 'O') {
                    return true;
                }
            }
        }

        return false;
    }
	
}
