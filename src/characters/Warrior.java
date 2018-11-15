package characters;

public class Warrior implements Characters{
	
	private Statistique statistique;
	
	
	public Warrior() {
		statistique = new Statistique();
	}
	
	String cry = "Woarg";
	

	@Override
	public void basicAttack() {
		System.out.println(" utilise Coup d'�p�e et inflige " + statistique.getForce() + " dommages");
		
	}

	@Override
	public void specialAttack() {
		System.out.println(" utilise Coup de Rage et inflige "  + statistique.getForce()*2 + " dommages");
		
	}

	@Override
	public void description() {
		System.out.println(cry + " je suis le Warrior niveau " + statistique.getLvl() + " je poss�de " + statistique.getLife() + " de vitalit�, " 
				+ statistique.getForce() + " de force, " + statistique.getAgility() + " d'agilit� et " + statistique.getIntelligence() + " d'intelligence !");
		
	}

	@Override
	public void setStatistique(Statistique s) {
		statistique = s;
	}

	@Override
	public Statistique getStatistique() {
		return statistique;
	}
	
	

}
