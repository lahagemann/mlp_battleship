import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ships.*;
import util.*;



public class Main {
	
	static List<Ship> ships;
	static int table[][];
	
	public static void initTable() {
		for (int i = 0; i < table.length; i++) 
			for (int j = 0; j < table[i].length; j++) 
				table[i][j] = 0;
	}

	public static void initDestroyers() {
		Random random = new Random();
		
		for(int i = 0; i < 3; i++) {
			// select random position in table where ship fits.
			// this is the middle of the ship
			int randomX = random.nextInt(14) + 1;
			int randomY = random.nextInt(14) + 1;
			
			boolean valid = false;
			
			while(!valid) {
				if(table[randomX-1][randomY] == 0 && table[randomX+1][randomY] == 0 && table[randomX][randomY] == 0) {
					Destroyer d = new Destroyer(randomX-1, randomY, randomX, randomY, randomX+1, randomY);
					ships.add(d);
					
					table[randomX-1][randomY] = 3;
					table[randomX][randomY] = 3;
					table[randomX+1][randomY] = 3;
					
					valid = true;
				} else if (table[randomX][randomY-1] == 0 && table[randomX][randomY] == 0 && table[randomX][randomY+1] == 0) {
					Destroyer d = new Destroyer(randomX, randomY-1, randomX, randomY, randomX, randomY+1);
					ships.add(d);
					
					table[randomX][randomY-1] = 3;
					table[randomX][randomY] = 3;
					table[randomX][randomY+1] = 3;
					
					valid = true;
				} else {
					randomX = random.nextInt(14) + 1;
					randomY = random.nextInt(14) + 1;
				}
			}
		}
	}
	
	public static void initSubmarines() {
		Random random = new Random();
		
		for(int i = 0; i < 4; i++) {
			// select random position in table where ship fits.
			// this is the middle of the ship
			int randomX = random.nextInt(14);
			int randomY = random.nextInt(14);
			
			boolean valid = false;
			
			while(!valid) {
				if(table[randomX+1][randomY] == 0 && table[randomX][randomY] == 0) {
					Submarine s = new Submarine(randomX, randomY, randomX+1, randomY);
					ships.add(s);
					
					table[randomX][randomY] = 2;
					table[randomX+1][randomY] = 2;
					
					valid = true;
				} else if (table[randomX][randomY] == 0 && table[randomX][randomY+1] == 0) {
					Submarine s = new Submarine(randomX, randomY, randomX, randomY+1);
					ships.add(s);
					
					table[randomX][randomY] = 2;
					table[randomX][randomY+1] = 2;
					
					valid = true;
				} else {
					randomX = random.nextInt(14);
					randomY = random.nextInt(14);
				}
			}
		}
	}
	
	public static void initMines() {
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			int randomX = random.nextInt(15);
			int randomY = random.nextInt(15);
			
			boolean valid = false;
			
			while(!valid) {
				if(table[randomX][randomY] == 0) {
					Mine m = new Mine(randomX, randomY);
					ships.add(m);
					
					table[randomX][randomY] = 1;
					
					valid = true;
				} else {
					randomX = random.nextInt(15);
					randomY = random.nextInt(15);
				}
			}	
		}
	}
	
	public static void initShips() {
		initDestroyers();
		initSubmarines();
		initMines();
	}
	
	public static boolean hitShip(int x, int y) {
		
		for (int i = 0; i < ships.size(); i++) {
			if(ships.get(i) instanceof Mine) {
				Mine m = (Mine)ships.get(i);
				if (m.hitThisShip(x, y)) {
					table[x][y] = 4;
					return true;
				}
			} else if(ships.get(i) instanceof Submarine) {
				Submarine s = (Submarine)ships.get(i);
				if(s.hitThisShip(x, y)) {
					table[x][y] = 5;
					return true;
				}
			} else if(ships.get(i) instanceof Destroyer) {
				Destroyer d = (Destroyer)ships.get(i);
				if(d.hitThisShip(x, y)) {
					table[x][y] = 6;
					return true;
				}
			}
		}
		return false;
	}
	
	public static void removeDownedShips() {
		// only one ship is downed at once.
		int removeIndex = 0;
		
		for (int i = 0; i < ships.size(); i++) {
			if(ships.get(i).isShipDown()){
				removeIndex = i;
			}
		}
		
		ships.remove(removeIndex);
	}
	
	public static void main(String[] args) throws IOException {
		ships = new ArrayList<Ship>();
		table = new int[15][15];
		
		initTable();
		initShips();

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		
		while(ships.size() > 0)
		{
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					System.out.print(table[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.print("Enter x: ");
			int x = System.in.read();
			System.out.print("\nEnter y: ");
			int y = System.in.read();
			
			hitShip(x, y);
			
			removeDownedShips();
		}
		
		
		System.out.println("YOU WON!");
	}
}
