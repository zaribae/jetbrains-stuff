package battleship;

public class Main {

	public static void main(String[] args) {
		Gameplay game = new Gameplay();
		game.printMap();
		
		for (Ship ship : Ship.values()) {
            game.setShip(ship);
            game.printMap();
        }
	}

}
