package characters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameLoop {
	
	public Scanner sc ;
	
	public GameLoop() {
		sc = new Scanner(System.in);
	}
	
	
	public Characters characterCreation() {
		
		Characters p = null;
		int classe = 0;
		
		System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3: Mage)");
		classe = sc.nextInt();
		switch(classe){
		case 1:
			return new Warrior();
		case 2:
			return new Ranger();
		case 3:
			return new Wizard();
		}
		if (classe != 1 || classe != 2 || classe != 3)
			throw new InputMismatchException();
			
		return p;
		}
	
	
	public void statPlayer(Characters p) {
		try {
			System.out.println("Niveau du personnage ?");
			p.getStatistique().setLvl(sc.nextInt());
			System.out.println("Force du personnage ?");
			p.getStatistique().setForce(sc.nextInt());
			System.out.println("Agilité du personnage ?");
			p.getStatistique().setAgility(sc.nextInt());
			System.out.println("Intelligence du personnage ?");
			p.getStatistique().setIntelligence(sc.nextInt());
			if (p.getStatistique().getLvl() <= 0 || p.getStatistique().getLvl() >= 101
					|| p.getStatistique().getForce() <= -1 || p.getStatistique().getForce() >= 101
					|| p.getStatistique().getAgility() <= -1 || p.getStatistique().getAgility() >= 101
					|| p.getStatistique().getIntelligence() <= -1 || p.getStatistique().getIntelligence() >= 101
					|| p.getStatistique().getForce() + p.getStatistique().getAgility()
							+ p.getStatistique().getIntelligence() != p.getStatistique().getLvl()) {
				System.out.println(
						"Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");
				throw new InputMismatchException();
			}
		} catch (InputMismatchException e) {
			 p.setStatistique(new Statistique(0, 0, 0, 0));
			sc = new Scanner(System.in);
			statPlayer(p);
		}
		 p.getStatistique().setLife(p.getStatistique().getLvl() * 5);
	}
	

	public void gameLoop(Characters p1, Characters p2) {
		for (int turn = 0; p1.getStatistique().getLife() != 0 && p2.getStatistique().getLife() != 0; turn++){
			if (turn % 2 == 0) {
				getPlayerChoice(p1, p2, "Joueur 1 ", "Joueur 2");
			}
			else {
				getPlayerChoice(p2, p1, "Joueur 2 ", "Joueur 1");
			}
			}	
	}

	
	public void getPlayerChoice(Characters p1, Characters p2, String str, String str2) {
		try {
			int response = 0;
			
			System.out.println(str + "(" + p1.getStatistique().getLife() + " Vitalité) veuillez choisir votre action (1: Attaque basique, 2: Attaque Spéciale)");
			response = sc.nextInt();
			
			if (response == 1) {
				p2.getStatistique().setLife(p2.getStatistique().getLife() - p1.basicAttack(str, str2));
			}
			if (response == 2 && p1.getStatistique().getForce() > 0) {
				p2.getStatistique().setLife(p2.getStatistique().getLife() - p1.specialAttack(str, str2));
				p1.getStatistique().setLife(p1.getStatistique().getLife() - p1.getStatistique().getForce()/2);
			}
			if (response == 2 && p1.getStatistique().getAgility() > 0) {
				p1.getStatistique().setAgility(p1.getStatistique().getAgility() + p1.specialAttack(str, str2));
			}
			if (response == 2 && p1.getStatistique().getIntelligence() > 0) {
				p1.getStatistique().setLife(p1.getStatistique().getLife() + p1.specialAttack(str, str2));
			}
					
			if (response != 1 && response != 2) {
				System.out.println("Vous n'avez pas choisis entre 1 et 2.");
				throw new InputMismatchException();
			}
		} catch (InputMismatchException e) {
			sc = new Scanner(System.in);
			getPlayerChoice(p1, p2, str, str2);
		}
	}
	
}