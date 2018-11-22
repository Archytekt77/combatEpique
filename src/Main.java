import java.util.InputMismatchException;
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

			Characters p1;
			Characters p2;
			GameLoop gameLoop = new GameLoop();
			
			p1 = createPlayer("Joueur 1");
			p2 = createPlayer("Joueur 2");
			
			gameLoop.gameLoop(p1, p2);
			
			restart();
	}
	
	public static String restart() {
		
		String question = null;
		
		System.out.println("Voulez vous recommencez (O / N) ?");
		question =  sc.nextLine();
		
		switch (question) {
		case "O":
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("NOUVELLE PARTIE");
			main(null);
		case "N":
			System.out.println("Au revoir !");
			System.exit(0);
		}
		if (question != "O" || question != "N") {
			sc = new Scanner(System.in);
			restart();
			throw new InputMismatchException();
		}
		return null;
		
		/*
		try{
			String question = null;
			
			System.out.println("Voulez vous recommencez (O / N) ?");
			question =  sc.nextLine();
			
			if (question == "O") {
				main(null);
			}
			if (question == "N") {
				System.out.println("Au revoir");
			}
			if (question != "O" || question != "N") {
				throw new InputMismatchException();
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Vous n'avez pas sélectionnez O ou N");
			sc = new Scanner(System.in);
			restart();
		}*/
	}

	public static Characters createPlayer(String str) {
		Characters p = null;
		
		try {
			GameLoop gameLoop = new GameLoop();
			
			p = gameLoop.characterCreation();
			gameLoop.statPlayer(p);
			p.description(str);
		} catch (InputMismatchException e) {
			return createPlayer(str);
		}
		return p;
	}
}
