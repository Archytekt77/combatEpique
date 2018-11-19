import java.util.Scanner;

import characters.Characters;
import characters.GameLoop;
import characters.Warrior;
import characters.Ranger;
import characters.Statistique;
import characters.Wizard;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String response = "O";
		
		do {
		Characters p1;
		Characters p2;
		GameLoop gameLoop = new GameLoop();
		

		p1 = gameLoop.characterCreation();
		gameLoop.statPlayer(p1);
		p1.description();
		p2 = gameLoop.characterCreation();
		gameLoop.statPlayer(p2);
		p2.description();
		
		gameLoop.gameLoop(p1, p2);
		
		System.out.println("Voulez vous recommencez (O / N) ?");
		response =  sc.nextLine();
		
		} while (response  != "O");
		
	}

	
	


}
