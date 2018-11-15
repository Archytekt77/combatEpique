package characters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameLoop {
	
	public Scanner sc ;
	
	public GameLoop() {
		sc = new Scanner(System.in);
	}
	
	public Characters characterCreation() {

		// lorsque l'on rentre du texte au lieu de chiffres InputMismatchException
		
		int classe = 0;

		System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3: Mage)");
		
			switch(classe = sc.nextInt()){
			case 1:
				return new Warrior();
			case 2:
				return new Ranger();
			case 3:
				return new Wizard();
			default :
				return null;
			}	
		}
	
	public void selectPlayer(Characters p) {
		try {
			System.out.println("Niveau du personnage ?");
			p.getStatistique().setLvl(sc.nextInt());
			
			System.out.println("Force du personnage ?");
			p.getStatistique().setForce(sc.nextInt());
			System.out.println("Agilité du personnage ?");
			p.getStatistique().setAgility(sc.nextInt());
			System.out.println("Intelligence du personnage ?"); 
			p.getStatistique().setIntelligence(sc.nextInt());
			if (p.getStatistique().getLvl() <= 0 || p.getStatistique().getLvl() >= 101 || p.getStatistique().getForce() <= -1 || p.getStatistique().getForce() >= 101 ||
				p.getStatistique().getAgility() <= -1 || p.getStatistique().getAgility() >= 101 || p.getStatistique().getIntelligence() <= -1 ||
				p.getStatistique().getIntelligence() >= 101 || p.getStatistique().getForce() + p.getStatistique().getAgility() + p.getStatistique().getIntelligence() 
				!= p.getStatistique().getLvl()) {
				System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");
				throw new InputMismatchException();
			}
		} catch (InputMismatchException e) {
			p.setStatistique(new Statistique(0,0,0,0));
			
		}
		if (p.getStatistique().getLvl() == 0)
			selectPlayer(p);
		p.getStatistique().setLife(p.getStatistique().getLvl()*5);
	}
	

	public void gameLoop(Characters p1, Characters p2) {
		for (int turn = 0; p1.getStatistique().getLife() !=0 && p2.getStatistique().getLife() !=0; turn++){
			if (turn % 2 == 0)
				getPlayerChoice(p1);
			else
				getPlayerChoice(p2);
			}	
	}

	public void getPlayerChoice(Characters p) {
		int response = 0;
		
		System.out.println("veuillez choisir votre action (1: Attaque basique, 2: Attaque Spéciale)");
		
		response = sc.nextInt();
		
		if (response == 1)
			p.basicAttack();
		else if (response == 2)
			p.specialAttack();
		else
			System.out.println("Vous n'avez pas sélectionné la bonne réponse.");
	}
	
}