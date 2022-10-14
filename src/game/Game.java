package game;

import java.util.Scanner;

public class Game {
	
	static int x= 0, y = 0;
	static int x1 = 9, y1 = 9;
	
	public static void turn() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(x==x1 && y==y1) {
					System.out.println("Lose");
					return;
				}
				
				if(i == x && j == y) {
					System.out.print("O ");
					continue;
				}
				if(i == x1 && j == y1) {
					System.out.print("X ");
					continue;
				}
				
				System.out.print("■ ");
			}
			System.out.println();
		}
	}
	
	public static void move(String key) {
		switch (key) {
		case "w" : if(x > 0) x-=1; break;
		case "a" : if(y > 0) y-=1; break;
		case "s" : if(x < 9) x+=1; break;
		case "d" : if(y < 9) y+=1; break;
			default : break;
		}
	}
	
	public static void enemy() {
		if(Math.abs(x-x1) > Math.abs(y-y1)) {
			if(x >= x1) {
				x1++;
			} else {
				x1--;
			}
		} else {
			if(y >= y1) {
				y1--;
			} else {
				y1--;
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		turn();
		
		do {
		
			String way = scan.next();
			move(way);
			enemy();
			turn();
			
		} while(true);		
	}

}
